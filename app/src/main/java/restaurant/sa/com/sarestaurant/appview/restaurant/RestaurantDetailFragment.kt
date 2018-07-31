package restaurant.sa.com.sarestaurant.appview.restaurant

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_restaurant_detail.*
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import restaurant.sa.com.sarestaurant.MainActivity
import android.support.v4.view.ViewPager
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.ImageSlideAdapter


class RestaurantDetailFragment: Fragment(), DetailPresenter {

    var detailPresenter: DetailPresenter? = null
    var restaurantDetailModel: RestaurantDetailModel? = null
    private val TAG = "RestDetailFragment";
    private var mPager: ViewPager? = null
    private var currentPage = 0
    private val XMEN = arrayOf<Int>(R.drawable.ic_google_plus, R.drawable.ic_facebook, R.drawable.ic_favorite_black_24dp)
    private var XMENArray = ArrayList<Int>()

    override fun getRestaurantData(restaurantDetailModel: RestaurantDetailModel) {
        this.restaurantDetailModel = restaurantDetailModel
        Log.d(TAG, "getRestaurantData: ${restaurantDetailModel}");
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        detailPresenter = this
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_restaurant_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        for (i in 0 until XMEN.size)
            XMENArray.add(XMEN[i])

        mPager = activity!!.findViewById(R.id.viewPager) as ViewPager
        mPager!!.setAdapter(ImageSlideAdapter(context!!, XMENArray))

        restDetailName.text = restaurantDetailModel!!.rest_name
        restDetailAddress.text = restaurantDetailModel!!.rest_address
        ratingBar.rating = restaurantDetailModel!!.rating.toFloat()
        if(restaurantDetailModel!!.rest_isClosed == "true"){
            openingHours.text = getString(R.string.yes)
        }else if(restaurantDetailModel!!.rest_isClosed == "false"){
            openingHours.text = getString(R.string.no)
        }else{
            openingHours.text = getString(R.string.not_available)
        }
        Log.d(TAG, "onActivityCreated: ${restaurantDetailModel}");
    }
}