package restaurant.sa.com.sarestaurant.appview.restaurant.model


import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
@Entity(tableName = "Location")
class Location(@ColumnInfo(name = "lat") var lat: Double?,
               @ColumnInfo(name = "lng") var lng: Double?)
