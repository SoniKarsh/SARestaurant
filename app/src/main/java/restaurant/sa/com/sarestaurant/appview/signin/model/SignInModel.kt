package restaurant.sa.com.sarestaurant.appview.signin.model

data class SignInModel(var userName: String, var password: String){
    constructor():this("","")
}