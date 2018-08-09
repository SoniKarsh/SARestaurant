package restaurant.sa.com.sarestaurant.appview.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00102\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\nH\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u0010:\u001a\u00020/H\u0016J-\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u000e\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040?2\u0006\u0010@\u001a\u00020AH\u0016\u00a2\u0006\u0002\u0010BJ\u001e\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020E2\u0006\u00103\u001a\u00020\n2\u0006\u0010F\u001a\u00020\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u0006G"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;", "Landroid/support/v4/app/Fragment;", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "TAG", "getTAG", "contextRestFrag", "Landroid/content/Context;", "getContextRestFrag", "()Landroid/content/Context;", "setContextRestFrag", "(Landroid/content/Context;)V", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "homeCallback", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;", "getHomeCallback", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;", "setHomeCallback", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;)V", "isRunning", "", "()Z", "setRunning", "(Z)V", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "permissionUtils", "Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "getPermissionUtils", "()Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "setPermissionUtils", "(Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;)V", "weatherPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/weather/presenter/WeatherPresenterImp;", "getWeatherPresenterImp", "()Lrestaurant/sa/com/sarestaurant/appview/weather/presenter/WeatherPresenterImp;", "setWeatherPresenterImp", "(Lrestaurant/sa/com/sarestaurant/appview/weather/presenter/WeatherPresenterImp;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "retrofitCall", "location", "Landroid/location/Location;", "isActivityCall", "app_debug"})
public final class WeatherFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "WeatherFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = "https://query.yahooapis.com";
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context contextRestFrag;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.weather.presenter.WeatherPresenterImp weatherPresenterImp;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback homeCallback;
    private boolean isRunning;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.utils.PermissionUtils permissionUtils;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.HomeActivity getHomeActivity() {
        return null;
    }
    
    public final void setHomeActivity(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.HomeActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContextRestFrag() {
        return null;
    }
    
    public final void setContextRestFrag(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.weather.presenter.WeatherPresenterImp getWeatherPresenterImp() {
        return null;
    }
    
    public final void setWeatherPresenterImp(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.weather.presenter.WeatherPresenterImp p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback getHomeCallback() {
        return null;
    }
    
    public final void setHomeCallback(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback p0) {
    }
    
    public final boolean isRunning() {
        return false;
    }
    
    public final void setRunning(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.utils.PermissionUtils getPermissionUtils() {
        return null;
    }
    
    public final void setPermissionUtils(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.utils.PermissionUtils p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
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
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void retrofitCall(@org.jetbrains.annotations.NotNull()
    android.location.Location location, @org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isActivityCall) {
    }
    
    public WeatherFragment() {
        super();
    }
}