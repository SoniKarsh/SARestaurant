package restaurant.sa.com.sarestaurant

import android.app.Application
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.arch.persistence.room.Room
import android.content.ComponentName
import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.util.Log
import restaurant.sa.com.sarestaurant.appview.alarm.ApiCallJobService
import restaurant.sa.com.sarestaurant.database.UserDatabase

class SARestaurantApp: Application() {

    companion object {
        var database: UserDatabase? = null
        var sharedPreference: SharedPreferences? = null
        val PREFERENCE_FILE_NAME = "restaurant.sa.com.sarestaurant.mainactivity"
        var countAdapter = 0
        val TAG = "SARestaurantApp"
        lateinit var componentName: ComponentName
    }

    override fun onCreate() {
        super.onCreate()
        SARestaurantApp.database = Room.databaseBuilder(this, UserDatabase::class.java, "SAResraurant-db").allowMainThreadQueries()
                .fallbackToDestructiveMigration().build()
        SARestaurantApp.sharedPreference = this.getSharedPreferences(SARestaurantApp.PREFERENCE_FILE_NAME, Context.MODE_PRIVATE)
        componentName = ComponentName(this, ApiCallJobService::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val info = JobInfo.Builder(123, componentName)
                    .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED)
                    .setPersisted(true)
                    .setPeriodic((60* 60 *1000).toLong())
                    .build()
            val scheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
            val resultCode = scheduler.schedule(info)
            if (resultCode == JobScheduler.RESULT_SUCCESS) {
                Log.d(TAG, "Job scheduled")
            } else {
                Log.d(TAG, "Job scheduling failed")
            }
        } else {
            Log.d(TAG, "VERSION.SDK_INT < LOLLIPOP")
        }
    }
}