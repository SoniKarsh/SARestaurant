package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Item {

    @SerializedName("condition")
    var condition: Condition? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("forecast")
    var forecast: List<Forecast>? = null
    @SerializedName("guid")
    var guid: Guid? = null
    @SerializedName("lat")
    var lat: String? = null
    @SerializedName("link")
    var link: String? = null
    @SerializedName("long")
    var long: String? = null
    @SerializedName("pubDate")
    var pubDate: String? = null
    @SerializedName("title")
    var title: String? = null

}
