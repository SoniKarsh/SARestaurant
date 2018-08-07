package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class OpeningHours {

    @SerializedName("open_now")
    var openNow: Boolean? = null
    @SerializedName("periods")
    var periods: List<Period>? = null
    @SerializedName("weekday_text")
    var weekdayText: List<String>? = null

}
