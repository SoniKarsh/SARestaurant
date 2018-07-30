package restaurant.sa.com.sarestaurant.appview.signin.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/signin/presenter/SignInPresenterImp;", "Lrestaurant/sa/com/sarestaurant/appview/signin/presenter/SignInPresenter;", "()V", "queryDatabase", "Lrestaurant/sa/com/sarestaurant/model/UserModel;", "signInModel", "Lrestaurant/sa/com/sarestaurant/appview/signin/model/SignInModel;", "storeInSharedPreferences", "", "userName", "", "emailId", "mobileNo", "validateCredentials", "userDatabase", "Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "app_debug"})
public final class SignInPresenterImp implements restaurant.sa.com.sarestaurant.appview.signin.presenter.SignInPresenter {
    
    @java.lang.Override()
    public void storeInSharedPreferences(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String emailId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public restaurant.sa.com.sarestaurant.model.UserModel validateCredentials(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.database.UserDatabase userDatabase, @org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel signInModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.model.UserModel queryDatabase(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel signInModel) {
        return null;
    }
    
    public SignInPresenterImp() {
        super();
    }
}