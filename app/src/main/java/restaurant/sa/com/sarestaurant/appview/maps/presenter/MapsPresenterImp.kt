package restaurant.sa.com.sarestaurant.appview.maps.presenter

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability

class MapsPresenterImp: MapsPresenter {

    val TAG = "MapsPresenterImp"
    val ERROR_DIALOG_REQUEST = 9001

    override fun isServicesOK(activity: AppCompatActivity):Boolean{
        Log.d(TAG, "isServicesOK: Checking google service version")

        val available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(activity)
        when {
            available == ConnectionResult.SUCCESS -> {
                Log.d(TAG, "isServicesOK: Google Play Services Working")
                return true
            }
            GoogleApiAvailability.getInstance().isUserResolvableError(available) -> {
                Log.d(TAG, "isServicesOK: Error occured but we can fix it.")
                val dialog = GoogleApiAvailability.getInstance().getErrorDialog(activity, available, ERROR_DIALOG_REQUEST)
                dialog.show()
            }
            else -> Toast.makeText(activity, "You can't make map request.", Toast.LENGTH_LONG).show()
        }
        return false
    }
}