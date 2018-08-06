package restaurant.sa.com.sarestaurant.appview.restaurant

import android.content.Context
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_restaurant_detail.*
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import android.support.v4.view.ViewPager
import restaurant.sa.com.sarestaurant.appview.restaurant.adapter.ImageSlideAdapter
import android.support.constraint.ConstraintSet
import restaurant.sa.com.sarestaurant.SARestaurantApp


class RestaurantDetailFragment: Fragment(), DetailPresenter {

    var detailPresenter: DetailPresenter? = null
    var restaurantDetailModel: RestaurantDetailModel? = null
    private val TAG = "RestDetailFragment";
    private var mPager: ViewPager? = null
    var imageArrayList: ArrayList<String> = ArrayList()
    var imgUrl: String? = null
    lateinit var thisContext: Context
    val noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png"

    override fun getRestaurantData(restaurantDetailModel: RestaurantDetailModel) {
        this.restaurantDetailModel = restaurantDetailModel
        Log.d(TAG, "getRestaurantData: ${restaurantDetailModel}");
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        SARestaurantApp.isRestDetailVisible = true
//        context.supportActionBar?.title = TAG
        thisContext = context!!
        detailPresenter = this
    }

    override fun onDetach() {
        SARestaurantApp.isRestDetailVisible = false
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_restaurant_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(restaurantDetailModel!!.imageUrlList!![0] != ""){
            for(i in restaurantDetailModel!!.imageUrlList!!){
                imgUrl = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=$i&sensor=false&key=${thisContext.resources.getString(R.string.google_maps_key)}"
                imageArrayList.add(imgUrl!!)
            }
        }else{
            imageArrayList.add(noImage)
        }

        mPager = activity!!.findViewById(R.id.viewPager) as ViewPager
        mPager!!.setAdapter(ImageSlideAdapter(context!!, imageArrayList))

        restDetailName.text = restaurantDetailModel!!.rest_name
        restDetailAddress.text = restaurantDetailModel!!.rest_address
        ratingBar.rating = restaurantDetailModel!!.rating.toFloat()
        if(ratingBar.rating == 0.0.toFloat()){
            ratingBar.visibility = View.GONE
            noRatingTV.visibility = View.VISIBLE
            noRatingTV.text = getString(R.string.no_rate_available)
        }
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