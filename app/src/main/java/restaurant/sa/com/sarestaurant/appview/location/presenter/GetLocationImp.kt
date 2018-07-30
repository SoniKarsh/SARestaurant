package restaurant.sa.com.sarestaurant.appview.location.presenter

import android.content.Context
import android.location.Location
import android.util.Log
import com.google.android.gms.location.*

class GetLocationImp(var mLocationPermissionsGranted: Boolean, var mFusedLocationProviderClient: FusedLocationProviderClient, var context: Context): GetLocation {

    val TAG = "GetLocation"
    var currentLocation: Location? = null

    override fun sendLocation(listener: GetLocation.OnReceiveLocation) {
        Log.d(TAG,"getDeviceLocation: getting the current devices location ")
        try {
            if (mLocationPermissionsGranted){
                var location = mFusedLocationProviderClient.lastLocation
                location.addOnCompleteListener {
                    if(it.isSuccessful){
                        Log.d(TAG, "getDeviceLocation: found Location${it.result}")
                        currentLocation = it.result
                        if(currentLocation != null){
                            listener.getDeviceLastLocation(currentLocation!!)
                        }
                        else{
                            Log.d(TAG, "sendLocation: NULL");
                        }
//                        this.getDeviceLastLocation(it.result)
//                        locationCommunication.sendLocation(it.result)
                    }else{
//                        locationCommunication.sendLocation(it.result)
                        Log.d(TAG, "getDeviceLocation: Current location is null")
                        val error = "getDeviceLocation: Current location is null"
                        listener.onError(error)
                    }
                }
            }
        }catch (e: SecurityException) {
            Log.e(TAG, "getDeviceLocation: SecurityException: " + e.message)
        }
    }

    //    lateinit var locationCommunication: LocationCommunication
//    override fun getDeviceLastLocation(){
//        Log.d(TAG,"getDeviceLocation: getting the current devices location ")
//        try {
//            if (mLocationPermissionsGranted){
//                var location = mFusedLocationProviderClient.lastLocation
//                location.addOnCompleteListener {
//                    if(it.isSuccessful){
//                        Log.d(TAG, "getDeviceLocation: found Location${it.result}")
//                        currentLocation = it.result
////                        this.getDeviceLastLocation(it.result)
////                        locationCommunication.sendLocation(it.result)
//                    }else{
////                        locationCommunication.sendLocation(it.result)
//                        Log.d(TAG, "getDeviceLocation: Current location is null")
//                    }
//                }
//            }
//        }catch (e: SecurityException) {
//            Log.e(TAG, "getDeviceLocation: SecurityException: " + e.message)
//        }
//    }
//
//    override fun receiveLocationUpdatesFun(){
//        try{
//            if (mLocationPermissionsGranted){
//                locationRequest = LocationRequest()
//                locationRequest?.interval = 7500 //use a value fo about 10 to 15s for a real app
//                locationRequest?.fastestInterval = 5000
//                locationRequest?.priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
//                locationCallback = object : LocationCallback() {
//                    override fun onLocationResult(locationResult: LocationResult?) {
//                        super.onLocationResult(locationResult)
//                        for (location in locationResult!!.locations) {
//                            //Update UI with location data
//                            if (location != null) {
//                                Log.d(TAG, "onLocationResult: $location");
//                            }
//                        }
//                    }
//                }
//                mFusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null)
//            }
//        }catch (e: SecurityException){
//            Log.e(TAG, "e: ");
//        }catch (e: Exception){
//            Log.e(TAG, "e: ");
//        }
//    }
//
//    override fun onError() {
//        Log.d(TAG, "getDeviceLocation: Current location is null")
//    }



}