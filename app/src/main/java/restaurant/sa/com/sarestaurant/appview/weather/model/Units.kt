package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Units {

    @SerializedName("distance")
    var distance: String? = null
    @SerializedName("pressure")
    var pressure: String? = null
    @SerializedName("speed")
    var speed: String? = null
    @SerializedName("temperature")
    var temperature: String? = null

}
