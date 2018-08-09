package restaurant.sa.com.sarestaurant.appview.restaurant.presenter

import com.google.android.gms.maps.model.LatLng
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel

interface RestaurantPresenter {

    fun getListOfLocations(responseFromParse: ResponseModelClass) :ArrayList<LatLng>

    fun getListOfFavLocations(listOfFavoriteRestaurantModel: ArrayList<FavoriteRestaurantModel>, listener: OnCallBack)

    fun getListOfTitleImg(responseFromParse: ResponseModelClass) :ArrayList<TitleImgModel>

    fun getFavListOfTitleImg(listOfFavoriteRestaurantModel: ArrayList<FavoriteRestaurantModel>, listener: OnTitleImgCallBack) :ArrayList<TitleImgModel>

    interface OnCallBack{

        fun onResponse(listOfLocations: ArrayList<LatLng>?)

        fun onFailed()

    }

    interface OnTitleImgCallBack{
        fun onResponse(titleImgModel: ArrayList<TitleImgModel>?)

        fun onFailed()
    }

}