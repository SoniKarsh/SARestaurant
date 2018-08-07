package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class Viewport {

    @SerializedName("northeast")
    var northeast: Northeast? = null
    @SerializedName("southwest")
    var southwest: Southwest? = null

}
