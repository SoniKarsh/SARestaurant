package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "Photo")
data class Photo(@ColumnInfo(name = "height") var height: Long?,
                 @SerializedName("html_attributions")
                 @Expose
                 @ColumnInfo(name = "htmlAttributions") var htmlAttributions: List<String>?,
                 @SerializedName("photo_reference")
                 @Expose
                 @ColumnInfo(name = "photoReference") var photoReference: String?,
                 @ColumnInfo(name = "width") var width: Long?)