package restaurant.sa.com.sarestaurant.appview.weather.model

import com.google.gson.annotations.SerializedName

class Query {

    @SerializedName("count")
    var count: Long? = null
    @SerializedName("created")
    var created: String? = null
    @SerializedName("lang")
    var lang: String? = null
    @SerializedName("results")
    var results: Results? = null

}
