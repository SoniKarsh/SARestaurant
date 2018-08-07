package restaurant.sa.com.sarestaurant

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import restaurant.sa.com.sarestaurant.appview.signin.SignInFragment

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity";
    var name: String? = null
    var password: String? = null
    val FRAGMENT_TAG = "SignInFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            name = SARestaurantApp.sharedPreference!!.getString("username", "")
            password = SARestaurantApp.sharedPreference!!.getString("password", "")
            if(name != ""){
                Log.d(TAG, "$name: $password");
                val intent = Intent(this, HomeActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
            }else{
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentId, SignInFragment(), FRAGMENT_TAG)
                transaction.commit()
            }
        }
    }
}
