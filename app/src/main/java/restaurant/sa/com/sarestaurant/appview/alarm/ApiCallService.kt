package restaurant.sa.com.sarestaurant.appview.alarm

import android.app.*
import android.content.Context
import android.content.Intent
import android.location.Location
import android.os.Build
import android.os.IBinder
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.MainActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocationImp
import restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback
import restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment

class ApiCallService: Service(), HomeCallback {

    var backgroundThread: Thread? = null
    val TAG = "ApiCallService"
    lateinit var builder: NotificationCompat.Builder
    private val channelId= "restaurant.sa.com.sarestaurant.appview.alarm"
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    private var weatherFragment: WeatherFragment? = null
    var weatherData: WeatherData? = null
    private var mNotificationManager: NotificationManager? = null
    var notification: Notification? = null

    override fun getData() {

    }

    override fun sendWeatherData(weatherData: WeatherData) {
        updateNotification(weatherData)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate() {
        super.onCreate()
        shownotification()
        backgroundThread = Thread(myTask)
    }

    private val myTask = Runnable {
        // Do something here
        weatherFragment = WeatherFragment()
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        val getLocation = GetLocationImp(true, mFusedLocationProviderClient, this)
        getLocation.sendLocation(object: GetLocation.OnReceiveLocation{
            override fun getDeviceLastLocation(location: Location) {
                weatherFragment!!.retrofitCall(location, this@ApiCallService, false)
            }

            override fun onError(error: String) {
                Log.d(TAG, "error: $error")
            }

        })
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(backgroundThread!=null){
            backgroundThread!!.start()
        }
        return START_STICKY
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    fun shownotification(){
        mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_HIGH
            var mChannel = mNotificationManager!!.getNotificationChannel(channelId)
            if (mChannel == null) {
                mChannel = NotificationChannel(channelId, "title", importance)
                mChannel.enableVibration(true)
                mChannel.setVibrationPattern(longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400))
                mNotificationManager!!.createNotificationChannel(mChannel)
            }
            builder = NotificationCompat.Builder(this, channelId)
            val intent = Intent(this, HomeActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)
            builder.setContentTitle(this.getString(R.string.app_name))  // required
                    .setSmallIcon(android.R.drawable.ic_popup_reminder) // required
                    .setContentText(this.getString(R.string.app_name))  // required
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setAutoCancel(true)
                    .setContentIntent(pendingIntent)
                    .setTicker("this")
                    .setVibrate(longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400))
        } else {
            Log.d(TAG, "shownotification: Sent");
            builder = NotificationCompat.Builder(this)
            val intent = Intent(this, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)
            builder.setContentTitle("Job Scheduled")                           // required
                    .setSmallIcon(android.R.drawable.ic_popup_reminder) // required
                    .setContentText(this.getString(R.string.app_name))  // required
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setAutoCancel(true)
                    .setContentIntent(pendingIntent)
                    .setTicker("This")
                    .setVibrate(longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400)).priority = Notification.PRIORITY_HIGH
        }

        notification = builder.build()
        startForeground(1, notification)
    }

    fun updateNotification(weatherData: WeatherData){
        Log.d(TAG, "updateNotification: ${weatherData.temp}");
        builder.setContentTitle(this.resources.getString(R.string.weatherData))
                .setContentText(weatherData.temp+this.resources.getString(R.string.f))
        mNotificationManager!!.notify(123, builder.build())
        this.stopSelf()
    }

}