package restaurant.sa.com.sarestaurant.appview.restaurant.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u00020\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\nj\b\u0012\u0004\u0012\u00020\u001c`\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00150\nj\b\u0012\u0004\u0012\u00020\u0015`\f2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\nj\b\u0012\u0004\u0012\u00020\u0015`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006\u00a8\u0006\""}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenterImp;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter;", "()V", "imgUrl", "", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "listOfFavLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfFavLocations", "()Ljava/util/ArrayList;", "setListOfFavLocations", "(Ljava/util/ArrayList;)V", "listOfLocations", "getListOfLocations", "setListOfLocations", "listOfTitleImgModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "getListOfTitleImgModel", "setListOfTitleImgModel", "noImage", "getNoImage", "", "listOfFavoriteRestaurantModel", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "listener", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter$OnCallBack;", "responseFromParse", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;", "getListOfTitleImg", "app_debug"})
public final class RestaurantPresenterImp implements restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfFavLocations;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imgUrl;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfLocations() {
        return null;
    }
    
    public final void setListOfLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getListOfTitleImgModel() {
        return null;
    }
    
    public final void setListOfTitleImgModel(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfFavLocations() {
        return null;
    }
    
    public final void setListOfFavLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgUrl() {
        return null;
    }
    
    public final void setImgUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter.OnCallBack listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getListOfTitleImg(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass responseFromParse) {
        return null;
    }
    
    public RestaurantPresenterImp() {
        super();
    }
}