package restaurant.sa.com.sarestaurant.appview.location.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001e"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocationImp;", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation;", "mLocationPermissionsGranted", "", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "context", "Landroid/content/Context;", "(ZLcom/google/android/gms/location/FusedLocationProviderClient;Landroid/content/Context;)V", "TAG", "", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentLocation", "Landroid/location/Location;", "error", "getMFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "getMLocationPermissionsGranted", "()Z", "setMLocationPermissionsGranted", "(Z)V", "sendLocation", "", "listener", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation$OnReceiveLocation;", "app_debug"})
public final class GetLocationImp implements restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation {
    private final java.lang.String TAG = "GetLocation";
    private android.location.Location currentLocation;
    private final java.lang.String error = "getDeviceLocation: Current location is null";
    private boolean mLocationPermissionsGranted;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @java.lang.Override()
    public void sendLocation(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation.OnReceiveLocation listener) {
    }
    
    public final boolean getMLocationPermissionsGranted() {
        return false;
    }
    
    public final void setMLocationPermissionsGranted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationProviderClient() {
        return null;
    }
    
    public final void setMFusedLocationProviderClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public GetLocationImp(boolean mLocationPermissionsGranted, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}