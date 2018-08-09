package restaurant.sa.com.sarestaurant.appview.restaurant

import android.content.Context
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
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
import restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.LinearLayoutManageScroll
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenterImp
import restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient.GooglePlacesClient
import restaurant.sa.com.sarestaurant.appview.restaurant.view.RestaurantView
import restaurant.sa.com.sarestaurant.utils.LogUtils
import restaurant.sa.com.sarestaurant.utils.ToastUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import android.net.ConnectivityManager

/**
 *
 * @author Karsh Soni
 *
 * 7th August, 2018
 *
 */

class RestaurantFragment: Fragment(), RestaurantView {

    private lateinit var homeActivity: HomeActivity
    private val TAG = "RestaurantFragment"
    private var currentLocation: Location? = null
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    private val resultType = "restaurant"
    private val BASE_URL = "https://maps.googleapis.com"
    private lateinit var restaurantPresenterImp: RestaurantPresenterImp
    private var locationCommunication: LocationCommunication? = null
    private var restaurantView: RestaurantView? = null
    private val radius = 2000
    private val sensor = true
    private var isScrolling : Boolean = false
    private var currentItems: Int = 0
    private var scrolledOutItems: Int = 0
    private var totalItems: Int = 0
    private lateinit var layout: LinearLayoutManageScroll
    private lateinit var listOfPlacesLocation: ArrayList<LatLng>
    private lateinit var listOfTitleImgModel: ArrayList<TitleImgModel>
    private var isRetrofitCall = false
    private lateinit var listOfModel :ArrayList<Result>
    private var adapter: RestListAdapter? = null
    private lateinit var resultList: ArrayList<Result>
    private var x = 0
    private var stop = 0
    private var isLoading = false
    private var totalListSize: Int = 0
    private var restContext: Context? = null
    private var handler: Handler? = null
    private val error = "Error Occurred"

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        homeActivity = context as HomeActivity
        SARestaurantApp.instance!!.isRestVisible = true
        restContext = context
        context.supportActionBar?.show()
        context.supportActionBar?.title = TAG
        locationCommunication = homeActivity
        restaurantView = this
    }

    // On Create View -> Inflate Fragment Layout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_restaurant, container, false)
    }

    // UI access, Getting Location
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        restaurantPresenterImp = RestaurantPresenterImp()
        resultList = ArrayList()

        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(homeActivity)
        val getLocation = GetLocationImp(true, mFusedLocationProviderClient, homeActivity)
        getLocation.sendLocation(object: GetLocation.OnReceiveLocation{

            override fun getDeviceLastLocation(location: Location) {
                ToastUtils.setTag(TAG)
                ToastUtils.lengthLong(context!!, "Got Location")
                currentLocation = location
                retrofitCall(location)
            }

            override fun onError(error: String) {
                ToastUtils.setTag(TAG)
                ToastUtils.lengthLong(context!!, error)
            }
        })

        // Custom LinearLayoutManager for handling scrolling event
        layout = LinearLayoutManageScroll(activity!!)

        // simpleSwipeRefreshLayout for Pull to Refresh
        simpleSwipeRefreshLayout.setOnRefreshListener {
            // On pull disable scrolling
            layout.setScrollEnabled(false)

            // isClickable for handling item click during pull to refresh
            // To avoid crash and index out of bound or null object reference error
            if(adapter!=null){
                adapter!!.isClickable = false
            }

            // Handler for delayed UI work from worker thread.
            handler = Handler()
            handler!!.postDelayed({

                // To avoid infinite progress bar
                if (simpleSwipeRefreshLayout != null) {
                    simpleSwipeRefreshLayout.isRefreshing = false
                }

                // On refresh clear current adapter
                if (adapter != null) {
                    adapter!!.items.clear()
                }

                if (isAdded && isVisible){// API call
                    retrofitCall(currentLocation!!)
                }
                // Enabled scroll on result retrieval
                layout.setScrollEnabled(true)

                // Enabled Item Click on result retrieval
                if(adapter!=null){
                    adapter!!.isClickable = true
                }

            }, 3000)
        }

        // For pagination addOnScrollListener to observe available items and recycled items
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            // Scrolling has completed
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                currentItems = 0 // Current Visible items in Recycler View
                totalItems = 0 // Total items in adapter
                scrolledOutItems = 0 // Scrolled out items which are no longer visible
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

            // Scroll is in motion
            override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if(newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL){
                    isScrolling = true
                }
            }
        })

    }

    // Remove progress bar on onStop of fragment lifecycler to avoid null object reference error
    override fun onStop() {
        super.onStop()
        // isClickableForMap
        SARestaurantApp.instance!!.isClickableForMap = false
        if(handler!=null) {
            handler!!.removeCallbacks(runnable)
        }
    }

    // Fetch data from db for pagination
    private fun fetchData() {
        isLoading = true

        // Fetch data with limit of 5 results
        listOfModel = SARestaurantApp.database!!.resultDao().loadAllUsersByPage(5, stop) as ArrayList<Result>

        // Check whether we reached the end of list or not
        if(x<totalListSize){
            if(progressBarRest!= null){
                progressBarRest.visibility = View.VISIBLE // Changed
            }

            Handler().postDelayed( runnable, 3000)
            stop += 5
        }
    }

    private val runnable = Runnable {
            // Add all to adapter
            adapter!!.items.addAll(listOfModel)
            x+=5
            adapter!!.notifyDataSetChanged()
            if(progressBarRest!= null && progressBarRest.visibility == View.VISIBLE){
                progressBarRest.visibility = View.GONE // Changed
            }
            isLoading = false
    }


    // API call
    fun retrofitCall(location: Location){
        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

        val retrofit: Retrofit = builder.build()
        isRetrofitCall = true

        val client: GooglePlacesClient = retrofit.create(GooglePlacesClient::class.java)

        val call = client.sendRequestForPlaces("${location.latitude},${location.longitude}", radius.toString(), resultType, sensor.toString(), resources.getString(R.string.google_maps_key))
        call.enqueue(object : Callback<ResponseModelClass> {
            override fun onFailure(call: Call<ResponseModelClass>?, t: Throwable?) {
                LogUtils.setTag(TAG)
                LogUtils.e(t.toString())
                ToastUtils.setTag(TAG)
                ToastUtils.lengthLong(context!!, error)
                SARestaurantApp.instance!!.isClickableForMap = false
            }

            override fun onResponse(call: Call<ResponseModelClass>?, responseModelClass: Response<ResponseModelClass>?) {
                if(isVisible && isAdded) {
                    if (responseModelClass!!.body() != null && isNetworkAvailable()) {
                        // Get list of locations from response
                        listOfPlacesLocation = restaurantPresenterImp.getListOfLocations(responseModelClass.body()!!)

                        //  Get list of titles, images, rating, address from response
                        listOfTitleImgModel = restaurantPresenterImp.getListOfTitleImg(responseModelClass.body()!!)

                        if (progressBar != null && progressBar.visibility == View.VISIBLE) {
                            restaurantView!!.stopProgress()
                        }

                        // Send list of locations to listener
                        locationCommunication!!.sendLocationFromRestaurant(listOfPlacesLocation)

                        // Send list of TitleImgModel to listener
                        locationCommunication!!.sendNameImgFromRestaurant(listOfTitleImgModel)

                        // Delete all previous data to avoid un-necessary data
                        SARestaurantApp.database!!.resultDao().deleteAll()

                        // Reset to 0
                        x = 0
                        stop = 0

                        layout = LinearLayoutManageScroll(activity!!)

                        for (i in responseModelClass.body()!!.results!!) {
                            SARestaurantApp.database!!.resultDao().insertData(i)
                            Log.d(TAG, "onResponseAfter Refresh: $i")
                        }

                        adapter = RestListAdapter(resultList, SARestaurantApp.database!!.favoriteRestaurantDao().getAll(), homeActivity)

                        if (recyclerView != null) {
                            recyclerView.layoutManager = layout
                            recyclerView.adapter = adapter
                        }
                        // Return whole response from database
                        listOfModel = SARestaurantApp.database!!.resultDao().getAll() as ArrayList<Result>
                        totalListSize = listOfModel.size

                        // isClickableForMap
                        SARestaurantApp.instance!!.isClickableForMap = true

                        fetchData()
                    } else if (!isNetworkAvailable()) {
                        Snackbar.make(homeActivity.constraintLayoutRest, "Check Your Network Connectivity :(", Snackbar.LENGTH_LONG)
                                .setAction("OK", null).show()
                    } else {
                        Snackbar.make(homeActivity.constraintLayoutRest, "Data not Found :(", Snackbar.LENGTH_LONG)
                                .setAction("OK", null).show()
                    }
                }
            }
        })
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager = homeActivity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    // On Fragment Detach
    override fun onDetach() {
        SARestaurantApp.instance!!.isRestVisible = false
        super.onDetach()
    }

    // Progress Bar Handler Methods
    override fun stopProgress() {
        progressBar.visibility = View.GONE
    }

    override fun startProgress() {

    }

}