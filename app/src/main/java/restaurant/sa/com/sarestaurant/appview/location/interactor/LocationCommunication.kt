package restaurant.sa.com.sarestaurant.appview.location.interactor

import com.google.android.gms.maps.model.LatLng
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel

interface LocationCommunication {

    fun sendLocationFromRestaurant(listOfLocations:ArrayList<LatLng>)

    fun getLocationFromRestaurant(): ArrayList<LatLng>

    fun sendNameImgFromRestaurant(listOfTitleImgModel: ArrayList<TitleImgModel>)

    fun getNameImgFromRestaurant(): ArrayList<TitleImgModel>

}