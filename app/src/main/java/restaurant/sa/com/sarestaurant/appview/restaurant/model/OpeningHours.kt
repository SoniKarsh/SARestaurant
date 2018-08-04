package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "OpeningHours")
data class OpeningHours(
        @SerializedName("open_now")
        @Expose
        @ColumnInfo(name = "openNow") var openNow: Boolean?)