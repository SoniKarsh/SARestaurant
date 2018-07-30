package restaurant.sa.com.sarestaurant.appview.signin.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/signin/presenter/SignInPresenter;", "", "storeInSharedPreferences", "", "userName", "", "emailId", "mobileNo", "validateCredentials", "Lrestaurant/sa/com/sarestaurant/model/UserModel;", "userDatabase", "Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "signInModel", "Lrestaurant/sa/com/sarestaurant/appview/signin/model/SignInModel;", "app_debug"})
public abstract interface SignInPresenter {
    
    @org.jetbrains.annotations.Nullable()
    public abstract restaurant.sa.com.sarestaurant.model.UserModel validateCredentials(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.database.UserDatabase userDatabase, @org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel signInModel);
    
    public abstract void storeInSharedPreferences(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String emailId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo);
}