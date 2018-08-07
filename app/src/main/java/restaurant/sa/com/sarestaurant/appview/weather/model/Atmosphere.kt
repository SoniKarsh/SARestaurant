package restaurant.sa.com.sarestaurant.appview.weather.model


import com.google.gson.annotations.SerializedName

class Atmosphere {

    @SerializedName("humidity")
    var humidity: String? = null
    @SerializedName("pressure")
    var pressure: String? = null
    @SerializedName("rising")
    var rising: String? = null
    @SerializedName("visibility")
    var visibility: String? = null

}
