package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Condition {

    @SerializedName("code")
    var code: String? = null
    @SerializedName("date")
    var date: String? = null
    @SerializedName("temp")
    var temp: String? = null
    @SerializedName("text")
    var text: String? = null

}
