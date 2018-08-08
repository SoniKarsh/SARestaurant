package restaurant.sa.com.sarestaurant.appview.restaurant.model

data class TitleImgModel(var name: String, var imgUrl: String, var address: String, var rating: Double?)
{
    constructor():this("", "", "", null)
}