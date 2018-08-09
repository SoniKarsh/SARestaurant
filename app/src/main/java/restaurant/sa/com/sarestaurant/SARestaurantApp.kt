package restaurant.sa.com.sarestaurant

import android.app.Application
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.arch.persistence.room.Room
import android.content.ComponentName
import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import restaurant.sa.com.sarestaurant.appview.alarm.ApiCallJobService
import restaurant.sa.com.sarestaurant.database.UserDatabase
import restaurant.sa.com.sarestaurant.utils.LogUtils

class SARestaurantApp: Application() {
    var sharedPreference: SharedPreferences? = null
    val PREFERENCE_FILE_NAME = "restaurant.sa.com.sarestaurant.mainactivity"
    val TAG = "SARestaurantApp"
    var isMapVisible: Boolean = false
    var isFavVisible: Boolean = false
    var isRestVisible: Boolean = false
    val jobId = 123
    var isWeatherVisible: Boolean = false
    var isClickableForMap: Boolean = false

    companion object {
        var instance: SARestaurantApp? = null
        var database: UserDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()

        // Single Instance
        instance = this

        // Single Database instance
        database = Room.databaseBuilder(this, UserDatabase::class.java, "SAResraurant-db").allowMainThreadQueries()
                .fallbackToDestructiveMigration().build()

        // Create shared preference
        sharedPreference = this.getSharedPreferences(PREFERENCE_FILE_NAME, Context.MODE_PRIVATE)



    }
}