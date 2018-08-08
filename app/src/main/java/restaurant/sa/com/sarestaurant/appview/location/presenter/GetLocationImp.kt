package restaurant.sa.com.sarestaurant.appview.location.presenter

import android.content.Context
import android.location.Location
import com.google.android.gms.location.*
import restaurant.sa.com.sarestaurant.utils.LogUtils

class GetLocationImp(var mLocationPermissionsGranted: Boolean, var mFusedLocationProviderClient: FusedLocationProviderClient, var context: Context): GetLocation {

    private val TAG = "GetLocation"
    private var currentLocation: Location? = null
    private val error = "getDeviceLocation: Current location is null"

    override fun sendLocation(listener: GetLocation.OnReceiveLocation) {
        try {
            if (mLocationPermissionsGranted){
                val location = mFusedLocationProviderClient.lastLocation
                location.addOnCompleteListener {
                    if(it.isSuccessful){
                        LogUtils.setTag(TAG)
                        LogUtils.d("getDeviceLocation: found Location${it.result}")
                        currentLocation = it.result
                        if(currentLocation != null){
                            listener.getDeviceLastLocation(currentLocation!!)
                        }
                        else{
                            LogUtils.setTag(TAG)
                            LogUtils.d("sendLocation: NULL")
                        }
                    }else{
                        LogUtils.setTag(TAG)
                        LogUtils.d(error)
                        listener.onError(error)
                    }
                }
            }
        }catch (e: SecurityException) {
            LogUtils.setTag(TAG)
            LogUtils.e("getDeviceLocation: SecurityException: " + e.message)
        }
    }
}