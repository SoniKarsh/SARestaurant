package restaurant.sa.com.sarestaurant.appview.signup.GenericTextWatcher

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.fragment_sign_up.view.*
import restaurant.sa.com.sarestaurant.R
import restaurant.sa.com.sarestaurant.appview.signup.SignUpFragment
import restaurant.sa.com.sarestaurant.appview.signup.view.SignUpView
import java.util.regex.Matcher
import java.util.regex.Pattern

class GenericTextWatcher(var view: View, var signUpFragment: SignUpFragment): TextWatcher {

    val EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    val NAME_PATTERN = "^[a-zA-Z ]+\$"
    val MOBILE_PATTERN = "^[6-9]\\d{9}\$"
    val PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\\^&\\*])(?=.{8,})"
    var signUpView: SignUpView = signUpFragment
    lateinit var pattern: Pattern
    lateinit var matcher: Matcher
    var matchFound : Boolean = false
    lateinit var text: String
    val TAG = "GenericTextWatcher"

    override fun afterTextChanged(s: Editable?) {
        text = s.toString()
        when(view.id){
            R.id.txtUserName -> {
                matchFound = matchPattern(NAME_PATTERN, text)
                if(!matchFound || text.isEmpty() || (text.length > 25)){
                    signUpView.setError(view)
                }else{
                    signUpView.removeError(view)
                }
            }
            R.id.txtMobileNo -> {
                matchFound = matchPattern(MOBILE_PATTERN, text)
                if(!matchFound || text.isEmpty()){
                    signUpView.setError(view)
                }else{
                    signUpView.removeError(view)
                }
            }
            R.id.txtEmailId -> {
                matchFound = matchPattern(EMAIL_PATTERN, text)
                if(!matchFound || text.isEmpty()){
                    signUpView.setError(view)
                }else{
                    signUpView.removeError(view)
                }
            }
            R.id.txtPassword -> {
                matchFound = matchPattern(PASSWORD_PATTERN, text)
                if(!matchFound || text.isEmpty() || (text.length < 8)){
                    signUpView.setError(view)
                }else{
                    signUpView.removeError(view)
                }
            }
        }
    }

    fun matchPattern(pattern: String, text: String): Boolean{
        this.pattern = Pattern.compile(pattern)
        matcher = this.pattern.matcher(text)
        return matcher.find()
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }
}