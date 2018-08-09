package restaurant.sa.com.sarestaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010B\u001a\u00020CH\u0002J\u0018\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0016J\u0018\u0010E\u001a\u0012\u0012\u0004\u0012\u00020#0\u001bj\b\u0012\u0004\u0012\u00020#`\u001dH\u0016J\u0010\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020CH\u0016J\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010N\u001a\u00020C2\b\u0010O\u001a\u0004\u0018\u00010PH\u0014J\u0010\u0010Q\u001a\u00020K2\u0006\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020CH\u0014J\b\u0010U\u001a\u00020CH\u0016J\u0010\u0010V\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010W\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016J-\u0010X\u001a\u00020C2\u0006\u0010Y\u001a\u00020Z2\u000e\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b052\u0006\u0010\\\u001a\u00020]H\u0016\u00a2\u0006\u0002\u0010^J\b\u0010_\u001a\u00020CH\u0016J\u0006\u0010`\u001a\u00020CJ \u0010a\u001a\u00020C2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0016J \u0010b\u001a\u00020C2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\u001bj\b\u0012\u0004\u0012\u00020#`\u001dH\u0016J\u0006\u0010c\u001a\u00020CR\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\u001bj\b\u0012\u0004\u0012\u00020#`\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\b\u0012\u0004\u0012\u00020\b05X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0010\u0010A\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006d"}, d2 = {"Lrestaurant/sa/com/sarestaurant/HomeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/interactor/TempFoundCallback;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "Lrestaurant/sa/com/sarestaurant/appview/location/interactor/LocationCommunication;", "()V", "FAVORITE_RESTAURANT_FRAGMENT_TAG", "", "getFAVORITE_RESTAURANT_FRAGMENT_TAG", "()Ljava/lang/String;", "RESTAURANT_FRAGMENT_TAG", "getRESTAURANT_FRAGMENT_TAG", "TAG", "WEATHER_FRAGMENT_TAG", "getWEATHER_FRAGMENT_TAG", "detailPresenter", "getDetailPresenter", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "setDetailPresenter", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;)V", "homeActivity", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "listOfLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfLocations", "()Ljava/util/ArrayList;", "setListOfLocations", "(Ljava/util/ArrayList;)V", "listOfTitleImgModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "getListOfTitleImgModel", "setListOfTitleImgModel", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mapsFragment", "Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "getMapsFragment", "()Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "setMapsFragment", "(Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;)V", "mapsPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "getMapsPresenterImp", "()Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "setMapsPresenterImp", "(Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;)V", "permissionList", "", "getPermissionList", "()[Ljava/lang/String;", "setPermissionList", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "permissionUtils", "Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "getPermissionUtils", "()Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "setPermissionUtils", "(Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;)V", "tempFoundCallback", "firstCallToWeather", "", "getLocationFromRestaurant", "getNameImgFromRestaurant", "getRestaurantData", "restaurantDetailModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "onBackPressed", "onContextItemSelected", "", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onError", "onNavigationItemSelected", "onOptionsItemSelected", "onRequestPermissionsResult", "requestCode", "", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSuccess", "scheduleJob", "sendLocationFromRestaurant", "sendNameImgFromRestaurant", "setToNavigationHeader", "app_debug"})
public final class HomeActivity extends android.support.v7.app.AppCompatActivity implements restaurant.sa.com.sarestaurant.appview.restaurant.interactor.TempFoundCallback, restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter, android.support.design.widget.NavigationView.OnNavigationItemSelectedListener, restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String RESTAURANT_FRAGMENT_TAG = "RestaurantFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FAVORITE_RESTAURANT_FRAGMENT_TAG = "FavoriteFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String WEATHER_FRAGMENT_TAG = "WeatherFragment";
    @org.jetbrains.annotations.NotNull()
    private restaurant.sa.com.sarestaurant.appview.maps.MapsFragment mapsFragment;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.appview.maps.presenter.MapsPresenterImp mapsPresenterImp;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter detailPresenter;
    private final java.lang.String TAG = "HomeActivity";
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.utils.PermissionUtils permissionUtils;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel;
    private restaurant.sa.com.sarestaurant.appview.restaurant.interactor.TempFoundCallback tempFoundCallback;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] permissionList;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRESTAURANT_FRAGMENT_TAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFAVORITE_RESTAURANT_FRAGMENT_TAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWEATHER_FRAGMENT_TAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.maps.MapsFragment getMapsFragment() {
        return null;
    }
    
    public final void setMapsFragment(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.maps.MapsFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.maps.presenter.MapsPresenterImp getMapsPresenterImp() {
        return null;
    }
    
    public final void setMapsPresenterImp(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.maps.presenter.MapsPresenterImp p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter getDetailPresenter() {
        return null;
    }
    
    public final void setDetailPresenter(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfLocations() {
        return null;
    }
    
    public final void setListOfLocations(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.utils.PermissionUtils getPermissionUtils() {
        return null;
    }
    
    public final void setPermissionUtils(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.utils.PermissionUtils p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.HomeActivity getHomeActivity() {
        return null;
    }
    
    public final void setHomeActivity(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.HomeActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getListOfTitleImgModel() {
        return null;
    }
    
    public final void setListOfTitleImgModel(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPermissionList() {
        return null;
    }
    
    public final void setPermissionList(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void sendLocationFromRestaurant(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getLocationFromRestaurant() {
        return null;
    }
    
    @java.lang.Override()
    public void sendNameImgFromRestaurant(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getNameImgFromRestaurant() {
        return null;
    }
    
    @java.lang.Override()
    public void getRestaurantData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel restaurantDetailModel) {
    }
    
    @java.lang.Override()
    public void onSuccess() {
    }
    
    @java.lang.Override()
    public void onError() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void firstCallToWeather() {
    }
    
    public final void setToNavigationHeader() {
    }
    
    public final void scheduleJob() {
    }
    
    @java.lang.Override()
    public boolean onContextItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public HomeActivity() {
        super();
    }
}