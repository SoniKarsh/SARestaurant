package restaurant.sa.com.sarestaurant.appview.signin

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.GraphRequest
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlinx.android.synthetic.main.fragment_sign_in.*
import org.json.JSONObject
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel
import restaurant.sa.com.sarestaurant.appview.signin.presenter.SignInPresenterImp
import restaurant.sa.com.sarestaurant.appview.signin.view.SignInView
import restaurant.sa.com.sarestaurant.appview.signup.SignUpFragment
import restaurant.sa.com.sarestaurant.model.UserModel
import java.util.*

class SignInFragment : Fragment(), SignInView {

    val FRAGMENT_TAG_1 = "SignUpFragment"
    var userModelResponse: UserModel? = null
    private val TAG = "SignInFragment";
    lateinit var callbackManager: CallbackManager
    lateinit var firstName: String
    lateinit var lastName: String
    lateinit var email: String
    companion object {
        var signInModel: SignInModel = SignInModel()
        var signInPresenterImp: SignInPresenterImp = SignInPresenterImp()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnSignIn.setOnClickListener {
            signInModel.userName = enterEmail.text.toString()
            signInModel.password = enterPassword.text.toString()
            userModelResponse = signInPresenterImp.validateCredentials(SARestaurantApp.database!!
                    , signInModel)
            if(userModelResponse!=null){
                removeError()
                signInPresenterImp.storeInSharedPreferences(userModelResponse!!.userName
                        , userModelResponse!!.emailId
                        , userModelResponse!!.mobileNo)
                val intent = Intent(this.activity, HomeActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
            }else{
                setError()
            }
        }

        button2.setOnClickListener {
            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)
        }

        btnFacebookSignIn.setOnClickListener {
            val userModel = UserModel()

            Log.d(TAG, ": ${SARestaurantApp.database!!.userDao().getAll()}");

            callbackManager = CallbackManager.Factory.create()
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile","email"))
            LoginManager.getInstance().registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
                override fun onSuccess(loginResult: LoginResult) {

                    Log.d(TAG, "onSuccess: ${loginResult.accessToken}");

                    var graphRequest = GraphRequest.newMeRequest(loginResult.accessToken
                    ) { `object`, response ->
                        displayUserInfo(`object`)
                        userModel.emailId = `object`.getString("email")
                        userModel.mobileNo = ""
                        userModel.password = ""
                        userModel.userName = `object`.getString("first_name") + `object`.getString("last_name")
                        SARestaurantApp.database!!.userDao().insertData(userModel)
                    }

                    var bundle = Bundle()
                    bundle.putString("fields", "first_name, last_name, email, id")
                    graphRequest.parameters = bundle
                    graphRequest.executeAsync()

                    // App code
                    signInPresenterImp.storeInSharedPreferences(userModel.userName
                            , userModel.emailId
                            , userModel.mobileNo)

                    val intent = Intent(activity, HomeActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                    startActivity(intent)

                }

                override fun onCancel() {
                    // App code
                }

                override fun onError(exception: FacebookException) {
                    Log.d(TAG, "onError: $exception");
                    // App code
                }
            })

        }

        registerAccount.setOnClickListener {
            val fragmentManager = activity?.supportFragmentManager
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentId, SignUpFragment(), FRAGMENT_TAG_1)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun displayUserInfo(jsonObject: JSONObject?) {

        firstName = jsonObject!!.getString("first_name")
        lastName = jsonObject.getString("last_name")
        email = jsonObject.getString("email")

        Log.i(TAG, "bundle: $firstName$lastName$email")

    }

    override fun setError() {
        emailWrapper.error = "Username or Password is not valid!!!"
        passwordWrapper.error = "Username or Password is not valid!!!"
    }

    override fun removeError() {
        emailWrapper.isErrorEnabled = false
        passwordWrapper.isErrorEnabled = false
    }

}