package restaurant.sa.com.sarestaurant.appview.restaurant.model
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "Southwest")
data class Southwest(
        @ColumnInfo(name = "latitude1") var lat: Double?,
        @ColumnInfo(name = "longitude2") var lng: Double?)