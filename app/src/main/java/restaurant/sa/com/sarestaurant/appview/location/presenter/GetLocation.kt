package restaurant.sa.com.sarestaurant.appview.location.presenter

import android.location.Location
import android.util.Log
import com.google.android.gms.location.*

interface GetLocation {

    interface OnReceiveLocation {

        fun onError(error: String)

        fun getDeviceLastLocation(location: Location)

        fun receiveLocationUpdatesFun()
    }

    fun sendLocation(listener: OnReceiveLocation)

}