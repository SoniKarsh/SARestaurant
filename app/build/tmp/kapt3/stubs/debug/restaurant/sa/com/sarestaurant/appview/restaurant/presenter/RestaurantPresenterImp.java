package restaurant.sa.com.sarestaurant.appview.restaurant.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0004j\b\u0012\u0004\u0012\u00020\u0010`\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenterImp;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter;", "()V", "listOfFavLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfFavLocations", "()Ljava/util/ArrayList;", "setListOfFavLocations", "(Ljava/util/ArrayList;)V", "listOfLocations", "getListOfLocations", "setListOfLocations", "", "listOfFavoriteRestaurantModel", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "listener", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter$onCallback;", "responseFromParse", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;", "app_debug"})
public final class RestaurantPresenterImp implements restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfFavLocations;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfLocations() {
        return null;
    }
    
    public final void setListOfLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfFavLocations() {
        return null;
    }
    
    public final void setListOfFavLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfLocations(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass responseFromParse) {
        return null;
    }
    
    @java.lang.Override()
    public void getListOfFavLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> listOfFavoriteRestaurantModel, @org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter.onCallback listener) {
    }
    
    public RestaurantPresenterImp() {
        super();
    }
}