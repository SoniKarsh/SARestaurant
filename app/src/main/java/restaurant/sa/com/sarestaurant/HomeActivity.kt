package restaurant.sa.com.sarestaurant

import android.app.FragmentManager
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
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
import android.os.Build
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.facebook.login.LoginManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.content_home.*
import kotlinx.android.synthetic.main.nav_header_home.*
import restaurant.sa.com.sarestaurant.appview.alarm.ApiCallJobService
import restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter
import restaurant.sa.com.sarestaurant.utils.LogUtils
import restaurant.sa.com.sarestaurant.utils.PermissionUtils
import restaurant.sa.com.sarestaurant.utils.ToastUtils

class HomeActivity : AppCompatActivity(), DetailPresenter, NavigationView.OnNavigationItemSelectedListener, LocationCommunication {

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
    var permissionUtils: PermissionUtils? = null
    var homeActivity: HomeActivity? = null
    var listOfTitleImgModel: ArrayList<TitleImgModel> = ArrayList()
    private val jobId = 123
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

    override fun getRestaurantData(restaurantDetailModel: RestaurantDetailModel) {

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
                if(SARestaurantApp.instance!!.sharedPreference!!.getString("temp", "") == ""){
                    scheduleJob()
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

        nav_view.setNavigationItemSelectedListener(this)
    }

    fun scheduleJob(){
        val componentName = ComponentName(this, ApiCallJobService::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val info = JobInfo.Builder(jobId, componentName)
                    .setPersisted(true)
                    .setPeriodic((60* 60 *1000).toLong()) //60* 60 *1000
                    .build()
            val scheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
            val resultCode = scheduler.schedule(info)
            if (resultCode == JobScheduler.RESULT_SUCCESS) {
                LogUtils.setTag(TAG)
                LogUtils.i("Job scheduled")
            } else {
                LogUtils.setTag(TAG)
                LogUtils.e("Job scheduling failed")
            }
        } else {
            LogUtils.setTag(TAG)
            LogUtils.e("VERSION.SDK_INT < LOLLIPOP")
        }
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        return super.onContextItemSelected(item)
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
                ToastUtils.lengthShort(this, SARestaurantApp.instance!!.isClickableForMap.toString())
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
