package restaurant.sa.com.sarestaurant.appview.restaurant.adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import restaurant.sa.com.sarestaurant.R

import java.util.ArrayList

class ImageSlideAdapter(val context: Context, val images: ArrayList<String>) : PagerAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    var i = 0
    val TAG = "ImageSlideAdapter"
    var isStopped = false

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val myImageLayout = inflater.inflate(R.layout.slide, view, false)
        val myImage = myImageLayout
                .findViewById(R.id.image) as ImageView
        Log.d(TAG, "instantiateItem: called${i}");
        Picasso.get().load(images[position])
                .into(myImage)
//        myImage.setImageResource(images[position])
        view.addView(myImageLayout, 0)
        return myImageLayout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }
}