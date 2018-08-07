package restaurant.sa.com.sarestaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010a\u001a\u00020bH\u0016J\u0006\u0010c\u001a\u00020bJ\u0018\u0010d\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+H\u0016J\u0018\u0010e\u001a\u0012\u0012\u0004\u0012\u0002010)j\b\u0012\u0004\u0012\u000201`+H\u0016J\u0010\u0010f\u001a\u00020b2\u0006\u0010g\u001a\u00020hH\u0016J\b\u0010i\u001a\u00020bH\u0016J\u0012\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\u0012\u0010n\u001a\u00020b2\b\u0010o\u001a\u0004\u0018\u00010pH\u0014J\u0010\u0010q\u001a\u00020k2\u0006\u0010r\u001a\u00020sH\u0016J\u0010\u0010t\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u0016J\u0010\u0010u\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u0016J-\u0010v\u001a\u00020b2\u0006\u0010w\u001a\u00020x2\u000e\u0010y\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0C2\u0006\u0010z\u001a\u00020{H\u0016\u00a2\u0006\u0002\u0010|J\u001d\u0010}\u001a\u00020b2\b\u0010~\u001a\u0004\u0018\u00010p2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J!\u0010\u0081\u0001\u001a\u00020b2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+H\u0016J!\u0010\u0082\u0001\u001a\u00020b2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u0002010)j\b\u0012\u0004\u0012\u000201`+H\u0016J\u0013\u0010\u0083\u0001\u001a\u00020b2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u000e\u0010\u0015\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R.\u0010(\u001a\u0016\u0012\u0004\u0012\u00020*\u0018\u00010)j\n\u0012\u0004\u0012\u00020*\u0018\u0001`+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u0012\u0012\u0004\u0012\u0002010)j\b\u0012\u0004\u0012\u000201`+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u000e\u00104\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0CX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010U\u001a\u0004\u0018\u00010VX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\\X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`\u00a8\u0006\u0086\u0001"}, d2 = {"Lrestaurant/sa/com/sarestaurant/HomeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;", "()V", "FAVORITE_RESTAURANT_FRAGMENT_TAG", "", "getFAVORITE_RESTAURANT_FRAGMENT_TAG", "()Ljava/lang/String;", "FRAGMENT_DETAIL_REST", "getFRAGMENT_DETAIL_REST", "setFRAGMENT_DETAIL_REST", "(Ljava/lang/String;)V", "FRAGMENT_TAG", "getFRAGMENT_TAG", "MAP_FRAGMENT_TAG", "getMAP_FRAGMENT_TAG", "RESTAURANT_FRAGMENT_TAG", "getRESTAURANT_FRAGMENT_TAG", "TAG", "WEATHER_FRAGMENT_TAG", "getWEATHER_FRAGMENT_TAG", "detailPresenter", "getDetailPresenter", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "setDetailPresenter", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;)V", "favoriteFragment", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/FavoriteFragment;", "getFavoriteFragment", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/FavoriteFragment;", "setFavoriteFragment", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/FavoriteFragment;)V", "homeActivity", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "listOfLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfLocations", "()Ljava/util/ArrayList;", "setListOfLocations", "(Ljava/util/ArrayList;)V", "listOfTitleImgModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "getListOfTitleImgModel", "setListOfTitleImgModel", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mapsFragment", "Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "getMapsFragment", "()Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "setMapsFragment", "(Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;)V", "mapsPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "getMapsPresenterImp", "()Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "setMapsPresenterImp", "(Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;)V", "permissionList", "", "getPermissionList", "()[Ljava/lang/String;", "setPermissionList", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "permissionUtils", "Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "getPermissionUtils", "()Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "setPermissionUtils", "(Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;)V", "restaurantDetailFragment", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "getRestaurantDetailFragment", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "setRestaurantDetailFragment", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;)V", "restaurantFragment", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;", "getRestaurantFragment", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;", "setRestaurantFragment", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;)V", "weatherFragment", "Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;", "getWeatherFragment", "()Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;", "setWeatherFragment", "(Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;)V", "getData", "", "getGPSLocation", "getLocationFromRestaurant", "getNameImgFromRestaurant", "getRestaurantData", "restaurantDetailModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "onBackPressed", "onContextItemSelected", "", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "onOptionsItemSelected", "onRequestPermissionsResult", "requestCode", "", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "sendLocationFromRestaurant", "sendNameImgFromRestaurant", "sendWeatherData", "weatherData", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/WeatherData;", "app_debug"})
public final class HomeActivity extends android.support.v7.app.AppCompatActivity implements restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter, android.support.design.widget.NavigationView.OnNavigationItemSelectedListener, restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication, restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback {
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
    private restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment restaurantFragment;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.favorite.FavoriteFragment favoriteFragment;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment restaurantDetailFragment;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String FRAGMENT_DETAIL_REST;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.utils.PermissionUtils permissionUtils;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] permissionList;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void getRestaurantData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel restaurantDetailModel) {
    }
    
    @java.lang.Override()
    public void sendWeatherData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData weatherData) {
    }
    
    @java.lang.Override()
    public void getData() {
    }
    
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
    public final restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment getRestaurantFragment() {
        return null;
    }
    
    public final void setRestaurantFragment(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.favorite.FavoriteFragment getFavoriteFragment() {
        return null;
    }
    
    public final void setFavoriteFragment(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.favorite.FavoriteFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment getRestaurantDetailFragment() {
        return null;
    }
    
    public final void setRestaurantDetailFragment(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFRAGMENT_DETAIL_REST() {
        return null;
    }
    
    public final void setFRAGMENT_DETAIL_REST(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onContextItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void getGPSLocation() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle outState, @org.jetbrains.annotations.Nullable()
    android.os.PersistableBundle outPersistentState) {
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