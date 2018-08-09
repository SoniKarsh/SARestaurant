package restaurant.sa.com.sarestaurant.appview.alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ApiCallReceiver: BroadcastReceiver() {

    val TAG = "ApiCallReceiver"

    override fun onReceive(context: Context?, intent: Intent?) {
        val background = Intent(context, ApiCallService::class.java)
        context!!.startService(background)
    }

}