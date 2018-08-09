package restaurant.sa.com.sarestaurant

import android.app.AlarmManager
import android.app.FragmentManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication
import restaurant.sa.com.sarestaurant.appview.maps.MapsFragment
import restaurant.sa.com.sarestaurant.appview.maps.presenter.MapsPresenterImp
import restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment
import restaurant.sa.com.sarestaurant.appview.restaurant.favorite.FavoriteFragment
import restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment
import android.content.DialogInterface
import android.location.Location
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.facebook.login.LoginManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.content_home.*
import restaurant.sa.com.sarestaurant.appview.alarm.ApiCallReceiver
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation
import restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocationImp
import restaurant.sa.com.sarestaurant.appview.restaurant.interactor.TempFoundCallback
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback
import restaurant.sa.com.sarestaurant.utils.PermissionUtils
import restaurant.sa.com.sarestaurant.utils.ToastUtils

class HomeActivity : AppCompatActivity(), TempFoundCallback, DetailPresenter, NavigationView.OnNavigationItemSelectedListener, LocationCommunication {

    val RESTAURANT_FRAGMENT_TAG = "RestaurantFragment"
    val FAVORITE_RESTAURANT_FRAGMENT_TAG = "FavoriteFragment"
    val WEATHER_FRAGMENT_TAG = "WeatherFragment"
    var mapsFragment = MapsFragment()
    lateinit var mapsPresenterImp: MapsPresenterImp
    var detailPresenter: DetailPresenter? = null
    private val TAG = "HomeActivity"
    var listOfLocations: ArrayList<LatLng>? = null
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    var permissionUtils: PermissionUtils? = null
    var homeActivity: HomeActivity? = null
    var listOfTitleImgModel: ArrayList<TitleImgModel> = ArrayList()
    private var tempFoundCallback: TempFoundCallback? = null
    var permissionList = arrayOf<String>(android.Manifest.permission.ACCESS_FINE_LOCATION)

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        permissionUtils!!.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun sendLocationFromRestaurant(listOfLocations: ArrayList<LatLng>) {
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

    override fun getRestaurantData(restaurantDetailModel: RestaurantDetailModel) {

    }

    override fun onSuccess() {
        setToNavigationHeader()
    }

    override fun onError() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        homeActivity = this
        tempFoundCallback = this
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        permissionUtils = PermissionUtils(this)
        permissionUtils!!.setPermissionGranted(object : PermissionUtils.PermissionGranted {
            override fun onPermissionGranted() {
                homeBtn.visibility = View.GONE
                homeTV.visibility = View.GONE
                if(SARestaurantApp.instance!!.sharedPreference!!.getString("temp", "") == ""){
                    SARestaurantApp.instance!!.isActivityVisible = true
                    scheduleJob()
                    firstCallToWeather()
                }
                ToastUtils.setTag(TAG)
                ToastUtils.lengthShort(this@HomeActivity, "GRANTED")
                if(fragmentHolder.visibility == View.GONE){
                    fragmentHolder.visibility = View.VISIBLE
                }
                val fragmentManager = homeActivity!!.supportFragmentManager
                if(supportFragmentManager.backStackEntryCount>0) {
                    fragmentManager.popBackStack(0, FragmentManager.POP_BACK_STACK_INCLUSIVE)
                }
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, RestaurantFragment(), RESTAURANT_FRAGMENT_TAG)
                transaction.commit()
            }

            override fun onPermissionDenied() {
                fragmentHolder.visibility = View.GONE
                homeBtn.setOnClickListener {
                    permissionUtils!!.checkPermissions(permissionList)
                }
                ToastUtils.setTag(TAG)
                ToastUtils.lengthShort(this@HomeActivity, "Permission Denied")
            }
        })
        permissionUtils!!.checkPermissions(permissionList)
        mapsPresenterImp = MapsPresenterImp()
        detailPresenter = this

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val headerView = navigationView.getHeaderView(0)
        val navUserName = headerView.findViewById<TextView>(R.id.navUserName)
        val navEmailId = headerView.findViewById<TextView>(R.id.navEmailId)
        navUserName.text = SARestaurantApp.instance!!.sharedPreference!!.getString("username", "")
        navEmailId.text = SARestaurantApp.instance!!.sharedPreference!!.getString("emailid", "")
        if(SARestaurantApp.instance!!.sharedPreference!!.getString("temp", "") != ""){
            setToNavigationHeader()
        }
        nav_view.setNavigationItemSelectedListener(this)
    }

    private fun firstCallToWeather() {
        val weatherFragment = WeatherFragment()
        val getLocation = GetLocationImp(true, mFusedLocationProviderClient, this)
        getLocation.sendLocation(object: GetLocation.OnReceiveLocation{
            override fun getDeviceLastLocation(location: Location) {
                weatherFragment.retrofitCall(location, this@HomeActivity, true)
            }

            override fun onError(error: String) {
                Log.d(TAG, "error: $error")
            }

        })
    }

    fun setToNavigationHeader(){
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val headerView = navigationView.getHeaderView(0)
        val navTv = headerView.findViewById<TextView>(R.id.nav_tv)
        val navImgUrl = headerView.findViewById<ImageView>(R.id.nav_img)
        val f = getString(R.string.f)
        val temp = SARestaurantApp.instance!!.sharedPreference!!.getString("temp", "")
        val temperature = temp+f
        navTv.text = temperature
        val imgUrl = SARestaurantApp.instance!!.sharedPreference!!.getString("imgurl", "")
        if(imgUrl != ""){
            Picasso.get().load(imgUrl)
                    .into(navImgUrl)
        }
    }

    // Schedule Job
    fun scheduleJob(){
        Log.d(TAG, "scheduleJob:ALARM ")
        val intent = Intent(this, ApiCallReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(
                this, 123, intent, 0)
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.set(AlarmManager.RTC_WAKEUP, 5000, pendingIntent)
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, 5000, 60000 * 60, pendingIntent)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        return super.onContextItemSelected(item)
    }

    override fun onDestroy() {
        SARestaurantApp.instance!!.isActivityVisible = false
        super.onDestroy()
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount>0){
            supportFragmentManager.popBackStack()
        }else{
            val  visibleFragment = supportFragmentManager.findFragmentById(R.id.fragmentHolder)
            if(visibleFragment !is RestaurantFragment){
                supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentHolder, RestaurantFragment(), RestaurantFragment::class.java.simpleName)
                        .commit()
            }else {
                AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle(getString(R.string.close_dialog))
                        .setMessage(getString(R.string.close_txt))
                        .setPositiveButton((getString(R.string.yes)), DialogInterface.OnClickListener { dialog, which -> finish() })
                        .setNegativeButton((getString(R.string.no)), null)
                        .show()
            }
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
                if(mapsPresenterImp.isServicesOK(this) && SARestaurantApp.instance!!.isClickableForMap){
                    supportFragmentManager.beginTransaction()
                            .add(R.id.fragmentHolder, mapsFragment, mapsFragment.javaClass.simpleName)
                            .hide(supportFragmentManager.findFragmentById(R.id.fragmentHolder))
                            .addToBackStack(mapsFragment.javaClass.simpleName)
                            .commit()
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
            }
            R.id.nav_favorite -> {

                val fragmentManager = supportFragmentManager
                if(fragmentManager.backStackEntryCount>0) {
                    fragmentManager.popBackStack(0, FragmentManager.POP_BACK_STACK_INCLUSIVE)
                }
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, FavoriteFragment(), FAVORITE_RESTAURANT_FRAGMENT_TAG)
                transaction.commit()
            }
            R.id.nav_weather -> {
                val fragmentManager = supportFragmentManager
                if(fragmentManager.backStackEntryCount>0) {
                    fragmentManager.popBackStack(0, FragmentManager.POP_BACK_STACK_INCLUSIVE)
                }
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, WeatherFragment(), WEATHER_FRAGMENT_TAG)
                transaction.commit()
            }
            R.id.nav_logout -> {
                AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle(getString(R.string.logout_txt))
                        .setMessage(getString(R.string.logout_dialog))
                        .setPositiveButton(getString(R.string.yes), DialogInterface.OnClickListener { dialog, which -> LoginManager.getInstance().logOut()
                            SARestaurantApp.instance!!.sharedPreference!!.edit().clear().apply()
                            val intent = Intent(this, MainActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                            startActivity(intent)})
                        .setNegativeButton(getString(R.string.no), null)
                        .show()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
