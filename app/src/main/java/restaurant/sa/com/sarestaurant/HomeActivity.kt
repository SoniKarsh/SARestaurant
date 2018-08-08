package restaurant.sa.com.sarestaurant

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication
import restaurant.sa.com.sarestaurant.appview.maps.MapsFragment
import restaurant.sa.com.sarestaurant.appview.maps.presenter.MapsPresenterImp
import restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment
import restaurant.sa.com.sarestaurant.appview.restaurant.favorite.FavoriteFragment
import restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment
import android.content.DialogInterface
import android.location.Location
import android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE
import android.support.v7.app.AlertDialog
import android.support.v7.view.menu.ActionMenuItemView
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.facebook.login.LoginManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.content_home.*
import kotlinx.android.synthetic.main.nav_header_home.*
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocationImp
import restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback
import restaurant.sa.com.sarestaurant.utils.LogUtils
import restaurant.sa.com.sarestaurant.utils.PermissionUtils
import restaurant.sa.com.sarestaurant.utils.ToastUtils

class HomeActivity : AppCompatActivity(), DetailPresenter, NavigationView.OnNavigationItemSelectedListener, LocationCommunication, HomeCallback {

    override fun getRestaurantData(restaurantDetailModel: RestaurantDetailModel) {

    }

    override fun sendWeatherData(weatherData: WeatherData) {
        nav_tv.text = weatherData.temp
        Picasso.get().load(weatherData.imgUrl)
                .into(nav_img)
    }

    override fun getData() {
//        nav_tv.text = weatherData.temp
//        Picasso.get().load(weatherData.imgUrl)
//                .into(imageView)
    }

    val FRAGMENT_TAG = "SignInFragment"
    val RESTAURANT_FRAGMENT_TAG = "RestaurantFragment"
    val FAVORITE_RESTAURANT_FRAGMENT_TAG = "FavoriteFragment"
    val WEATHER_FRAGMENT_TAG = "WeatherFragment"
    val MAP_FRAGMENT_TAG = "MapsFragment"
    var mapsFragment = MapsFragment()
    var weatherFragment = WeatherFragment()
    lateinit var mapsPresenterImp: MapsPresenterImp
    var detailPresenter: DetailPresenter? = null
    private val TAG = "HomeActivity"
    var listOfLocations: ArrayList<LatLng>? = null
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    var restaurantFragment: RestaurantFragment? = null
    var favoriteFragment: FavoriteFragment? = null
    var restaurantDetailFragment: RestaurantDetailFragment? = null
    var FRAGMENT_DETAIL_REST = "RestaurantDetailFragment"
    var permissionUtils: PermissionUtils? = null
    var homeActivity: HomeActivity? = null
    var listOfTitleImgModel: ArrayList<TitleImgModel> = ArrayList()
//    var permissionGranted: PermissionUtils? = null
    var permissionList = arrayOf<String>(android.Manifest.permission.ACCESS_FINE_LOCATION)

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        permissionUtils!!.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun sendLocationFromRestaurant(listOfLocations: ArrayList<LatLng>) {
        Log.d(TAG, ": ${listOfLocations}");
        this.listOfLocations = listOfLocations
    }

    override fun getLocationFromRestaurant(): ArrayList<LatLng> {
        return listOfLocations!!
    }

    override fun sendNameImgFromRestaurant(listOfTitleImgModel: ArrayList<TitleImgModel>) {
        this.listOfTitleImgModel = listOfTitleImgModel
    }

    override fun getNameImgFromRestaurant(): ArrayList<TitleImgModel> {
        return listOfTitleImgModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        homeActivity = this
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        permissionUtils = PermissionUtils(this)
        permissionUtils!!.setPermissionGranted(object : PermissionUtils.PermissionGranted {
            override fun onPermissionGranted() {
                homeBtn.visibility = View.GONE
                homeTV.visibility = View.GONE
                getGPSLocation()
                ToastUtils.setTag(TAG)
                ToastUtils.lengthShort(this@HomeActivity, "GRANTED")
                val fragmentManager = homeActivity!!.supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, RestaurantFragment(), RESTAURANT_FRAGMENT_TAG)
                transaction.commit()
            }

            override fun onPermissionDenied() {
                // Create New Fragment
                fragmentHolder.visibility = View.GONE
                ToastUtils.setTag(TAG)
                ToastUtils.lengthShort(this@HomeActivity, "Permission Denied")
            }
        })
        permissionUtils!!.checkPermissions(permissionList)
        mapsPresenterImp = MapsPresenterImp()
        detailPresenter = this

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val headerView = navigationView.getHeaderView(0)
        var nav_userName = headerView.findViewById<TextView>(R.id.navUserName)
        var nav_emailId = headerView.findViewById<TextView>(R.id.navEmailId)
        nav_userName.text = SARestaurantApp.sharedPreference!!.getString("username", "")
        nav_emailId.text = SARestaurantApp.sharedPreference!!.getString("emailid", "")


        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        return super.onContextItemSelected(item)
    }

    fun getGPSLocation(){
        val getLocation = GetLocationImp(true, mFusedLocationProviderClient, this)
        getLocation.sendLocation(object: GetLocation.OnReceiveLocation{
            override fun getDeviceLastLocation(location: Location) {
                Log.d(TAG, "getDeviceLastLocation: $location Mil");
                weatherFragment.retrofitCall(location, this@HomeActivity, true)
            }

            override fun onError(error: String) {
                Toast.makeText(this@HomeActivity, error, Toast.LENGTH_LONG).show()
            }

        })
    }

    override fun onBackPressed() {
        LogUtils.setTag(TAG)
        LogUtils.d("${SARestaurantApp.isRestVisible}," +
                "${SARestaurantApp.isRestDetailVisible}," +
                "${SARestaurantApp.isFavVisible}," +
                "${SARestaurantApp.isWeatherVisible}," +
                "${SARestaurantApp.isMapVisible}")
//        restaurantFragment = supportFragmentManager.findFragmentByTag(RESTAURANT_FRAGMENT_TAG) as RestaurantFragment
//        restaurantDetailFragment = supportFragmentManager.findFragmentByTag(FRAGMENT_DETAIL_REST) as RestaurantDetailFragment
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        }else if (SARestaurantApp.isFavVisible && !SARestaurantApp.isMapVisible){
            LogUtils.setTag(TAG)
            LogUtils.d("isFavVisible")
            favoriteFragment = supportFragmentManager.findFragmentByTag(FAVORITE_RESTAURANT_FRAGMENT_TAG) as FavoriteFragment
            supportFragmentManager.popBackStack("Favorite", POP_BACK_STACK_INCLUSIVE)
            supportActionBar!!.title = "RestaurantFragment"
            nav_view.setCheckedItem(R.id.nav_home)
        }else if(SARestaurantApp.isWeatherVisible){
            weatherFragment = supportFragmentManager.findFragmentByTag(WEATHER_FRAGMENT_TAG) as WeatherFragment
            supportFragmentManager.popBackStack("Weather", POP_BACK_STACK_INCLUSIVE)
            supportActionBar!!.title = "RestaurantFragment"
            this.toolbar.findViewById<ActionMenuItemView>(R.id.action_map).visibility = View.VISIBLE
            nav_view.setCheckedItem(R.id.nav_home)
        }else if(SARestaurantApp.isRestVisible && SARestaurantApp.isMapVisible && !SARestaurantApp.isFavVisible){
            mapsFragment = supportFragmentManager.findFragmentByTag(MAP_FRAGMENT_TAG) as MapsFragment
            supportActionBar?.show()
            supportFragmentManager.popBackStack("Maps", POP_BACK_STACK_INCLUSIVE)
            supportActionBar!!.title = "RestaurantFragment"
            nav_view.setCheckedItem(R.id.nav_home)
        }else if(SARestaurantApp.isRestVisible && SARestaurantApp.isFavVisible && SARestaurantApp.isMapVisible){
            mapsFragment = supportFragmentManager.findFragmentByTag(MAP_FRAGMENT_TAG) as MapsFragment
            supportFragmentManager.popBackStack("Maps", POP_BACK_STACK_INCLUSIVE)
            supportActionBar?.show()
            supportActionBar!!.title = "FavoriteFragment"
            nav_view.setCheckedItem(R.id.nav_favorite)
        }else if(SARestaurantApp.isRestVisible && SARestaurantApp.isRestDetailVisible){
            restaurantDetailFragment = supportFragmentManager.findFragmentByTag(FRAGMENT_DETAIL_REST) as RestaurantDetailFragment
            supportFragmentManager.popBackStack("RestDetail", POP_BACK_STACK_INCLUSIVE)
            supportActionBar?.show()
            supportActionBar!!.title = "RestaurantFragment"
            nav_view.setCheckedItem(R.id.nav_home)
        }
//        else if(restaurantDetailFragment != null && restaurantDetailFragment!!.isVisible){
//            Log.d(TAG, "onBackPressed: Clicked");
//            supportFragmentManager.popBackStack()
//        }
        else {
            AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Closing Activity")
                    .setMessage("Are you sure you want to close this activity?")
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> finish() })
                    .setNegativeButton("No", null)
                    .show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_map -> {
                if(mapsPresenterImp.isServicesOK(this)){
                    supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentHolder, mapsFragment, MAP_FRAGMENT_TAG)
                            .addToBackStack("Maps")
                            .commit();
                }
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                permissionUtils!!.checkPermissions(permissionList)
//                val fragmentManager = supportFragmentManager
//                val transaction = fragmentManager.beginTransaction()
//                transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
//                transaction.replace(R.id.fragmentHolder, RestaurantFragment(), RESTAURANT_FRAGMENT_TAG)
//                transaction.addToBackStack(null)
//                transaction.commit()
            }
            R.id.nav_favorite -> {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, FavoriteFragment(), FAVORITE_RESTAURANT_FRAGMENT_TAG)
                transaction.addToBackStack("Favorite")
                transaction.commit()
            }
            R.id.nav_weather -> {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, WeatherFragment(), WEATHER_FRAGMENT_TAG)
                transaction.addToBackStack("Weather")
                transaction.commit()
            }
            R.id.nav_logout -> {
                AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Logout")
                        .setMessage("Are you sure you want to Logout?")
                        .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> LoginManager.getInstance().logOut()
                            SARestaurantApp.sharedPreference!!.edit().clear().apply()
                            val intent = Intent(this, MainActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                            startActivity(intent)})
                        .setNegativeButton("No", null)
                        .show()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
