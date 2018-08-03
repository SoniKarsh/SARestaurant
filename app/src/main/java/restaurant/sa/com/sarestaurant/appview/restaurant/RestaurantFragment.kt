package restaurant.sa.com.sarestaurant.appview.restaurant

import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
//import restaurant.sa.com.sarestaurant.model.models.Result
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.Toast
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
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result
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
    var permissionList = arrayOf<String>(android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION)
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
    val layout = LinearLayoutManager(activity)
    lateinit var listOfPlacesLocation: ArrayList<LatLng>
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

    override fun stopProgress() {
        progressBar.visibility = View.GONE
    }

    override fun startProgress() {
        Log.d(TAG, ": Progress Started");
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        homeActivity = context as HomeActivity
        context.supportActionBar?.title = TAG
        locationCommunication = homeActivity
        restaurantView = this
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_restaurant, container, false)
    }
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        permissionUtils!!.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    }



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

        simpleSwipeRefreshLayout.setOnRefreshListener {
            Handler().postDelayed({
                simpleSwipeRefreshLayout.setRefreshing(false);
                // Generate a random integer number
                if(adapter!=null){
                    adapter!!.items.clear()
                }
                retrofitCall(currentLocation!!)
                // set the number value in TextView
                Log.d(TAG, "onActivityCreated: $currentLocation")
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
//                total = totalItems/5
//                isLoading = true
                if(isScrolling && (currentItems + scrolledOutItems == totalItems) && !isLoading) //$$isLoading
                {
                    isScrolling = false;
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

    private fun fetchData() {
//        listOfModel = resultListFetch
//        Log.d(TAG, "fetchData: ${listOfModel.size}");
//        if(isRetrofitCall){
////            responseModelFromFetch.results.add(Result())
//            for (i in 0..5){
//                Log.d(TAG, "fetchData: $i");
//                adapter.items.add(resultListFetch[i])
//            }
//            adapter.notifyDataSetChanged()
//        }else if(stop<resultListFetch.size-1){
//                progressBarRest.visibility = View.VISIBLE
//                Handler().postDelayed(Runnable {
//                    for (i in start..stop){
//                        adapter.items.add(listOfModel[i])
//                        Log.d(TAG, "fetchData: $i $start $stop");
//                    }
////                for (i in responseModelClass.results){
////                    adapter.items.results.add(i)
////                }
//                    adapter.notifyDataSetChanged()
//                    progressBarRest.visibility = View.GONE
//                    start+=5
//                    stop+=5
//                }, 3000)
//                x++
//        }else if((listOfModel.size%5)<5 && x==1){
//            x++
//            progressBarRest.visibility = View.VISIBLE
////            Log.d(TAG, "fetchData: In Here ${stop-5} ${listOfModel%5}");
//            Handler().postDelayed(Runnable {
//                for (i in (stop-5)..(listOfModel.size%5 + stop)){
//                    adapter.items.add(listOfModel[i])
//                    Log.d(TAG, "fetchData: ${listOfModel[i]}");
//                }
//                adapter.notifyDataSetChanged()
//                progressBarRest.visibility = View.GONE
//            }, 3000)
//
//        }
        isLoading = true
        listOfModel = SARestaurantApp.database!!.resultDao().loadAllUsersByPage(5, stop) as ArrayList<Result>
        Log.d(TAG, "fetchData: ${listOfModel}");
        if(x<totalListSize){
            progressBarRest.visibility = View.VISIBLE
            Handler().postDelayed(Runnable {
                adapter!!.items.addAll(listOfModel)
                x+=5
                Log.d(TAG, "fetchData: $x");
                adapter!!.notifyDataSetChanged()
//                startC += 5
                progressBarRest.visibility = View.GONE
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
                Log.d("OnREsponse", "${listOfPlacesLocation}")
                restaurantView!!.stopProgress()
                locationCommunication!!.sendLocationFromRestaurant(listOfPlacesLocation)
                SARestaurantApp.database!!.resultDao().deleteAll()
                Log.d(TAG, "onResponse: x: $x stop: $stop")
                x = 0
                stop = 0
                recyclerView.layoutManager = null
                for (i in responseModelClass.body()!!.results!!) {
                    SARestaurantApp.database!!.resultDao().insertData(i)
                    Log.d(TAG, "onResponseAfter Refresh: $i")
                }
//                Log.d(TAG, "onResponseFrmFet: ${responseModelFromFetch.results[0].name}")
                adapter = RestListAdapter(resultList, SARestaurantApp.database!!.favoriteRestaurantDao().getAll(), homeActivity)
                recyclerView.layoutManager = layout
                recyclerView.adapter = adapter
//                fetchData(responseModelClass.body()!!.results as ArrayList<Result>)
                listOfModel = SARestaurantApp.database!!.resultDao().getAll() as ArrayList<Result>
                totalListSize = listOfModel.size
                Log.d(TAG, "TotalSize: $totalListSize")
                fetchData()
            }
        })
    }
}