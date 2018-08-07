package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class Period {

    @SerializedName("close")
    var close: Close? = null
    @SerializedName("open")
    var open: Open? = null

}
