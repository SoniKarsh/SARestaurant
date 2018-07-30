package restaurant.sa.com.sarestaurant.appview.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.*
import android.widget.Toast
import android.content.Context.ALARM_SERVICE
import android.content.Intent
import android.content.Context.ALARM_SERVICE


class MyReceiver : BroadcastReceiver(){
    lateinit var messageText: String
    override fun onReceive(context: Context?, intent: Intent?) {
        val alarmMgr: AlarmManager
        val alarmIntent: PendingIntent
        val extras = intent!!.extras
        val msgString = "set an alarm"
        setAlarm(600000, context)

    }

    fun setAlarm(time: Long, context: Context?) {
        //getting the alarm manager
        val am = context!!.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //creating a new intent specifying the broadcast receiver
        val i = Intent(context, MyAlarm::class.java)

        //creating a pending intent using the intent
        val pi = PendingIntent.getBroadcast(context, 0, i, 0)

        //setting the repeating alarm that will be fired every day
        am.setRepeating(AlarmManager.RTC, time, 60*60*1000, pi)
        Toast.makeText(context, "Alarm is set", Toast.LENGTH_SHORT).show()
    }


}