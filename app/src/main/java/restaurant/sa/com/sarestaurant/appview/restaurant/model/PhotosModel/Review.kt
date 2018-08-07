package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel

import com.google.gson.annotations.SerializedName

class Review {

    @SerializedName("author_name")
    var authorName: String? = null
    @SerializedName("author_url")
    var authorUrl: String? = null
    @SerializedName("language")
    var language: String? = null
    @SerializedName("profile_photo_url")
    var profilePhotoUrl: String? = null
    @SerializedName("rating")
    var rating: Long? = null
    @SerializedName("relative_time_description")
    var relativeTimeDescription: String? = null
    @SerializedName("text")
    var text: String? = null
    @SerializedName("time")
    var time: Long? = null

}
