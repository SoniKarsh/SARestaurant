package restaurant.sa.com.sarestaurant

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import android.content.SharedPreferences
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import restaurant.sa.com.sarestaurant.database.UserDatabase

class SARestaurantApp: Application() {

    companion object {
        var database: UserDatabase? = null
        var sharedPreference: SharedPreferences? = null
        val PREFERENCE_FILE_NAME = "restaurant.sa.com.sarestaurant.mainactivity"
    }

    override fun onCreate() {
        super.onCreate()
        SARestaurantApp.database = Room.databaseBuilder(this, UserDatabase::class.java, "SAResraurant-db").allowMainThreadQueries().build()
        SARestaurantApp.sharedPreference = this.getSharedPreferences(SARestaurantApp.PREFERENCE_FILE_NAME, Context.MODE_PRIVATE)
    }
}