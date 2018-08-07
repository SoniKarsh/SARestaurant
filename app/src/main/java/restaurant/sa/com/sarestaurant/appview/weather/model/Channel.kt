package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Channel {

    @SerializedName("astronomy")
    var astronomy: Astronomy? = null
    @SerializedName("atmosphere")
    var atmosphere: Atmosphere? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("image")
    var image: Image? = null
    @SerializedName("item")
    var item: Item? = null
    @SerializedName("language")
    var language: String? = null
    @SerializedName("lastBuildDate")
    var lastBuildDate: String? = null
    @SerializedName("link")
    var link: String? = null
    @SerializedName("location")
    var location: Location? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("ttl")
    var ttl: String? = null
    @SerializedName("units")
    var units: Units? = null
    @SerializedName("wind")
    var wind: Wind? = null

}
