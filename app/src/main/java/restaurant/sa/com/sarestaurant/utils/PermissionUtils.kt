package restaurant.sa.com.sarestaurant.utils

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Build
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.util.Log
import restaurant.sa.com.sarestaurant.HomeActivity
import java.util.jar.Manifest

class PermissionUtils(private val context: Context): ActivityCompat.OnRequestPermissionsResultCallback {

//    private var permissionGranted: PermissionGranted? = null
    var permissionCount = 0
    lateinit var homeActivity: HomeActivity
    val TAG = "PermissionUtils"
    val LOCATION_PERMISSION_REQUEST_CODE = 9001
    var nonGrantedPermissions: Array<String>? = null
    companion object {
        val PERMISSION_COARSE_LOCATION = android.Manifest.permission.ACCESS_COARSE_LOCATION
        val PERMISSION_FINE_LOCATION = android.Manifest.permission.ACCESS_FINE_LOCATION
    }



    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        var nonGreanted = ArrayList<String>()
        when(requestCode){
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if(grantResults.isNotEmpty()){
                    for(i in 0 until grantResults.size){
                        if (ContextCompat.checkSelfPermission(context, permissions[i]) == PackageManager.PERMISSION_GRANTED){
                            // Show SnackBar
                        }else{
                            nonGreanted.add(permissions[i])
                        }
                    }
                    if(nonGreanted.isEmpty()){

                    }else{
                        for(i in nonGreanted){
                            ActivityCompat.shouldShowRequestPermissionRationale(context as HomeActivity, i)
                            AlertDialog.Builder(context)
                                    .setIcon(android.R.drawable.ic_dialog_info)
                                    .setTitle("Permission")
                                    .setMessage("Please give location permission to continue access the feature. Otherwise some feature might not work.")
                                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->  askForPermissions(i)})
                                    .setNegativeButton("No", null)
                                    .show()
                        }
                    }
                }else{
                    for(i in permissions){
                        ActivityCompat.shouldShowRequestPermissionRationale(context as HomeActivity, i)
                        AlertDialog.Builder(context)
                                .setIcon(android.R.drawable.ic_dialog_info)
                                .setTitle("Permission")
                                .setMessage("Please give location permission to continue access the feature. Otherwise some feature might not work.")
                                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->  askForPermissions(i)})
                                .setNegativeButton("No", null)
                                .show()
                    }
                }
            }
        }
    }

    fun checkPermissions(permissionList: Array<String>) {
//        Log.d(TAG, "getLocationPermission: getting location permissions")

        homeActivity = context as HomeActivity

        for(i in 0 until permissionList.size){
            if(ContextCompat.checkSelfPermission(context, permissionList[i]) == PackageManager.PERMISSION_GRANTED) {
                permissionCount++
            }else{
                nonGrantedPermissions = arrayOf(permissionList[i])
                Log.d(TAG, "$nonGrantedPermissions: MISSION")
            }
        }

        if(permissionCount < permissionList.size){
            ActivityCompat.requestPermissions(homeActivity, nonGrantedPermissions!!, LOCATION_PERMISSION_REQUEST_CODE)
        }

        Log.d(TAG, "onCreate: $permissionCount ${permissionList.size}")
//        return permissionCount == permissionList.size
    }

    fun askForPermissions(permissionList: Array<String>){
        Log.d(TAG, "askForPermissions: ");
        ActivityCompat.requestPermissions(homeActivity, permissionList, LOCATION_PERMISSION_REQUEST_CODE)
//        ActivityCompat.requestPermissions(mainActivity, )
    }
    fun askForPermissions(permissionList: String){
        Log.d(TAG, "askForPermissions: ");
        var permissions = arrayOf(permissionList)
        ActivityCompat.requestPermissions(homeActivity, permissions, LOCATION_PERMISSION_REQUEST_CODE)
//        ActivityCompat.requestPermissions(mainActivity, )
    }
//
//    interface PermissionGranted {
//        fun onPermissionGranted(requestCode: Int)
//    }

}