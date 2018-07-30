package restaurant.sa.com.sarestaurant.appview.location.presenter

import android.location.Location
import com.google.android.gms.maps.model.LatLng

interface LocationCommunication {

    fun sendLocationFromRestaurant(listOfLocations:ArrayList<LatLng>)

    fun getLocationFromRestaurant(): ArrayList<LatLng>

}