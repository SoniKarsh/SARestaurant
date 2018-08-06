package restaurant.sa.com.sarestaurant.appview.location.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005H&J \u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J \u0010\u000b\u001a\u00020\t2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005H&\u00a8\u0006\r"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "", "getLocationFromRestaurant", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getNameImgFromRestaurant", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "sendLocationFromRestaurant", "", "listOfLocations", "sendNameImgFromRestaurant", "listOfTitleImgModel", "app_debug"})
public abstract interface LocationCommunication {
    
    public abstract void sendLocationFromRestaurant(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getLocationFromRestaurant();
    
    public abstract void sendNameImgFromRestaurant(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> getNameImgFromRestaurant();
}