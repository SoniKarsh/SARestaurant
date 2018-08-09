package restaurant.sa.com.sarestaurant.appview.maps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020ZH\u0007J\u0006\u0010\\\u001a\u00020XJ\u001e\u0010]\u001a\u00020^2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010_\u001a\u00020Z2\u0006\u0010`\u001a\u00020\fJ\u0006\u0010a\u001a\u00020bJ\u000e\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020^J\u0014\u0010f\u001a\u0004\u0018\u00010\u00162\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\u0012\u0010i\u001a\u00020\u00162\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\u0006\u0010j\u001a\u00020XJ \u0010k\u001a\u00020X2\u0006\u0010l\u001a\u0002052\u0006\u0010m\u001a\u00020\b2\u0006\u0010n\u001a\u00020\fH\u0002J\b\u0010o\u001a\u00020XH\u0002J\u0012\u0010p\u001a\u00020X2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0012\u0010s\u001a\u00020X2\b\u0010t\u001a\u0004\u0018\u00010uH\u0016J\u0012\u0010v\u001a\u00020X2\b\u0010g\u001a\u0004\u0018\u00010rH\u0016J\u0010\u0010w\u001a\u00020X2\u0006\u0010g\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020X2\u0006\u0010g\u001a\u00020\nH\u0016J&\u0010z\u001a\u0004\u0018\u00010\u00162\u0006\u0010-\u001a\u00020.2\b\u0010{\u001a\u0004\u0018\u00010|2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\b\u0010}\u001a\u00020XH\u0016J\u0012\u0010~\u001a\u00020X2\b\u0010g\u001a\u0004\u0018\u00010\"H\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00103\u001a\u0012\u0012\u0004\u0012\u00020504j\b\u0012\u0004\u0012\u000205`6X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010;\u001a\u0012\u0012\u0004\u0012\u00020<04j\b\u0012\u0004\u0012\u00020<`6X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010Q\u001a\u0004\u0018\u00010RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V\u00a8\u0006\u007f"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/maps/MapsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "()V", "DEFAULT_ZOOM", "", "GEOFENCE_RADIUS", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "currentLocation", "Landroid/location/Location;", "getCurrentLocation", "()Landroid/location/Location;", "setCurrentLocation", "(Landroid/location/Location;)V", "fragView", "Landroid/view/View;", "getFragView", "()Landroid/view/View;", "setFragView", "(Landroid/view/View;)V", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "getGeofencingClient", "()Lcom/google/android/gms/location/GeofencingClient;", "setGeofencingClient", "(Lcom/google/android/gms/location/GeofencingClient;)V", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "getGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setGoogleMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "setInflater", "(Landroid/view/LayoutInflater;)V", "listOfLocations", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlin/collections/ArrayList;", "getListOfLocations", "()Ljava/util/ArrayList;", "setListOfLocations", "(Ljava/util/ArrayList;)V", "listOfTitleImgModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/TitleImgModel;", "getListOfTitleImgModel", "setListOfTitleImgModel", "locationCommunication", "Lrestaurant/sa/com/sarestaurant/appview/location/interactor/LocationCommunication;", "getLocationCommunication", "()Lrestaurant/sa/com/sarestaurant/appview/location/interactor/LocationCommunication;", "setLocationCommunication", "(Lrestaurant/sa/com/sarestaurant/appview/location/interactor/LocationCommunication;)V", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mLocationPermissionsGranted", "", "getMLocationPermissionsGranted", "()Z", "setMLocationPermissionsGranted", "(Z)V", "mMapView", "Lcom/google/android/gms/maps/MapView;", "getMMapView", "()Lcom/google/android/gms/maps/MapView;", "setMMapView", "(Lcom/google/android/gms/maps/MapView;)V", "addLocationAlert", "", "lat", "", "lng", "getDeviceLocation", "getGeofence", "Lcom/google/android/gms/location/Geofence;", "lang", "key", "getGeofencePendingIntent", "Landroid/app/PendingIntent;", "getGeofencingRequest", "Lcom/google/android/gms/location/GeofencingRequest;", "geofence", "getInfoContents", "p0", "Lcom/google/android/gms/maps/model/Marker;", "getInfoWindow", "initMap", "moveCamera", "latLng", "zoom", "title", "multipleMarkers", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onConnected", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "onCreateView", "container", "Landroid/view/ViewGroup;", "onDetach", "onMapReady", "app_debug"})
public final class MapsFragment extends android.support.v4.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.maps.GoogleMap.InfoWindowAdapter, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    @org.jetbrains.annotations.NotNull()
    public android.view.View fragView;
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
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> listOfLocations;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel> listOfTitleImgModel;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication locationCommunication;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.GeofencingClient geofencingClient;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    private final int GEOFENCE_RADIUS = 100000;
    @org.jetbrains.annotations.Nullable()
    private android.view.LayoutInflater inflater;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getFragView() {
        return null;
    }
    
    public final void setFragView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
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
    public final restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication getLocationCommunication() {
        return null;
    }
    
    public final void setLocationCommunication(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.location.interactor.LocationCommunication p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.LayoutInflater getInflater() {
        return null;
    }
    
    public final void setInflater(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getInfoContents(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return null;
    }
    
    @java.lang.Override()
    public void onConnectionSuspended(int p0) {
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
    
    @java.lang.Override()
    public void onDetach() {
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
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getInfoWindow(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return null;
    }
    
    private final void moveCamera(com.google.android.gms.maps.model.LatLng latLng, float zoom, java.lang.String title) {
    }
    
    public final void getDeviceLocation() {
    }
    
    public MapsFragment() {
        super();
    }
}