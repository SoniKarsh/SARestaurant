package restaurant.sa.com.sarestaurant.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import restaurant.sa.com.sarestaurant.HomeActivity
import java.util.jar.Manifest

class PermissionUtils(private val context: Context): ActivityCompat.OnRequestPermissionsResultCallback {

//    private var permissionGranted: PermissionGranted? = null
    var permissionCount = 0
    lateinit var homeActivity: HomeActivity

    companion object {
        val PERMISSION_COARSE_LOCATION = android.Manifest.permission.ACCESS_COARSE_LOCATION
        val PERMISSION_FINE_LOCATION = android.Manifest.permission.ACCESS_FINE_LOCATION
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {

    }

    val TAG = "PermissionUtils"
    val LOCATION_PERMISSION_REQUEST_CODE = 9001
    var nonGrantedPermissions: Array<String>? = null

    fun checkPermissions(permissionList: ArrayList<String>): Boolean {
//        Log.d(TAG, "getLocationPermission: getting location permissions")

        homeActivity = context as HomeActivity

        for(i in 0 until permissionList.size){
            if(ContextCompat.checkSelfPermission(context, permissionList[i]) == PackageManager.PERMISSION_GRANTED) {
                permissionCount++
            }else{
                nonGrantedPermissions = arrayOf(permissionList[i])
                Log.d(TAG, "$nonGrantedPermissions: MISSION");
            }
        }

        if(permissionCount < permissionList.size){
            ActivityCompat.requestPermissions(homeActivity, nonGrantedPermissions!!, LOCATION_PERMISSION_REQUEST_CODE)
        }

        Log.d(TAG, "onCreate: $permissionCount ${permissionList.size}");
        return permissionCount == permissionList.size
    }

    fun askForPermissions(){
        Log.d(TAG, "askForPermissions: ");
        ActivityCompat.requestPermissions(homeActivity, nonGrantedPermissions!!, LOCATION_PERMISSION_REQUEST_CODE)
//        ActivityCompat.requestPermissions(mainActivity, )
    }
//
//    interface PermissionGranted {
//        fun onPermissionGranted(requestCode: Int)
//    }

}