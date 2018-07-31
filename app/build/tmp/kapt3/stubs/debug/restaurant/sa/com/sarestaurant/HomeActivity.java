package restaurant.sa.com.sarestaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eH\u0016J\u0010\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020>H\u0016J\u0012\u0010D\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020H2\u0006\u0010L\u001a\u00020MH\u0016J \u0010O\u001a\u00020>2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eH\u0016J\u0010\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020RH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\u00a8\u0006S"}, d2 = {"Lrestaurant/sa/com/sarestaurant/HomeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;", "()V", "FAVORITE_RESTAURANT_FRAGMENT_TAG", "", "getFAVORITE_RESTAURANT_FRAGMENT_TAG", "()Ljava/lang/String;", "FRAGMENT_DETAIL_REST", "getFRAGMENT_DETAIL_REST", "setFRAGMENT_DETAIL_REST", "(Ljava/lang/String;)V", "FRAGMENT_TAG", "getFRAGMENT_TAG", "RESTAURANT_FRAGMENT_TAG", "getRESTAURANT_FRAGMENT_TAG", "TAG", "WEATHER_FRAGMENT_TAG", "getWEATHER_FRAGMENT_TAG", "detailPresenter", "getDetailPresenter", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "setDetailPresenter", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;)V", "listOfLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfLocations", "()Ljava/util/ArrayList;", "setListOfLocations", "(Ljava/util/ArrayList;)V", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mapsFragment", "Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "getMapsFragment", "()Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "setMapsFragment", "(Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;)V", "mapsPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "getMapsPresenterImp", "()Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;", "setMapsPresenterImp", "(Lrestaurant/sa/com/sarestaurant/appview/maps/presenter/MapsPresenterImp;)V", "restaurantDetailFragment", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "getRestaurantDetailFragment", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "setRestaurantDetailFragment", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;)V", "restaurantFragment", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;", "getRestaurantFragment", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;", "setRestaurantFragment", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;)V", "getData", "", "getLocationFromRestaurant", "getRestaurantData", "restaurantDetailModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "sendLocationFromRestaurant", "sendWeatherData", "weatherData", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/WeatherData;", "app_debug"})
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
    private restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment restaurantFragment;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment restaurantDetailFragment;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String FRAGMENT_DETAIL_REST;
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
    public final restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment getRestaurantFragment() {
        return null;
    }
    
    public final void setRestaurantFragment(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantFragment p0) {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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