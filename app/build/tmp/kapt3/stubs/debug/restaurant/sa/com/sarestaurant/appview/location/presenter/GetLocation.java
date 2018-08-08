package restaurant.sa.com.sarestaurant.appview.location.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation;", "", "sendLocation", "", "listener", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation$OnReceiveLocation;", "OnReceiveLocation", "app_debug"})
public abstract interface GetLocation {
    
    public abstract void sendLocation(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation.OnReceiveLocation listener);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation$OnReceiveLocation;", "", "getDeviceLastLocation", "", "location", "Landroid/location/Location;", "onError", "error", "", "app_debug"})
    public static abstract interface OnReceiveLocation {
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
        
        public abstract void getDeviceLastLocation(@org.jetbrains.annotations.NotNull()
        android.location.Location location);
    }
}