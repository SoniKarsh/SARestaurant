package restaurant.sa.com.sarestaurant.appview.signup.view

import android.support.design.widget.TextInputLayout
import android.view.View

interface SignUpView {

    fun displayValidationMessage(view: TextInputLayout?): Boolean

    fun setError(view: View)

    fun removeError(view: View)

}