package restaurant.sa.com.sarestaurant.appview.signin.presenter

import android.content.SharedPreferences
import restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel
import restaurant.sa.com.sarestaurant.database.UserDatabase
import restaurant.sa.com.sarestaurant.model.UserModel

interface SignInPresenter {

    fun validateCredentials(userDatabase: UserDatabase, signInModel: SignInModel): UserModel?
//
    fun storeInSharedPreferences(userName: String, emailId: String, mobileNo: String)
//
//    fun queryDatabase(): UserModel

}