package restaurant.sa.com.sarestaurant.utils

import android.content.Context
import android.util.Log
import android.widget.Toast

object ToastUtils {

    private var TAG = "TAG"

    fun setTag(TAG: String) {
        ToastUtils.TAG = TAG
    }

    fun lengthLong(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun lengthShort(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}