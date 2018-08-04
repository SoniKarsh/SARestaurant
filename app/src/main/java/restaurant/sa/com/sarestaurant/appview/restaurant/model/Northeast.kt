package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "Northeast")
data class Northeast(
        @ColumnInfo(name = "latitude") var lat: Double?,
        @ColumnInfo(name = "longitude") var lng: Double?)