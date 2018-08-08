package restaurant.sa.com.sarestaurant.appview.restaurant.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseModelClass {

    @SerializedName("html_attributions")
    var htmlAttributions: List<Any>? = null
    @SerializedName("next_page_token")
    var nextPageToken: String? = null
    @Expose
    var results: List<Result>? = null
    @Expose
    var status: String? = null

}
