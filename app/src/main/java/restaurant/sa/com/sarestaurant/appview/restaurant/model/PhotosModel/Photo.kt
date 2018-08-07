package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Photo {

    @SerializedName("height")
    var height: Long? = null
    @SerializedName("html_attributions")
    var htmlAttributions: List<String>? = null
    @SerializedName("photo_reference")
    @Expose
    var photoReference: String? = null
    @SerializedName("width")
    var width: Long? = null

}
