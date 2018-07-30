package restaurant.sa.com.sarestaurant.appview.maps

import android.annotation.SuppressLint
import android.app.*
import android.content.ContentResolver
import android.content.Intent
import com.google.android.gms.location.GeofencingEvent
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Color
import android.location.Address
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofenceStatusCodes
import restaurant.sa.com.sarestaurant.R
import android.text.TextUtils
import android.location.Geocoder
import android.net.Uri
import restaurant.sa.com.sarestaurant.HomeActivity
import java.util.*


class LocationAlertIntentService: IntentService("LocationAlertIS") {

    val TAG = "LocationAlertIS"
//    lateinit var notificationChannel:NotificationChannel
    lateinit var notification:Notification

    override fun onHandleIntent(intent: Intent?) {
        val geofencingEvent = GeofencingEvent.fromIntent(intent)

        if (geofencingEvent.hasError()) {
            Log.e(TAG, "" + getErrorString(geofencingEvent.getErrorCode()));
            return;
        }

        Log.i(TAG, geofencingEvent.toString())

        val geofenceTransition = geofencingEvent.geofenceTransition

        if (geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER || geofenceTransition == Geofence.GEOFENCE_TRANSITION_DWELL) {

            val triggeringGeofences = geofencingEvent.triggeringGeofences

            val transitionDetails = getGeofenceTransitionInfo(
                    triggeringGeofences)

            val transitionType = getTransitionString(geofenceTransition)


            notifyLocationAlert(transitionType, transitionDetails)
        }

    }

    private fun getGeofenceTransitionInfo(triggeringGeofences: List<Geofence>): String {
        val locationNames = ArrayList<String>()
        for (geofence in triggeringGeofences) {
            locationNames.add(getLocationName(geofence.requestId))
        }

        return TextUtils.join(", ", locationNames)
    }

    private fun getLocationName(key: String): String {
        val strs = key.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        var locationName: String? = null
        if (strs != null && strs.size == 2) {
            val lat = java.lang.Double.parseDouble(strs[0])
            val lng = java.lang.Double.parseDouble(strs[1])

            locationName = getLocationNameGeocoder(lat, lng)
        }
        return if (locationName != null) {
            locationName
        } else {
            key
        }
    }

    private fun getLocationNameGeocoder(lat: Double, lng: Double): String? {
        val geocoder = Geocoder(this, Locale.getDefault())
        var addresses: List<Address>? = null

        try {
            addresses = geocoder.getFromLocation(lat, lng, 1)
        } catch (ioException: Exception) {
            Log.e("", "Error in getting location name for the location")
        }

        if (addresses == null || addresses.size == 0) {
            Log.d("", "no location name")
            return null
        } else {
            val address = addresses[0]
            val addressInfo = ArrayList<String>()
            for (i in 0..address.getMaxAddressLineIndex()) {
                addressInfo.add(address.getAddressLine(i))
            }

            return TextUtils.join(System.getProperty("line.separator"), addressInfo)
        }
    }

    private fun getErrorString(errorCode: Int): String {
        when (errorCode) {
            GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE -> return "Geofence not available"
            GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES -> return "geofence too many_geofences"
            GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS -> return "geofence too many pending_intents"
            else -> return "geofence error"
        }
    }

    private fun getTransitionString(transitionType: Int): String {
        when (transitionType) {
            Geofence.GEOFENCE_TRANSITION_ENTER -> return "location entered"
            Geofence.GEOFENCE_TRANSITION_EXIT -> return "location exited"
            Geofence.GEOFENCE_TRANSITION_DWELL -> return "dwell at location"
            else -> return "location transition"
        }
    }


    private fun notifyLocationAlert(locTransitionType: String, locationDetails: String) {

        var notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        Log.i("Notification triggered","success")
        notificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationIntent = Intent(this, HomeActivity::class.java)
        //  var geofenceName= geofenceTransitionDetails.list!![0].requestId

        val pendingIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT)
        //  var remoteView: RemoteViews = RemoteViews(this.packageName, R.layout.custom_notification)

        val alarmSound = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE
                + "://" + this.packageName + "/raw/plucky")
        notification = NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Yay!! fav restaurant is near")
                .setOngoing(false)
                .setContentText("wanna visit it?")
                .setSound(alarmSound)
                .setContentIntent(pendingIntent).build()


    }

}