package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class ResponsePhotoModelClass {

    @SerializedName("html_attributions")
    var htmlAttributions: List<Any>? = null
    @SerializedName("result")
    var result: Result? = null
    @SerializedName("status")
    var status: String? = null

}
