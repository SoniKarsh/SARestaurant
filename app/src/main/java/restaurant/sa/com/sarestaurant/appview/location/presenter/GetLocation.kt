package restaurant.sa.com.sarestaurant.appview.location.presenter

import android.location.Location

interface GetLocation {

    interface OnReceiveLocation {

        fun onError(error: String)

        fun getDeviceLastLocation(location: Location)

    }

    fun sendLocation(listener: OnReceiveLocation)

}