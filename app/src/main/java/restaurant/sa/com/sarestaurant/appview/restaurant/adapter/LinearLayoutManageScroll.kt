package restaurant.sa.com.sarestaurant.appview.restaurant.adapter

import android.support.v7.widget.LinearLayoutManager
import android.content.Context
import android.util.Log

class LinearLayoutManageScroll(var context: Context): LinearLayoutManager(context) {

    private var isScrollEnabled = true

    fun setScrollEnabled(flag: Boolean){

        Log.d("sse", "$isScrollEnabled: ");
        this.isScrollEnabled = flag
    }

    override fun canScrollVertically(): Boolean {
        Log.d("LLMS", "$isScrollEnabled: ");
        return isScrollEnabled && super.canScrollVertically()
    }
}