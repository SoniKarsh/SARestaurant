package restaurant.sa.com.sarestaurant.appview.restaurant.adapter

import android.support.v7.widget.LinearLayoutManager
import android.content.Context

class LinearLayoutManageScroll(var context: Context): LinearLayoutManager(context) {

    private var isScrollEnabled = true

    fun setScrollEnabled(flag: Boolean){
        isScrollEnabled = flag
    }

    override fun canScrollVertically(): Boolean {
        return isScrollEnabled && super.canScrollVertically()
    }
}