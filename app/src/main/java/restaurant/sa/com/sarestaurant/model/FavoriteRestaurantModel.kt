package restaurant.sa.com.sarestaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.location.Location
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel.OpeningHours

@Entity(tableName = "FavoriteRestaurant")
data class FavoriteRestaurantModel(@PrimaryKey(autoGenerate = true) var _id: Long?,
                                   @ColumnInfo(name = "adapter_position") var adapterPosition: Int,
                                   @ColumnInfo(name = "restaurant_name") var restaurantName: String,
                                   @ColumnInfo(name = "restaurant_address") var restaurantAddress: String,
                                   @ColumnInfo(name = "restaurant_img_path") var restaurantImagePath: String,
                                   @ColumnInfo(name = "is_favorite") var isFavorite: Boolean?,
                                   @ColumnInfo(name = "latitude") var latitude: Double?,
                                   @ColumnInfo(name = "longitude") var longitude: Double?,
                                   @ColumnInfo(name = "rating") var rating: Double?,
                                   @ColumnInfo(name = "restIsClosed") var rest_isClosed: String?,
                                   @SerializedName("place_id")
                                   @Expose
                                   @ColumnInfo(name = "placeId") var placeId: String?
){
    constructor():this(null,0, "", "", "", null, null, null, null, "", "")
}
