package restaurant.sa.com.sarestaurant.appview.maps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006#"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/maps/LocationAlertIntentService;", "Landroid/app/IntentService;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "notification", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "setNotification", "(Landroid/app/Notification;)V", "getErrorString", "errorCode", "", "getGeofenceTransitionInfo", "triggeringGeofences", "", "Lcom/google/android/gms/location/Geofence;", "getLocationName", "key", "getLocationNameGeocoder", "lat", "", "lng", "getTransitionString", "transitionType", "notifyLocationAlert", "", "locTransitionType", "locationDetails", "onHandleIntent", "intent", "Landroid/content/Intent;", "app_debug"})
public final class LocationAlertIntentService extends android.app.IntentService {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "LocationAlertIS";
    @org.jetbrains.annotations.NotNull()
    public android.app.Notification notification;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification getNotification() {
        return null;
    }
    
    public final void setNotification(@org.jetbrains.annotations.NotNull()
    android.app.Notification p0) {
    }
    
    @java.lang.Override()
    protected void onHandleIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final java.lang.String getGeofenceTransitionInfo(java.util.List<? extends com.google.android.gms.location.Geofence> triggeringGeofences) {
        return null;
    }
    
    private final java.lang.String getLocationName(java.lang.String key) {
        return null;
    }
    
    private final java.lang.String getLocationNameGeocoder(double lat, double lng) {
        return null;
    }
    
    private final java.lang.String getErrorString(int errorCode) {
        return null;
    }
    
    private final java.lang.String getTransitionString(int transitionType) {
        return null;
    }
    
    private final void notifyLocationAlert(java.lang.String locTransitionType, java.lang.String locationDetails) {
    }
    
    public LocationAlertIntentService() {
        super(null);
    }
}