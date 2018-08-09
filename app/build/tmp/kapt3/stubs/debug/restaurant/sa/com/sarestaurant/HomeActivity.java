package restaurant.sa.com.sarestaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010L\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0016J\u0018\u0010M\u001a\u0012\u0012\u0004\u0012\u00020(0 j\b\u0012\u0004\u0012\u00020(`\"H\u0016J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020OH\u0016J\u0012\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u0012\u0010W\u001a\u00020O2\b\u0010X\u001a\u0004\u0018\u00010YH\u0014J\u0010\u0010Z\u001a\u00020T2\u0006\u0010[\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010^\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016J-\u0010_\u001a\u00020O2\u0006\u0010`\u001a\u00020\u001e2\u000e\u0010a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070:2\u0006\u0010b\u001a\u00020cH\u0016\u00a2\u0006\u0002\u0010dJ\u0006\u0010e\u001a\u00020OJ \u0010f\u001a\u00020O2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0016J \u0010g\u001a\u00020O2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020(0 j\b\u0012\u0004\u0012\u00020(`\"H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082D\u00a2\u0006\u0002\n\u0000R.\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020(0 j\b\u0012\u0004\u0012\u00020(`\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070:X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010?\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u00a8\u0006h"}, d2 = {"Lrestaurant/sa/com/sarestaurant/HomeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "()V", "FAVORITE_RESTAURANT_FRAGMENT_TAG", "", "getFAVORITE_RESTAURANT_FRAGMENT_TAG", "()Ljava/lang/String;", "FRAGMENT_TAG", "getFRAGMENT_TAG", "MAP_FRAGMENT_TAG", "getMAP_FRAGMENT_TAG", "RESTAURANT_FRAGMENT_TAG", "getRESTAURANT_FRAGMENT_TAG", "TAG", "WEATHER_FRAGMENT_TAG", "getWEATHER_FRAGMENT_TAG", "detailPresenter", "getDetailPresenter", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "setDetailPresenter", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;)V", "homeActivity", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "jobId", "", "listOfLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfLocations", "()Ljava/util/ArrayList;", "setListOfLocations", "(Ljava/util/ArrayList;)V", "listOfTitleImgModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "getListOfTitleImgModel", "setListOfTitleImgModel", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mapsFragment", "Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "getMapsFragment", "()Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "setMapsFragment", "(Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;)V", "mapsPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "getMapsPresenterImp", "()Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "setMapsPresenterImp", "(Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;)V", "permissionList", "", "getPermissionList", "()[Ljava/lang/String;", "setPermissionList", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "permissionUtils", "Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "getPermissionUtils", "()Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "setPermissionUtils", "(Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;)V", "weatherFragment", "Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;", "getWeatherFragment", "()Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;", "setWeatherFragment", "(Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;)V", "getLocationFromRestaurant", "getNameImgFromRestaurant", "getRestaurantData", "", "restaurantDetailModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "onBackPressed", "onContextItemSelected", "", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "onOptionsItemSelected", "onRequestPermissionsResult", "requestCode", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "scheduleJob", "sendLocationFromRestaurant", "sendNameImgFromRestaurant", "app_debug"})
public final class HomeActivity extends android.support.v7.app.AppCompatActivity implements restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter, android.support.design.widget.NavigationView.OnNavigationItemSelectedListener, restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FRAGMENT_TAG = "SignInFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String RESTAURANT_FRAGMENT_TAG = "RestaurantFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FAVORITE_RESTAURANT_FRAGMENT_TAG = "FavoriteFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String WEATHER_FRAGMENT_TAG = "WeatherFragment";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String MAP_FRAGMENT_TAG = "MapsFragment";
    @org.jetbrains.annotations.NotNull()
    private restaurant.sa.com.sarestaurant.appview.maps.MapsFragment mapsFragment;
    @org.jetbrains.annotations.NotNull()
    private restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment weatherFragment;
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
    private final int jobId = 123;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] permissionList;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFRAGMENT_TAG() {
        return null;
    }
    
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
    public final java.lang.String getMAP_FRAGMENT_TAG() {
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
    public final restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment getWeatherFragment() {
        return null;
    }
    
    public final void setWeatherFragment(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment p0) {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void scheduleJob() {
    }
    
    @java.lang.Override()
    public boolean onContextItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
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