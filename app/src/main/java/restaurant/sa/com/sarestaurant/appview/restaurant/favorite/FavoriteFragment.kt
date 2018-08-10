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
import restaurant.sa.com.sarestaurant.utils.ToastUtils
import android.support.design.widget.Snackbar
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.utils.LogUtils


class FavoriteFragment: Fragment(), RestaurantView {

    val TAG = "FavoriteFragment"
    lateinit var homeActivity: HomeActivity
    var listOfPlacesLocation: ArrayList<LatLng> = ArrayList()
    lateinit var restaurantPresenterImp: RestaurantPresenterImp
    lateinit var locationCommunication: LocationCommunication
    var restaurantView: RestaurantView? = null
    private val handler: Handler? = Handler()
    private var snackbar: Snackbar? = null
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
        ToastUtils.setTag(TAG)
        ToastUtils.lengthShort(context!!, SARestaurantApp.instance!!.isClickableForMap.toString())
        restaurantPresenterImp = RestaurantPresenterImp()
        fetchData()
        simpleSwipeRefreshLayout.setOnRefreshListener {
            handler!!.postDelayed(runnable, 2000)
        }

    }

    override fun onStop() {
        super.onStop()
        if(snackbar!=null){
            snackbar!!.dismiss()
        }
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
            override fun onResponse(listOfLocations: ArrayList<LatLng>?) {

                if(!listOfLocations!!.isEmpty()){
                    LogUtils.setTag(TAG)
                    LogUtils.d(listOfLocations.toString())
                    SARestaurantApp.instance!!.isClickableForMap = true
                }else{
                    snackbar = Snackbar
                            .make(constraintLayoutRest, getString(R.string.no_data_found), Snackbar.LENGTH_INDEFINITE)
                            .setAction(getString(R.string.ok), View.OnClickListener {
                                ToastUtils.lengthShort(context!!, getString(R.string.refresh))
                            })
                    snackbar!!.show()
                }
                listOfPlacesLocation = listOfLocations
                locationCommunication.sendLocationFromRestaurant(listOfPlacesLocation)

                Log.d(TAG, "onResponse: Stop Progress")
                restaurantView!!.stopProgress()
            }

            override fun onFailed() {
                restaurantView!!.stopProgress()
                Toast.makeText(homeActivity, "Error Occurred!!!", Toast.LENGTH_LONG).show()
            }
        })

        // Title Image code .... need to change . just copied from above.
        restaurantPresenterImp.getFavListOfTitleImg(SARestaurantApp.database!!.favoriteRestaurantDao().getAll() as ArrayList<FavoriteRestaurantModel>, object : RestaurantPresenter.OnTitleImgCallBack{
            override fun onResponse(titleImgModel: ArrayList<TitleImgModel>?) {
                LogUtils.setTag(TAG)
                LogUtils.d(titleImgModel.toString())
                locationCommunication.sendNameImgFromRestaurant(titleImgModel!!)
            }

            override fun onFailed() {

            }

        })
        recyclerView.adapter = FavoriteListAdapter(SARestaurantApp.database!!.favoriteRestaurantDao().getAll(), homeActivity)
        recyclerView.layoutManager = layout
    }

}