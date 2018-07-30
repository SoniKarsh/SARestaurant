package restaurant.sa.com.sarestaurant.appview.location.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006#"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocationImp;", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation;", "mLocationPermissionsGranted", "", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "context", "Landroid/content/Context;", "(ZLcom/google/android/gms/location/FusedLocationProviderClient;Landroid/content/Context;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentLocation", "Landroid/location/Location;", "getCurrentLocation", "()Landroid/location/Location;", "setCurrentLocation", "(Landroid/location/Location;)V", "getMFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "getMLocationPermissionsGranted", "()Z", "setMLocationPermissionsGranted", "(Z)V", "sendLocation", "", "listener", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/GetLocation$OnReceiveLocation;", "app_debug"})
public final class GetLocationImp implements restaurant.sa.com.sarestaurant.appview.location.presenter.GetLocation {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "GetLocation";
    @org.jetbrains.annotations.Nullable()
    private android.location.Location currentLocation;
    private boolean mLocationPermissionsGranted;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
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