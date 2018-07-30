package restaurant.sa.com.sarestaurant.appview.signin.presenter

import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel
import restaurant.sa.com.sarestaurant.database.UserDatabase
import restaurant.sa.com.sarestaurant.model.UserModel

class SignInPresenterImp: SignInPresenter {

    override fun storeInSharedPreferences(userName: String, emailId: String, mobileNo: String) {
        SARestaurantApp.sharedPreference!!.edit()
                .putString("username", userName)
                .putString("emailid", emailId)
                .putString("mobileno", mobileNo)
                .apply()
    }

    override fun validateCredentials(userDatabase: UserDatabase, signInModel: SignInModel): UserModel? {
        val userModelResponse = queryDatabase(signInModel)
        return userModelResponse
    }

    fun queryDatabase(signInModel: SignInModel): UserModel? {
        return SARestaurantApp.database!!.userDao().queryDb(signInModel.userName, signInModel.password)
    }

}
