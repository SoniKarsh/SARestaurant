package restaurant.sa.com.sarestaurant.appview.weather

import android.content.Context
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import restaurant.sa.com.sarestaurant.appview.weather.model.ResponseModelClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.FusedLocationProviderClient
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_weather.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.alarm.ApiCallJobService
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocationImp
import restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback
import restaurant.sa.com.sarestaurant.appview.weather.presenter.WeatherPresenterImp
import restaurant.sa.com.sarestaurant.utils.PermissionUtils


class WeatherFragment : Fragment() {

    val TAG = "WeatherFragment"
    val BASE_URL = "https://query.yahooapis.com"
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    lateinit var homeActivity: HomeActivity
    lateinit var contextRestFrag: Context
    var granted = false
    var permissionList = arrayOf<String>(android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION)
    var weatherPresenterImp: WeatherPresenterImp? = null
    var homeCallback: HomeCallback? = null
    var isRunning: Boolean = false
    var permissionUtils: PermissionUtils? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        contextRestFrag = context!!
        homeActivity = context as HomeActivity
        context.supportActionBar?.title = TAG
        homeCallback = homeActivity
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_weather, container, false)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        permissionUtils!!.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isRunning = true
        permissionUtils = PermissionUtils(homeActivity)
//        granted = permissionUtils!!.checkPermissions(permissionList)
        permissionUtils!!.checkPermissions(permissionList)
        weatherPresenterImp = WeatherPresenterImp()

        if(!granted){
            Log.d(TAG, ": Not Granted:(");
            permissionUtils!!.askForPermissions(permissionList as Array<String>)
            granted = true
//            permissionUtils.askForPermissions()
        }

        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(homeActivity)
        var getLocation = GetLocationImp(granted, mFusedLocationProviderClient, contextRestFrag)
        getLocation.sendLocation(object: GetLocation.OnReceiveLocation{
            override fun getDeviceLastLocation(location: Location) {
                Log.d(TAG, "getDeviceLastLocation: $location")
                retrofitCall(location, homeActivity, false)
            }

            override fun receiveLocationUpdatesFun() {

            }

            override fun onError(error: String) {
                Toast.makeText(homeActivity, error, Toast.LENGTH_LONG).show()
            }

        })


    }

    fun retrofitCall(location: Location, context: Context, isActivityCall: Boolean){

        var weatherData = WeatherData()

        var builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

        var retrofit: Retrofit = builder.build()

        var client: WeatherApiClient = retrofit.create(WeatherApiClient::class.java)

        var mHandler = Handler(Looper.getMainLooper());

        var call = client.sendRequestForPlaces("select * from weather.forecast where woeid in (SELECT woeid FROM geo.places WHERE text= \"(${location.latitude},${location.longitude})\")", "json")
        call.enqueue(object : Callback<ResponseModelClass> {
            override fun onFailure(call: Call<ResponseModelClass>?, t: Throwable?) {
                Log.e(TAG, "onFailure: $t");
            }

            override fun onResponse(call: Call<ResponseModelClass>?, responseModelClass: Response<ResponseModelClass>?) {
                Log.d(TAG, "onResponse: ${responseModelClass!!.body().toString()}")
                mHandler.post(Runnable {
                    var locationOfWeather = responseModelClass.body()!!.query.results.channel.location
                    var windWeather = responseModelClass.body()!!.query.results.channel.wind
                    var imgUrl = "http://l.yimg.com/a/i/us/we/52/${responseModelClass.body()!!.query.results.channel.item.condition.code}.gif"
                    weatherData.imgUrl = imgUrl
                    weatherData.temp = responseModelClass.body()!!.query.results.channel.item.condition.temp
                    if(isRunning){
                        weatherFrag.setText("${locationOfWeather.city},  ${locationOfWeather.region},  ${locationOfWeather.country}") // must be inside run()
                        windSpeed.setText("Wind Speed: ${windWeather.speed}, Wind Chill: ${windWeather.chill}, Wind Direction: ${windWeather.direction}")
                        temp.setText("Temp: ${responseModelClass.body()!!.query.results.channel.item.condition.temp}")
                        var imgUrlRun = "http://l.yimg.com/a/i/us/we/52/${responseModelClass.body()!!.query.results.channel.item.condition.code}.gif"
                        Picasso.get().load(imgUrlRun)
                            .into(imageView)
                    }else if(isActivityCall){
                        var activity: HomeActivity = context as HomeActivity
                        homeCallback = activity
                        homeCallback!!.sendWeatherData(weatherData)
                    }else{
                        homeCallback = context as ApiCallJobService
                        homeCallback!!.sendWeatherData(weatherData)
                    }
                    SARestaurantApp.sharedPreference!!.edit()
                            .putString("temp", responseModelClass.body()!!.query.results.channel.item.condition.temp)
                            .putString("imgurl", imgUrl)
                            .apply()
                })

            }
        })
    }
}
