package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Image {

    @SerializedName("height")
    var height: String? = null
    @SerializedName("link")
    var link: String? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("url")
    var url: String? = null
    @SerializedName("width")
    var width: String? = null

}
