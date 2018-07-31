package restaurant.sa.com.sarestaurant.appview.restaurant.model

data class RestaurantDetailModel(var rest_name: String, var rest_address: String, var imgUrl: String,
                                 var rest_isClosed: String, var rating: Double) {

    constructor():this("","", "", "", 0.0)

}