package restaurant.sa.com.sarestaurant.appview.restaurant.presenter

import android.location.Location
import com.google.android.gms.maps.model.LatLng
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel

interface RestaurantPresenter {

    fun getListOfLocations(responseFromParse: ResponseModelClass) :ArrayList<LatLng>

    fun getListOfFavLocations(listOfFavoriteRestaurantModel: ArrayList<FavoriteRestaurantModel>, listener: onCallback)

    fun getListOfTitleImg(responseFromParse: ResponseModelClass) :ArrayList<TitleImgModel>

    interface onCallback{

        fun onResponse(listOfLocations: ArrayList<LatLng>)

        fun onFailed()

    }

}