package restaurant.sa.com.sarestaurant.appview.alarm

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Context
import android.content.Intent
import android.location.Location
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.util.Log
import android.widget.RemoteViews
import android.widget.Toast
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocationImp
import restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback
import restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class ApiCallJobService: JobService(), HomeCallback {

    private val TAG = "ApiCallJobService"
    private var jobCancelled = false
    lateinit var builder: Notification.Builder
    private val channelId= "restaurant.sa.com.sarestaurant.appview.alarm"
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    private var weatherFragment: WeatherFragment? = null
    var weatherData: WeatherData? = null
    var notificationLayout: RemoteViews? = null
    private var mNotificationManager: NotificationManager? = null
    var notification: Notification? = null
    override fun onStartJob(params: JobParameters): Boolean {
        Log.d(TAG, "Job started")
        weatherData = WeatherData()
        shownotification()
        doBackgroundWork(params)
        return true
    }

    override fun sendWeatherData(weatherData: WeatherData) {
        Log.d(TAG, "sendWeatherData: $weatherData");
        updateNotification()
    }

    override fun getData() {

    }

    private fun doBackgroundWork(params: JobParameters) {
        Thread(Runnable {
            weatherFragment = WeatherFragment()
            mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
            var getLocation = GetLocationImp(true, mFusedLocationProviderClient, this)
            getLocation.sendLocation(object: GetLocation.OnReceiveLocation{
                override fun getDeviceLastLocation(location: Location) {
                    Log.d(TAG, "getDeviceLastLocation: $location")
                    weatherFragment!!.retrofitCall(location, this@ApiCallJobService, false)
                }

                override fun receiveLocationUpdatesFun() {

                }

                override fun onError(error: String) {
                    Toast.makeText(this@ApiCallJobService, error, Toast.LENGTH_LONG).show()
                }

            })


            Thread.sleep(10000)
            Log.d(TAG, "Job finished")
            jobFinished(params, false)
        }).start()
    }

    override fun onStopJob(params: JobParameters): Boolean {
        Log.d(TAG, "Job cancelled before completion")
        jobCancelled = true
        return true
    }

    fun shownotification(){
        mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationLayout  = RemoteViews(this.packageName, R.layout.status_bar)
//        notificationLayout.setImageViewResource(R.id.tempImg, )
//        val notificationLayoutExpanded = RemoteViews(this.packageName, R.layout.status_bar_expanded)

        var notificationIntent = Intent(this, HomeActivity::class.java)
//        notificationIntent.putExtra("Current Position", mediaPlayer!!.currentPosition)
        var pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0)

        notification = NotificationCompat.Builder(this, channelId)
                .setContentTitle("Example Service")
                .setContentText("Working")
                .setOngoing(true)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setCustomContentView(notificationLayout)
                .setContentIntent(pendingIntent)
                .build()


        startForeground(1, notification)
    }

    fun updateNotification(){
        notificationLayout!!.setTextViewText(R.id.tempTV, weatherData!!.temp)
        mNotificationManager!!.notify(1, notification)

    }

}