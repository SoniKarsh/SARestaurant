package restaurant.sa.com.sarestaurant

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
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
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.TextView
import com.facebook.login.LoginManager
import kotlinx.android.synthetic.main.nav_header_home.*

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, LocationCommunication {

    val FRAGMENT_TAG = "SignInFragment"
    val RESTAURANT_FRAGMENT_TAG = "RestaurantFragment"
    val FAVORITE_RESTAURANT_FRAGMENT_TAG = "FavoriteFragment"
    val WEATHER_FRAGMENT_TAG = "WeatherFragment"
    var mapsFragment = MapsFragment()
    lateinit var mapsPresenterImp: MapsPresenterImp

    private val TAG = "HomeActivity"
    var listOfLocations: ArrayList<LatLng>? = null

    override fun sendLocationFromRestaurant(listOfLocations: ArrayList<LatLng>) {
        Log.d(TAG, ": ${listOfLocations}");
        this.listOfLocations = listOfLocations
    }

    override fun getLocationFromRestaurant(): ArrayList<LatLng> {
        return listOfLocations!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        mapsPresenterImp = MapsPresenterImp()

        Log.d(TAG, ": $TAG+Mi");

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentHolder, RestaurantFragment(), RESTAURANT_FRAGMENT_TAG)
        transaction.commit()

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val headerView = navigationView.getHeaderView(0)
        var nav_userName = headerView.findViewById<TextView>(R.id.navUserName)
        var nav_emailId = headerView.findViewById<TextView>(R.id.navEmailId)
        nav_userName.text = SARestaurantApp.sharedPreference!!.getString("username", "")
        nav_emailId.text = SARestaurantApp.sharedPreference!!.getString("emailid", "")

        nav_view.setNavigationItemSelectedListener(this)
    }


    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
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
                            .replace(R.id.fragmentHolder, mapsFragment)
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
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
                transaction.replace(R.id.fragmentHolder, RestaurantFragment(), RESTAURANT_FRAGMENT_TAG)
                transaction.commit()
            }
            R.id.nav_favorite -> {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, FavoriteFragment(), FAVORITE_RESTAURANT_FRAGMENT_TAG)
                transaction.commit()
            }
            R.id.nav_weather -> {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentHolder, WeatherFragment(), WEATHER_FRAGMENT_TAG)
                transaction.commit()
            }
            R.id.nav_logout -> {
                LoginManager.getInstance().logOut()
                SARestaurantApp.sharedPreference!!.edit().clear().apply()
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
