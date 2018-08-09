package restaurant.sa.com.sarestaurant.appview.restaurant.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J8\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\u0006\u0010\b\u001a\u00020\tH&J(\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\u0006\u0010\b\u001a\u00020\fH&J \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0003j\b\u0012\u0004\u0012\u00020\u000e`\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0014"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter;", "", "getFavListOfTitleImg", "Ljava/util/ArrayList;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "Lkotlin/collections/ArrayList;", "listOfFavoriteRestaurantModel", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "listener", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter$OnTitleImgCallBack;", "getListOfFavLocations", "", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter$OnCallBack;", "getListOfLocations", "Lcom/google/android/gms/maps/model/LatLng;", "responseFromParse", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;", "getListOfTitleImg", "OnCallBack", "OnTitleImgCallBack", "app_debug"})
public abstract interface RestaurantPresenter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfLocations(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass responseFromParse);
    
    public abstract void getListOfFavLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> listOfFavoriteRestaurantModel, @org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter.OnCallBack listener);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getListOfTitleImg(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass responseFromParse);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getFavListOfTitleImg(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> listOfFavoriteRestaurantModel, @org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.RestaurantPresenter.OnTitleImgCallBack listener);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH&\u00a8\u0006\t"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter$OnCallBack;", "", "onFailed", "", "onResponse", "listOfLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface OnCallBack {
        
        public abstract void onResponse(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations);
        
        public abstract void onFailed();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH&\u00a8\u0006\t"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/RestaurantPresenter$OnTitleImgCallBack;", "", "onFailed", "", "onResponse", "titleImgModel", "Ljava/util/ArrayList;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface OnTitleImgCallBack {
        
        public abstract void onResponse(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> titleImgModel);
        
        public abstract void onFailed();
    }
}