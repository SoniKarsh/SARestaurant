package restaurant.sa.com.sarestaurant.appview.restaurant.favorite

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.fragment_restaurant.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication
import restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter.FavoriteListAdapter
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenterImp
import restaurant.sa.com.sarestaurant.appview.restaurant.view.RestaurantView
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel

class FavoriteFragment: Fragment(), RestaurantView {

    val BASE_URL = "https://maps.googleapis.com"
    val TAG = "FavoriteFragment"
    lateinit var homeActivity: HomeActivity
    var listOfPlacesLocation: ArrayList<LatLng> = ArrayList()
    lateinit var restaurantPresenterImp: RestaurantPresenterImp
    lateinit var locationCommunication: LocationCommunication
    var restaurantView: RestaurantView? = null
    private val handler: Handler? = Handler()

    override fun stopProgress() {
        progressBar.visibility = View.GONE
    }

    override fun startProgress() {
        Log.d(TAG, ": Progress Started");
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        SARestaurantApp.instance!!.isFavVisible = true
        homeActivity = context as HomeActivity
        context.supportActionBar?.title = TAG
        homeActivity.supportActionBar?.show()
        locationCommunication = homeActivity
        restaurantView = this
    }

    override fun onDetach() {
        SARestaurantApp.instance!!.isFavVisible = false
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_restaurant, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        restaurantPresenterImp = RestaurantPresenterImp()
        fetchData()
        simpleSwipeRefreshLayout.setOnRefreshListener {
            handler!!.postDelayed(runnable, 2000)
        }

    }

    override fun onStop() {
        super.onStop()
        if(handler!=null) {
            handler.removeCallbacks(runnable)
        }
    }

    private val runnable = Runnable {
        simpleSwipeRefreshLayout.setRefreshing(false)
        // Generate a random integer number
        fetchData()
        // set the number value in TextView
    }

    fun fetchData(){
        val layout = LinearLayoutManager(activity)
        restaurantPresenterImp.getListOfFavLocations(SARestaurantApp.database!!.favoriteRestaurantDao().getAll() as ArrayList<FavoriteRestaurantModel>, object : RestaurantPresenter.OnCallBack{
            override fun onResponse(listOfLocations: ArrayList<LatLng>) {
                // isClickableForMap
                SARestaurantApp.instance!!.isClickableForMap == true

                listOfPlacesLocation = listOfLocations
                Log.d(TAG, "onResponse: Stop Progress")
                restaurantView!!.stopProgress()
            }

            override fun onFailed() {
                restaurantView!!.stopProgress()
                Toast.makeText(homeActivity, "Error Occurred!!!", Toast.LENGTH_LONG).show()
            }
        })
        locationCommunication.sendLocationFromRestaurant(listOfPlacesLocation)
        recyclerView.adapter = FavoriteListAdapter(SARestaurantApp.database!!.favoriteRestaurantDao().getAll(), homeActivity)
        recyclerView.layoutManager = layout
    }

}