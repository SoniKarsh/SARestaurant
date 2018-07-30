package restaurant.sa.com.sarestaurant.appview.restaurant

import android.content.Context
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    var permissionList = arrayListOf<String>(android.Manifest.permission.ACCESS_FINE_LOCATION,
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
    lateinit var listOfPlacesLocation: ArrayList<LatLng>

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var permissionUtils = PermissionUtils(homeActivity)
        granted = permissionUtils.checkPermissions(permissionList)
        restaurantPresenterImp = RestaurantPresenterImp()

        if(!granted){
            Log.d(TAG, ": Not Granted:(");
            permissionUtils.askForPermissions()
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
                Toast.makeText(activity, error, Toast.LENGTH_LONG).show()
            }

        })

        simpleSwipeRefreshLayout.setOnRefreshListener {
            Handler().postDelayed({
                simpleSwipeRefreshLayout.setRefreshing(false);
                // Generate a random integer number
                retrofitCall(currentLocation!!)
                // set the number value in TextView
                Log.d(TAG, "onActivityCreated: $currentLocation")
            }, 3000)
        }

    }

    fun retrofitCall(location: Location){
        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

        val retrofit: Retrofit = builder.build()

        val client: GooglePlacesClient = retrofit.create(GooglePlacesClient::class.java)

        val call = client.sendRequestForPlaces("${location.latitude},${location.longitude}", radius.toString(), result_type, sensor.toString(), resources.getString(R.string.google_maps_key))
        call.enqueue(object : Callback<ResponseModelClass> {
            override fun onFailure(call: Call<ResponseModelClass>?, t: Throwable?) {
                Log.e(TAG, "onFailure: $t");
            }

            override fun onResponse(call: Call<ResponseModelClass>?, responseModelClass: Response<ResponseModelClass>?) {
                Log.d(TAG, "onResponse: ${responseModelClass!!.body()}")
                val layout = LinearLayoutManager(activity)
                listOfPlacesLocation = restaurantPresenterImp.getListOfLocations(responseModelClass.body()!!)
                Log.d("OnREsponse", "${listOfPlacesLocation}")
                restaurantView!!.stopProgress()
                locationCommunication!!.sendLocationFromRestaurant(listOfPlacesLocation)
                recyclerView.adapter = RestListAdapter(responseModelClass.body()!!, SARestaurantApp.database!!.favoriteRestaurantDao().getAll(), homeActivity)
                recyclerView.layoutManager = layout
            }
        })
    }

}