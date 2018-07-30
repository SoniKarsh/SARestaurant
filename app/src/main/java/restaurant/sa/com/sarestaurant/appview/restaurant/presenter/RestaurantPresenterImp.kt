package restaurant.sa.com.sarestaurant.appview.restaurant.presenter

import android.util.Log
import com.google.android.gms.maps.model.LatLng
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel
import javax.sql.RowSetListener

class RestaurantPresenterImp: RestaurantPresenter {

    var listOfLocations: ArrayList<LatLng> = ArrayList()
    var listOfFavLocations: ArrayList<LatLng> = ArrayList()

    override fun getListOfLocations(responseFromParse: ResponseModelClass): ArrayList<LatLng> {

        for(i in responseFromParse.results){
            listOfLocations.add(LatLng(i.geometry.location.lat, i.geometry.location.lng))
        }

        return listOfLocations
    }

    override fun getListOfFavLocations(listOfFavoriteRestaurantModel: ArrayList<FavoriteRestaurantModel>, listener: RestaurantPresenter.onCallback) {

        Log.d("RestaurantPresenterImp", "getListOfFavLocations: ${listOfFavoriteRestaurantModel.size}")
        Log.d("RestaurantPresenterImp", "getListOfFavLocations: ${listOfFavoriteRestaurantModel}")

        for(i in listOfFavoriteRestaurantModel){
            listOfFavLocations.add(LatLng(i.latitude!!, i.longitude!!))
        }

        listener.onResponse(listOfFavLocations)

    }

}