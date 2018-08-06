package restaurant.sa.com.sarestaurant.appview.signup

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_sign_up.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.signin.SignInFragment
import restaurant.sa.com.sarestaurant.appview.signup.generictextwatcher.GenericTextWatcher
import restaurant.sa.com.sarestaurant.appview.signup.view.SignUpView
import restaurant.sa.com.sarestaurant.model.UserModel

class SignUpFragment: Fragment(), SignUpView {

    val TAG = "SignUpFragment"
    lateinit var userModel: UserModel

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        userModel = UserModel()
        txtUserName.addTextChangedListener(GenericTextWatcher(txtUserName, this))
        txtEmailId.addTextChangedListener(GenericTextWatcher(txtEmailId, this))
        txtMobileNo.addTextChangedListener(GenericTextWatcher(txtMobileNo, this))
        txtPassword.addTextChangedListener(GenericTextWatcher(txtPassword, this))
        txtConfirmPassword.addTextChangedListener(GenericTextWatcher(txtConfirmPassword, this))

        btnSignUp.setOnClickListener {

            if(txtPassword.text.toString() != txtConfirmPassword.text.toString()){
                Log.d(TAG, "onActivityCreated: ${txtPassword}${txtConfirmPassword}");
                confirmPasswordWrapper.error = "Confirm Password and Password Doesn't Match."
            }else{
                confirmPasswordWrapper.isErrorEnabled = false
            }

            if(displayValidationMessage(userNameWrapper) && displayValidationMessage(emailIdWrapperUp)
                && displayValidationMessage(mobileNoWrapper) && displayValidationMessage(passwordWrapperUp)
                && displayValidationMessage(confirmPasswordWrapper)){
                userModel.userName = txtUserName.text.toString()
                userModel.emailId = txtEmailId.text.toString()
                userModel.mobileNo = txtMobileNo.text.toString()
                userModel.password = txtPassword.text.toString()
                SARestaurantApp.database!!.userDao().insertData(userModel)
                SignInFragment.signInPresenterImp.storeInSharedPreferences(userModel.userName
                        , userModel.emailId
                        , userModel.mobileNo)
                val intent = Intent(this.activity, HomeActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
            }
            else{
                Log.d(TAG, "onActivityCreated: ${txtPassword.text} ${txtConfirmPassword.text}");
                Toast.makeText(activity, "Please Follow The Guidelines", Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun displayValidationMessage(view: TextInputLayout?): Boolean {
        if (!view!!.isErrorEnabled && view.editText!!.text.isNotEmpty()){
            return true
        }
        return false
    }

    override fun setError(view: View) {
        when(view.id){
            R.id.txtUserName -> {
                userNameWrapper.error = "This must contain only letters and length must be between 1 to 25"
            }
            R.id.txtMobileNo -> {
                mobileNoWrapper.error = "This must contain valid number and length must be 10"
            }
            R.id.txtEmailId -> {
                emailIdWrapperUp.error = "Please Enter Valid Email"
            }
            R.id.txtPassword -> {
                passwordWrapperUp.error = "This must contain 1 lowercase, 1 uppercase, 1 numeric, 1 special character and size must be greater than 8"
            }
        }
    }

    override fun removeError(view: View) {
        when(view.id){
            R.id.txtUserName -> {
                userNameWrapper.isErrorEnabled = false
            }
            R.id.txtMobileNo -> {
                mobileNoWrapper.isErrorEnabled = false
            }
            R.id.txtEmailId -> {
                emailIdWrapperUp.isErrorEnabled = false
            }
            R.id.txtPassword -> {
                passwordWrapperUp.isErrorEnabled = false
            }

        }
    }

}