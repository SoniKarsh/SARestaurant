package restaurant.sa.com.sarestaurant.appview.restaurant;

import java.lang.System;

/**
 * *
 * * @author Karsh Soni
 * *
 * * 7th August, 2018
 * *
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u0013H\u0002J\u0012\u00107\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00010&H\u0016J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010B\u001a\u000205H\u0016J\b\u0010C\u001a\u000205H\u0016J\u000e\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020\fJ\b\u0010F\u001a\u000205H\u0016J\b\u0010G\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0019j\b\u0012\u0004\u0012\u00020\u001d`\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u0019j\b\u0012\u0004\u0012\u00020\u001f`\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantFragment;", "Landroid/support/v4/app/Fragment;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/view/RestaurantView;", "()V", "BASE_URL", "", "TAG", "adapter", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter;", "currentItems", "", "currentLocation", "Landroid/location/Location;", "error", "handler", "Landroid/os/Handler;", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "isLoading", "", "isRetrofitCall", "isScrolling", "layout", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/LinearLayoutManageScroll;", "listOfModel", "Ljava/util/ArrayList;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Result;", "Lkotlin/collections/ArrayList;", "listOfPlacesLocation", "Lcom/google/android/gms/maps/model/LatLng;", "listOfTitleImgModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "locationCommunication", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "radius", "restContext", "Landroid/content/Context;", "restaurantPresenterImp", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenterImp;", "restaurantView", "resultList", "resultType", "runnable", "Ljava/lang/Runnable;", "scrolledOutItems", "sensor", "stop", "totalItems", "totalListSize", "x", "fetchData", "", "isNetworkAvailable", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onStop", "retrofitCall", "location", "startProgress", "stopProgress", "app_debug"})
public final class RestaurantFragment extends android.support.v4.app.Fragment implements restaurant.sa.com.sarestaurant.appview.restaurant.view.RestaurantView {
    private restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    private final java.lang.String TAG = "RestaurantFragment";
    private android.location.Location currentLocation;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    private final java.lang.String resultType = "restaurant";
    private final java.lang.String BASE_URL = "https://maps.googleapis.com";
    private restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenterImp restaurantPresenterImp;
    private restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication locationCommunication;
    private restaurant.sa.com.sarestaurant.appview.restaurant.view.RestaurantView restaurantView;
    private final int radius = 2000;
    private final boolean sensor = true;
    private boolean isScrolling;
    private int currentItems;
    private int scrolledOutItems;
    private int totalItems;
    private restaurant.sa.com.sarestaurant.appview.restaurant.adapter.LinearLayoutManageScroll layout;
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfPlacesLocation;
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel;
    private boolean isRetrofitCall;
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> listOfModel;
    private restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter adapter;
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> resultList;
    private int x;
    private int stop;
    private boolean isLoading;
    private int totalListSize;
    private android.content.Context restContext;
    private android.os.Handler handler;
    private final java.lang.String error = "Error Occurred";
    private final java.lang.Runnable runnable = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
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
    public void onStop() {
    }
    
    private final void fetchData() {
    }
    
    public final void retrofitCall(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    private final boolean isNetworkAvailable() {
        return false;
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void stopProgress() {
    }
    
    @java.lang.Override()
    public void startProgress() {
    }
    
    public RestaurantFragment() {
        super();
    }
}