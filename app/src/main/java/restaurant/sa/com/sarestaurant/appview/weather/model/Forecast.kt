package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Forecast {

    @SerializedName("code")
    var code: String? = null
    @SerializedName("date")
    var date: String? = null
    @SerializedName("day")
    var day: String? = null
    @SerializedName("high")
    var high: String? = null
    @SerializedName("low")
    var low: String? = null
    @SerializedName("text")
    var text: String? = null

}
