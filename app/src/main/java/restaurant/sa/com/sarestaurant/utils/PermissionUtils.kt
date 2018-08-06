package restaurant.sa.com.sarestaurant.utils

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.util.Log
import restaurant.sa.com.sarestaurant.HomeActivity

class PermissionUtils(private val context: Context): ActivityCompat.OnRequestPermissionsResultCallback {

    private var permissionGranted: PermissionGranted? = null
    var permissionCount = 0
    lateinit var homeActivity: HomeActivity
    val TAG = "PermissionUtils"
    val LOCATION_PERMISSION_REQUEST_CODE = 9001
    var nonGrantedPermissions: Array<String>? = null
    var PERMISSION_GRANTED = "Permission GRANTED"
    var PERMISSION_DENIED = "Permission DENIED"
    var permissions: Array<String>? = null

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        var nonGreanted = ArrayList<String>()
        when(requestCode){
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if(grantResults.isNotEmpty()){
                    for (i in 0 until grantResults.size){
                        if (ContextCompat.checkSelfPermission(context, permissions[i]) == PackageManager.PERMISSION_GRANTED){
                            // Show SnackBar
                            if(permissionGranted != null){
                                permissionGranted!!.onPermissionGranted()
                            }
                        }else{
                            nonGreanted.add(permissions[i])
                        }
                    }
                    if(nonGreanted.isNotEmpty()){
                        askForPermissions(nonGreanted.toTypedArray())
                    }else{

                    }
                }else{
                    for (i in 0 until permissions.size){
                        this.permissions!![i] = permissions[i]
                    }
                    LogUtils.setTag(TAG)
                    LogUtils.d(this.permissions.toString())
                    ToastUtils.lengthShort(context, this.permissions.toString())
                    askForPermissions(this.permissions!!)
                }
            }
            else -> {
                LogUtils.setTag(TAG)
                LogUtils.d("Request Code Doesnt match")
            }
        }
    }

    fun checkPermissions(permissionList: Array<String>) {

        homeActivity = context as HomeActivity

        for(i in 0 until permissionList.size){
            if(ContextCompat.checkSelfPermission(context, permissionList[i]) == PackageManager.PERMISSION_GRANTED) {
                permissionCount++
            }else{
                nonGrantedPermissions = arrayOf(permissionList[i])
            }
        }

        if(permissionCount < permissionList.size){
            askForPermissions(nonGrantedPermissions!!)
        }else{
            if(permissionGranted != null){
                Log.d(TAG, "True: ");
                permissionGranted!!.onPermissionGranted()
            }
            ToastUtils.lengthShort(context, PERMISSION_GRANTED)
        }
    }

    fun askForPermissions(permissionList: Array<String>){
        LogUtils.setTag(TAG)
        LogUtils.d("askForPermission")
        for(i in 0 until permissionList.size){
            if(ActivityCompat.shouldShowRequestPermissionRationale(homeActivity, permissionList[i])){
                AlertDialog.Builder(homeActivity)
                        .setTitle("Permission needed")
                        .setMessage("This permission is needed because of fetching nearby restaurant list" +
                                " and fetching weather data.")
                        .setPositiveButton("ok") { dialog, which ->
                            ActivityCompat.requestPermissions(homeActivity,
                                    permissionList, LOCATION_PERMISSION_REQUEST_CODE)
                        }
                        .setNegativeButton("cancel") { dialog, which -> dialog.dismiss() }
                        .create().show()
            }else{
                permissions = arrayOf(permissionList[i])
                ActivityCompat.requestPermissions(homeActivity, permissions!!, LOCATION_PERMISSION_REQUEST_CODE)
            }
        }
    }

    fun setPermissionGranted(permissionGranted: PermissionGranted) {
        this.permissionGranted = permissionGranted
    }
    /**
     * This is callback interface.
     */
    interface PermissionGranted{
        fun onPermissionGranted()
        fun onPermissionDenied()
    }

}