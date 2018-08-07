package restaurant.sa.com.sarestaurant.appview.restaurant

import android.content.Context
//import restaurant.sa.com.sarestaurant.model.models.Result
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.fragment_restaurant.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocationImp
import restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.LinearLayoutManageScroll
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenterImp
import restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient.GooglePlacesClient
import restaurant.sa.com.sarestaurant.appview.restaurant.view.RestaurantView
import restaurant.sa.com.sarestaurant.utils.PermissionUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestaurantFragment: Fragment(), RestaurantView {

    lateinit var homeActivity: HomeActivity
    var permissionList = arrayOf<String>(android.Manifest.permission.ACCESS_FINE_LOCATION)
    var granted = false
    private val TAG = "RestaurantFragment"
    var currentLocation: Location? = null
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    val result_type = "restaurant"
    val BASE_URL = "https://maps.googleapis.com"
    lateinit var restaurantPresenterImp: RestaurantPresenterImp
    var locationCommunication: LocationCommunication? = null
    var restaurantView: RestaurantView? = null
    val radius = 2000
    val sensor = true
    var isScrolling : Boolean = false
    var currentItems: Int = 0
    var scrolledOutItems: Int = 0
    var totalItems: Int = 0
    lateinit var layout: LinearLayoutManageScroll
    lateinit var listOfPlacesLocation: ArrayList<LatLng>
    lateinit var listOfTitleImgModel: ArrayList<TitleImgModel>
    var isRetrofitCall = false
    lateinit var listOfModel :ArrayList<Result>
    var adapter: RestListAdapter? = null
    lateinit var resultList: ArrayList<Result>
    var c = 0
    var start = 6
    var x = 0
    var total = 0
    var stop = 0
    var isLoading = false
    var totalListSize: Int = 0
    var permissionUtils: PermissionUtils? = null
    var linearLayoutManageScroll: LinearLayoutManageScroll? = null
    var restContext: Context? = null
    var handler: Handler? = null

    override fun stopProgress() {
        progressBar.visibility = View.GONE
    }

    override fun startProgress() {
        Log.d(TAG, ": Progress Started");
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        homeActivity = context as HomeActivity
        SARestaurantApp.isRestVisible = true
        restContext = context
        context.supportActionBar?.show()
        context.supportActionBar?.title = TAG
        locationCommunication = homeActivity
        restaurantView = this
    }

    override fun onDetach() {
        SARestaurantApp.isRestVisible = false
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_restaurant, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        permissionUtils = PermissionUtils(homeActivity)
//        granted =
        permissionUtils!!.checkPermissions(permissionList)
        restaurantPresenterImp = RestaurantPresenterImp()
        resultList = ArrayList()
        if(!granted){
            Log.d(TAG, ": Not Granted:(");
//            permissionUtils.askForPermissions(permissionList)
            granted = true
//            permissionUtils.askForPermissions()
        }
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(homeActivity)
        var getLocation = GetLocationImp(granted, mFusedLocationProviderClient, homeActivity)
        getLocation.sendLocation(object: GetLocation.OnReceiveLocation{
            override fun getDeviceLastLocation(location: Location) {
                Log.d(TAG, "getDeviceLastLocation: $location Mil");
                currentLocation = location
                retrofitCall(location)
            }

            override fun receiveLocationUpdatesFun() {

            }

            override fun onError(error: String) {
//                Toast.makeText(activity, error, Toast.LENGTH_LONG).show()
            }

        })

        layout = LinearLayoutManageScroll(activity!!)
//        linearLayoutManageScroll = LinearLayoutManageScroll(activity!!)
        simpleSwipeRefreshLayout.setOnRefreshListener {
            layout.setScrollEnabled(false)
            if(adapter!=null){
                adapter!!.isClickable = false
            }
            handler = Handler()
            handler!!.postDelayed({
                if(simpleSwipeRefreshLayout!=null){
                    simpleSwipeRefreshLayout.setRefreshing(false);
                }
                // Generate a random integer number
                if(adapter!=null){
                    adapter!!.items.clear()
                }
                retrofitCall(currentLocation!!)
                // set the number value in TextView
                Log.d(TAG, "onActivityCreated: $currentLocation")
                layout.setScrollEnabled(true)
                if(adapter!=null){
                    adapter!!.isClickable = true
                }
            }, 3000)
        }

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                currentItems = 0
                totalItems = 0
                scrolledOutItems = 0
                currentItems = layout.childCount
                totalItems = layout.itemCount
                scrolledOutItems = layout.findFirstVisibleItemPosition()
                if(isScrolling && (currentItems + scrolledOutItems == totalItems) && !isLoading) //$$isLoading
                {
                    isScrolling = false
                    isRetrofitCall = false
                    fetchData()
                }

            }

            override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if(newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL){
                    isScrolling = true
                }
            }
        })

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ");
    }

    override fun onStop() {
        super.onStop()
        if(progressBar.visibility == View.VISIBLE){
            progressBar.visibility = View.GONE
        }else if(progressBarRest.visibility == View.VISIBLE){
            progressBarRest.visibility = View.GONE
        }else if(simpleSwipeRefreshLayout.visibility == View.VISIBLE){
            simpleSwipeRefreshLayout.visibility = View.GONE
        }else if(handler!=null){
            handler!!.removeCallbacksAndMessages(null)
        }
        Log.d(TAG, "onStop: ");
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: ");
    }

    private fun fetchData() {
        isLoading = true
        listOfModel = SARestaurantApp.database!!.resultDao().loadAllUsersByPage(5, stop) as ArrayList<Result>
        Log.d(TAG, "fetchData: ${listOfModel}");
        if(x<totalListSize){
            if(progressBarRest!= null){
                progressBarRest.visibility = View.VISIBLE // Changed
            }
            Handler().postDelayed(Runnable {
                adapter!!.items.addAll(listOfModel)
                x+=5
                Log.d(TAG, "fetchData: $x");
                adapter!!.notifyDataSetChanged()
//                startC += 5
                if(progressBarRest!= null && progressBarRest.visibility == View.VISIBLE){
                    progressBarRest.visibility = View.GONE // Changed
                }
                isLoading = false
            }, 3000)
            stop += 5

        }

    }

    fun retrofitCall(location: Location){
        c++
        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

        val retrofit: Retrofit = builder.build()
        isRetrofitCall = true

        val client: GooglePlacesClient = retrofit.create(GooglePlacesClient::class.java)

        val call = client.sendRequestForPlaces("${location.latitude},${location.longitude}", radius.toString(), result_type, sensor.toString(), resources.getString(R.string.google_maps_key))
        call.enqueue(object : Callback<ResponseModelClass> {
            override fun onFailure(call: Call<ResponseModelClass>?, t: Throwable?) {
                Log.e(TAG, "onFailure: $t")
            }

            override fun onResponse(call: Call<ResponseModelClass>?, responseModelClass: Response<ResponseModelClass>?) {
                Log.d(TAG, "onResponse: ${responseModelClass!!.body()!!.results}")
                listOfPlacesLocation = restaurantPresenterImp.getListOfLocations(responseModelClass.body()!!)
                listOfTitleImgModel = restaurantPresenterImp.getListOfTitleImg(responseModelClass.body()!!)
                Log.d("OnREsponse", "${listOfPlacesLocation}")
//                linearLayoutManageScroll!!.setScrollEnabled(true)
                if(progressBar != null && progressBar.visibility == View.VISIBLE){
                    restaurantView!!.stopProgress()
                }
                locationCommunication!!.sendLocationFromRestaurant(listOfPlacesLocation)
                locationCommunication!!.sendNameImgFromRestaurant(listOfTitleImgModel)
                SARestaurantApp.database!!.resultDao().deleteAll()
                Log.d(TAG, "onResponse: x: $x stop: $stop")
                x = 0
                stop = 0
                layout = LinearLayoutManageScroll(activity!!)
//                recyclerView.layoutManager = null
                for (i in responseModelClass.body()!!.results!!) {
                    SARestaurantApp.database!!.resultDao().insertData(i)
                    Log.d(TAG, "onResponseAfter Refresh: $i")
                }
//                Log.d(TAG, "onResponseFrmFet: ${responseModelFromFetch.results[0].name}")
                adapter = RestListAdapter(resultList, SARestaurantApp.database!!.favoriteRestaurantDao().getAll(), homeActivity)
                if(recyclerView != null){
                    recyclerView.layoutManager = layout
                    recyclerView.adapter = adapter
                }
//                fetchData(responseModelClass.body()!!.results as ArrayList<Result>)
                listOfModel = SARestaurantApp.database!!.resultDao().getAll() as ArrayList<Result>
                totalListSize = listOfModel.size
                Log.d(TAG, "TotalSize: $totalListSize")
                fetchData()
            }
        })
    }
}