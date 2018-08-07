package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Wind {

    @SerializedName("chill")
    var chill: String? = null
    @SerializedName("direction")
    var direction: String? = null
    @SerializedName("speed")
    var speed: String? = null

}
