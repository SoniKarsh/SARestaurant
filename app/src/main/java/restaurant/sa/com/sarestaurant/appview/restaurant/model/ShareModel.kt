package restaurant.sa.com.sarestaurant.appview.restaurant.model

data class ShareModel(var name: String, var address: String, var imgUrl: String){
    constructor():this("","", "")
}
