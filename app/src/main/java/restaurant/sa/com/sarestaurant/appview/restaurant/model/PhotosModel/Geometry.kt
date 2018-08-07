package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class Geometry {

    @SerializedName("location")
    var location: Location? = null
    @SerializedName("viewport")
    var viewport: Viewport? = null

}
