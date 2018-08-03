package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Result")
data class Result(
        @PrimaryKey(autoGenerate = true) var _id: Int,
        @Embedded var geometry: Geometry?,
        @ColumnInfo(name = "icon") var icon: String?,
        @ColumnInfo(name = "name") var name: String,
        @ColumnInfo(name = "id") var id: String?,
        @TypeConverters(PhotoConverters::class)
        var photos: List<Photo>?,
        @SerializedName("place_id")
        @Expose
        @ColumnInfo(name = "placeId") var placeId: String?,
        @Embedded var plusCode: PlusCode?,
        @Embedded var openingHours: OpeningHours?,
        @ColumnInfo(name = "rating") var rating: Double?,
        @ColumnInfo(name = "reference") var reference: String?,
        @ColumnInfo(name = "scope") var scope: String?,
        @TypeConverters(TypesConverters::class)
        var types: List<String>?,
        @ColumnInfo(name = "vicinity") var vicinity: String?)
