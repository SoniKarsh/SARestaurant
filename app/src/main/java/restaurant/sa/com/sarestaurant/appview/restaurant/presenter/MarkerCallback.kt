package restaurant.sa.com.sarestaurant.appview.restaurant.presenter

import android.util.Log
import com.google.android.gms.maps.model.Marker
import restaurant.sa.com.sarestaurant.utils.LogUtils
import java.lang.Exception


internal class MarkerCallback(marker: Marker) : com.squareup.picasso.Callback {

    var marker: Marker? = null
    val TAG = "MarkerCallback"

    init {
        this.marker = marker
    }

    override fun onError(e: Exception?) {
        LogUtils.setTag(TAG)
        LogUtils.e(e.toString())
    }

    override fun onSuccess() {
        if (marker != null && marker!!.isInfoWindowShown) {
            marker!!.showInfoWindow()
        }
    }
}