package restaurant.sa.com.sarestaurant.appview.maps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008e\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020cH\u0007J\u0006\u0010e\u001a\u00020aJ\u001e\u0010f\u001a\u00020g2\u0006\u0010b\u001a\u00020c2\u0006\u0010h\u001a\u00020c2\u0006\u0010i\u001a\u00020\u0012J\u0006\u0010j\u001a\u00020kJ\u000e\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020gJ\b\u0010o\u001a\u00020aH\u0002J\u0006\u0010p\u001a\u00020aJ \u0010q\u001a\u00020a2\u0006\u0010r\u001a\u00020\u00162\u0006\u0010s\u001a\u00020\u00072\u0006\u0010t\u001a\u00020\u0012H\u0002J\b\u0010u\u001a\u00020aH\u0002J\u0012\u0010v\u001a\u00020a2\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\u0012\u0010y\u001a\u00020a2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\u0012\u0010|\u001a\u00020a2\b\u0010}\u001a\u0004\u0018\u00010xH\u0016J\u0010\u0010~\u001a\u00020a2\u0006\u0010}\u001a\u00020\u007fH\u0016J\u0011\u0010\u0080\u0001\u001a\u00020a2\u0006\u0010}\u001a\u00020\tH\u0016J+\u0010\u0081\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\u0013\u0010\u0086\u0001\u001a\u00020a2\b\u0010}\u001a\u0004\u0018\u000104H\u0016J4\u0010\u0087\u0001\u001a\u00020a2\u0007\u0010\u0088\u0001\u001a\u00020\t2\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00120\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0016\u00a2\u0006\u0003\u0010\u008d\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00160@j\b\u0012\u0004\u0012\u00020\u0016`AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020SX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010X\u001a\u0004\u0018\u00010YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008f\u0001"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "()V", "DEFAULT_ZOOM", "", "GEOFENCE_EXPIRATION", "", "GEOFENCE_RADIUS", "LOCATION_PERMISSION_REQUEST_CODE", "getLOCATION_PERMISSION_REQUEST_CODE", "()I", "setLOCATION_PERMISSION_REQUEST_CODE", "(I)V", "LOC_PERM_REQ_CODE", "TAG", "", "getTAG", "()Ljava/lang/String;", "curLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "currentLocation", "Landroid/location/Location;", "getCurrentLocation", "()Landroid/location/Location;", "setCurrentLocation", "(Landroid/location/Location;)V", "fragView", "Landroid/view/View;", "getFragView", "()Landroid/view/View;", "setFragView", "(Landroid/view/View;)V", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "getGeofencingClient", "()Lcom/google/android/gms/location/GeofencingClient;", "setGeofencingClient", "(Lcom/google/android/gms/location/GeofencingClient;)V", "getLoc", "Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment$GetLoc;", "getGetLoc", "()Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment$GetLoc;", "setGetLoc", "(Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment$GetLoc;)V", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "getGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setGoogleMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "listOfLocations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getListOfLocations", "()Ljava/util/ArrayList;", "setListOfLocations", "(Ljava/util/ArrayList;)V", "locationCommunication", "Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "getLocationCommunication", "()Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;", "setLocationCommunication", "(Lrestaurant/sa/com/sarestaurant/appview/location/presenter/LocationCommunication;)V", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mLocationPermissionsGranted", "", "getMLocationPermissionsGranted", "()Z", "setMLocationPermissionsGranted", "(Z)V", "mMapView", "Lcom/google/android/gms/maps/MapView;", "getMMapView", "()Lcom/google/android/gms/maps/MapView;", "setMMapView", "(Lcom/google/android/gms/maps/MapView;)V", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "addLocationAlert", "", "lat", "", "lng", "getDeviceLocation", "getGeofence", "Lcom/google/android/gms/location/Geofence;", "lang", "key", "getGeofencePendingIntent", "Landroid/app/PendingIntent;", "getGeofencingRequest", "Lcom/google/android/gms/location/GeofencingRequest;", "geofence", "getLocationPermission", "initMap", "moveCamera", "latLng", "zoom", "title", "multipleMarkers", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onConnected", "p0", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMapReady", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "GetLoc", "app_debug"})
public final class MapsFragment extends android.support.v4.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    @org.jetbrains.annotations.NotNull()
    public android.view.View fragView;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.maps.MapsFragment.GetLoc getLoc;
    private final com.google.android.gms.maps.SupportMapFragment mapFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MapsFragment";
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.MapView mMapView;
    private boolean mLocationPermissionsGranted;
    private final float DEFAULT_ZOOM = 15.0F;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    @org.jetbrains.annotations.NotNull()
    public android.location.Location currentLocation;
    private int LOCATION_PERMISSION_REQUEST_CODE;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication locationCommunication;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.GeofencingClient geofencingClient;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng curLocation;
    private final int LOC_PERM_REQ_CODE = 1;
    private final int GEOFENCE_RADIUS = 100000;
    private final int GEOFENCE_EXPIRATION = 6000;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onConnectionSuspended(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getFragView() {
        return null;
    }
    
    public final void setFragView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.maps.MapsFragment.GetLoc getGetLoc() {
        return null;
    }
    
    public final void setGetLoc(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.maps.MapsFragment.GetLoc p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getGoogleMap() {
        return null;
    }
    
    public final void setGoogleMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.MapView getMMapView() {
        return null;
    }
    
    public final void setMMapView(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.MapView p0) {
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
    public final android.location.Location getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location p0) {
    }
    
    public final int getLOCATION_PERMISSION_REQUEST_CODE() {
        return 0;
    }
    
    public final void setLOCATION_PERMISSION_REQUEST_CODE(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getListOfLocations() {
        return null;
    }
    
    public final void setListOfLocations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication getLocationCommunication() {
        return null;
    }
    
    public final void setLocationCommunication(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.GeofencingClient getGeofencingClient() {
        return null;
    }
    
    public final void setGeofencingClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.GeofencingClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.HomeActivity getHomeActivity() {
        return null;
    }
    
    public final void setHomeActivity(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.HomeActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getCurLocation() {
        return null;
    }
    
    public final void setCurLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult p0) {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
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
    
    public final void initMap() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.PendingIntent getGeofencePendingIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.GeofencingRequest getGeofencingRequest(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.Geofence geofence) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.Geofence getGeofence(double lat, double lang, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void addLocationAlert(double lat, double lng) {
    }
    
    private final void multipleMarkers() {
    }
    
    private final void getLocationPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void moveCamera(com.google.android.gms.maps.model.LatLng latLng, float zoom, java.lang.String title) {
    }
    
    public final void getDeviceLocation() {
    }
    
    public MapsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment$GetLoc;", "", "onGetLoc", "", "listener", "Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment$GetLoc$onReceiveLoc;", "onReceiveLoc", "app_debug"})
    public static abstract interface GetLoc {
        
        public abstract void onGetLoc(@org.jetbrains.annotations.NotNull()
        restaurant.sa.com.sarestaurant.appview.maps.MapsFragment.GetLoc.onReceiveLoc listener);
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment$GetLoc$onReceiveLoc;", "", "successForLoc", "", "app_debug"})
        public static abstract interface onReceiveLoc {
            
            public abstract void successForLoc();
        }
    }
}