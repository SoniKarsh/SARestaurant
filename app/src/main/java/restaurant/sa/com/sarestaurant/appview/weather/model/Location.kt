package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Location {

    @SerializedName("city")
    var city: String? = null
    @SerializedName("country")
    var country: String? = null
    @SerializedName("region")
    var region: String? = null

}
