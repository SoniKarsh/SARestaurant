package restaurant.sa.com.sarestaurant.appview.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\"\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u00102\u001a\u00020 H\u0016J\b\u00103\u001a\u00020 H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00065"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/signin/SignInFragment;", "Landroid/support/v4/app/Fragment;", "Lrestaurant/sa/com/sarestaurant/appview/signin/view/SignInView;", "()V", "FRAGMENT_TAG_1", "", "getFRAGMENT_TAG_1", "()Ljava/lang/String;", "TAG", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "email", "getEmail", "setEmail", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "lastName", "getLastName", "setLastName", "userModelResponse", "Lrestaurant/sa/com/sarestaurant/model/UserModel;", "getUserModelResponse", "()Lrestaurant/sa/com/sarestaurant/model/UserModel;", "setUserModelResponse", "(Lrestaurant/sa/com/sarestaurant/model/UserModel;)V", "displayUserInfo", "", "jsonObject", "Lorg/json/JSONObject;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "removeError", "setError", "Companion", "app_debug"})
public final class SignInFragment extends android.support.v4.app.Fragment implements restaurant.sa.com.sarestaurant.appview.signin.view.SignInView {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FRAGMENT_TAG_1 = "SignUpFragment";
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.model.UserModel userModelResponse;
    private final java.lang.String TAG = "SignInFragment";
    @org.jetbrains.annotations.NotNull()
    public com.facebook.CallbackManager callbackManager;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String firstName;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String lastName;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    private static restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel signInModel;
    @org.jetbrains.annotations.NotNull()
    private static restaurant.sa.com.sarestaurant.appview.signin.presenter.SignInPresenterImp signInPresenterImp;
    public static final restaurant.sa.com.sarestaurant.appview.signin.SignInFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFRAGMENT_TAG_1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.model.UserModel getUserModelResponse() {
        return null;
    }
    
    public final void setUserModelResponse(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.model.UserModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.facebook.CallbackManager getCallbackManager() {
        return null;
    }
    
    public final void setCallbackManager(@org.jetbrains.annotations.NotNull()
    com.facebook.CallbackManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void displayUserInfo(org.json.JSONObject jsonObject) {
    }
    
    @java.lang.Override()
    public void setError() {
    }
    
    @java.lang.Override()
    public void removeError() {
    }
    
    public SignInFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/signin/SignInFragment$Companion;", "", "()V", "signInModel", "Lrestaurant/sa/com/sarestaurant/appview/signin/model/SignInModel;", "getSignInModel", "()Lrestaurant/sa/com/sarestaurant/appview/signin/model/SignInModel;", "setSignInModel", "(Lrestaurant/sa/com/sarestaurant/appview/signin/model/SignInModel;)V", "signInPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/signin/presenter/SignInPresenterImp;", "getSignInPresenterImp", "()Lrestaurant/sa/com/sarestaurant/appview/signin/presenter/SignInPresenterImp;", "setSignInPresenterImp", "(Lrestaurant/sa/com/sarestaurant/appview/signin/presenter/SignInPresenterImp;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel getSignInModel() {
            return null;
        }
        
        public final void setSignInModel(@org.jetbrains.annotations.NotNull()
        restaurant.sa.com.sarestaurant.appview.signin.model.SignInModel p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final restaurant.sa.com.sarestaurant.appview.signin.presenter.SignInPresenterImp getSignInPresenterImp() {
            return null;
        }
        
        public final void setSignInPresenterImp(@org.jetbrains.annotations.NotNull()
        restaurant.sa.com.sarestaurant.appview.signin.presenter.SignInPresenterImp p0) {
        }
        
        private Companion() {
            super();
        }
    }
}