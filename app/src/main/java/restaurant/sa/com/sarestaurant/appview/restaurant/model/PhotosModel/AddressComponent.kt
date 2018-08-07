package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class AddressComponent {

    @SerializedName("long_name")
    var longName: String? = null
    @SerializedName("short_name")
    var shortName: String? = null
    @SerializedName("types")
    var types: List<String>? = null

}
