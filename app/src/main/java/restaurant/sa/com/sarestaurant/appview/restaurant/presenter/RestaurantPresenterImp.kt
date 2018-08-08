package restaurant.sa.com.sarestaurant.appview.restaurant.presenter

import android.util.Log
import com.google.android.gms.maps.model.LatLng
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel

class RestaurantPresenterImp: RestaurantPresenter {

    var listOfLocations: ArrayList<LatLng> = ArrayList()
    var listOfTitleImgModel: ArrayList<TitleImgModel> = ArrayList()
    var listOfFavLocations: ArrayList<LatLng> = ArrayList()
    val noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png"
    var imgUrl: String = ""

    override fun getListOfLocations(responseFromParse: ResponseModelClass): ArrayList<LatLng> {

        for(i in responseFromParse.results!!){
            listOfLocations.add(LatLng(i.geometry!!.location!!.lat!!, i.geometry!!.location!!.lng!!))
        }

        return listOfLocations
    }

    override fun getListOfFavLocations(listOfFavoriteRestaurantModel: ArrayList<FavoriteRestaurantModel>, listener: RestaurantPresenter.OnCallBack) {

        Log.d("RestaurantPresenterImp", "getListOfFavLocations: ${listOfFavoriteRestaurantModel.size}")
        Log.d("RestaurantPresenterImp", "getListOfFavLocations: ${listOfFavoriteRestaurantModel}")

        for(i in listOfFavoriteRestaurantModel){
            listOfFavLocations.add(LatLng(i.latitude!!, i.longitude!!))
        }

        listener.onResponse(listOfFavLocations)

    }

    override fun getListOfTitleImg(responseFromParse: ResponseModelClass): ArrayList<TitleImgModel> {
        for(i in responseFromParse.results!!){
            if(i.photos!=null){
                imgUrl = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=${i.photos!![0].photoReference!!}&sensor=false&key=AIzaSyC6Smj8wi2qTcaacRBzOVRBNpZUTpEIgvg"
                listOfTitleImgModel.add(TitleImgModel(i.name, imgUrl, i.vicinity!!, i.rating))
            }else{
                listOfTitleImgModel.add(TitleImgModel(i.name, noImage, i.vicinity!!, i.rating))
            }
        }

        return listOfTitleImgModel
    }

}