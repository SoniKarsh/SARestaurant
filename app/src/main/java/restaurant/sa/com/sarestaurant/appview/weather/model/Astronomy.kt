package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Astronomy {

    @SerializedName("sunrise")
    var sunrise: String? = null
    @SerializedName("sunset")
    var sunset: String? = null

}
