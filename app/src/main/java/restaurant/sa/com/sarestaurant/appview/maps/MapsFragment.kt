package restaurant.sa.com.sarestaurant.appview.maps


import android.Manifest
import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.*
import com.google.android.gms.maps.*
import restaurant.sa.com.sarestaurant.R
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.fragment_maps.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication
import java.util.*
import kotlin.collections.ArrayList

class MapsFragment: Fragment(), OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {



    override fun onConnectionSuspended(p0: Int) {
        Log.d(TAG, "onConnectionSuspended: ");
    }

    lateinit var fragView: View
    var getLoc: GetLoc?= null
    private val mapFragment: SupportMapFragment? = null
    val TAG = "MapsFragment"
    lateinit var googleMap: GoogleMap
    var mMapView: MapView? = null
    var mLocationPermissionsGranted: Boolean = true
    private val DEFAULT_ZOOM = 15f
    lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    lateinit var currentLocation: Location
    var LOCATION_PERMISSION_REQUEST_CODE = 9999
    var listOfLocations: ArrayList<LatLng> = ArrayList()
    lateinit var locationCommunication: LocationCommunication
    var geofencingClient: GeofencingClient? = null
    lateinit var homeActivity: HomeActivity
    lateinit var curLocation: LatLng
    private val LOC_PERM_REQ_CODE = 1
    //meters
    private val GEOFENCE_RADIUS = 100000
    //in milli seconds
    private val GEOFENCE_EXPIRATION = 6000

    interface GetLoc{
        fun onGetLoc(listener: onReceiveLoc)
        interface onReceiveLoc{
            fun successForLoc()
        }
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
        Log.d(TAG, "onConnectionFailed: ");
    }

    override fun onConnected(p0: Bundle?) {
        Log.d(TAG, "onConnected: ");
        for(i in listOfLocations){
            addLocationAlert(i.latitude, i.longitude);
        }

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        homeActivity = context as HomeActivity
        locationCommunication = homeActivity
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView: 1")
        fragView = inflater.inflate(R.layout.fragment_maps, container, false)
        mMapView = fragView.findViewById(R.id.map)
        Log.d(TAG, "onCreateView: 2")
        initMap()
        Log.d(TAG, "onCreateView: 3")
        return fragView
    }

    fun initMap(){
        mMapView?.onCreate(null)
        mMapView?.onResume()
        mMapView?.getMapAsync(this)
        synchronized(this) {
            Log.i("Client", "created")
            var gclient = GoogleApiClient.Builder(context!!).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build()
            gclient.connect()
//            mydb= Room.databaseBuilder(context, Mydatabase::class.java,"Database").allowMainThreadQueries().build()

        }
        geofencingClient = LocationServices.getGeofencingClient(homeActivity);
        Log.d(TAG, "initMap: ")
//        getLocationPermission()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated: ");

        listOfLocations = locationCommunication.getLocationFromRestaurant()

        getDeviceLocation()
        fun rand(start: Int, end: Int) = Random().nextInt(end + 1 - start) + start
        btnMapType.setOnClickListener {
            when (rand(1, 4)) {
                1 ->
                    googleMap.mapType = GoogleMap.MAP_TYPE_HYBRID
                2 ->
                    googleMap.mapType = GoogleMap.MAP_TYPE_NONE
                3 ->
                    googleMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
                4 ->
                    googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
                else -> Toast.makeText(activity, "Something went wrong", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onMapReady(p0: GoogleMap?) {
        Log.d(TAG, "onMapReady: Map is Ready")
        googleMap = p0!!

        googleMap.setOnMapClickListener(object : GoogleMap.OnMapClickListener {

            override fun onMapClick(p0: LatLng?) {
                Log.d(TAG, "onMapClick: Clicked");
                curLocation = p0!!
//                getLoc!!.onGetLoc()
                addLocationAlert(p0.latitude, p0.longitude);
            }
        });

        multipleMarkers()
        Toast.makeText(activity, "onMapReady", Toast.LENGTH_LONG).show()
    }

    fun getGeofencePendingIntent(): PendingIntent {
        val intent = Intent(homeActivity, LocationAlertIntentService::class.java);
        return PendingIntent.getService(context, 0, intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
    }

    fun getGeofencingRequest(geofence: Geofence): GeofencingRequest {
        val builder: GeofencingRequest.Builder = GeofencingRequest.Builder();

        builder.setInitialTrigger(GeofencingRequest.INITIAL_TRIGGER_DWELL);
        builder.addGeofence(geofence);
        return builder.build();
    }

    fun getGeofence(lat: Double, lang: Double, key: String ): Geofence {
        return Geofence.Builder()
                .setRequestId(key)
                .setCircularRegion(lat, lang, GEOFENCE_RADIUS.toFloat())
                .setExpirationDuration(Geofence.NEVER_EXPIRE)
                .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER or
                        Geofence.GEOFENCE_TRANSITION_DWELL or Geofence.GEOFENCE_TRANSITION_EXIT)
                .setLoiteringDelay(10000)
                .build()
    }

    @SuppressLint("MissingPermission")
    fun addLocationAlert(lat: Double, lng: Double ){
        if (mLocationPermissionsGranted) {
                var key = ""+lat+"-"+lng;
            var geofence: Geofence = getGeofence(lat, lng, key);
            geofencingClient?.addGeofences(getGeofencingRequest(geofence),
                    getGeofencePendingIntent())!!
                    .addOnCompleteListener {
                        if (it.isSuccessful()) {
                            Toast.makeText(homeActivity,
                                    "Location alter has been added",
                                    Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(homeActivity,
                                    "Location alter could not be added",
                                    Toast.LENGTH_SHORT).show();
                        }
            }
        }
    }

    private fun multipleMarkers(){
        var icon = BitmapDescriptorFactory.fromResource(R.drawable.ic_action_marker)
        var options = MarkerOptions()
        if (!listOfLocations.isEmpty()){
            for(i in listOfLocations){
                        options.position(i)
                            .icon(icon)
                googleMap.addMarker(options)
            }

        }else{
            Toast.makeText(this.activity, "Empty!!!", Toast.LENGTH_LONG).show()
            Log.d(TAG, "multipleMarkers: Empty!!!");
        }

    }

    private fun getLocationPermission(){
        Log.d(TAG, "getLocationPermission: getting location permissions")
        val permissions = arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION)

        if(ContextCompat.checkSelfPermission(activity as Context,
                        Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            if(ContextCompat.checkSelfPermission(activity as Context,
                            Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                mLocationPermissionsGranted = true
                initMap()
            }else{
                ActivityCompat.requestPermissions(activity as HomeActivity,
                        permissions,
                        LOCATION_PERMISSION_REQUEST_CODE)
            }
        }else{
            ActivityCompat.requestPermissions(activity as HomeActivity,
                    permissions,
                    LOCATION_PERMISSION_REQUEST_CODE)
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        Log.d(TAG, "onRequestPermissionsResult: onRequestPermissionsResult Called")
        mLocationPermissionsGranted = false
        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty()) {
                    for (i in 0 until grantResults.size) {
                        if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                            mLocationPermissionsGranted = false
                            Log.d(TAG, "onRequestPermissionsResult: permission failed")
                            return
                        }
                    }
                    Log.d(TAG, "onRequestPermissionsResult: permission granted")
                    mLocationPermissionsGranted = true
                    //initialize our map
                    initMap()
                }
            }
        }
    }

    private fun moveCamera(latLng: LatLng, zoom: Float, title: String){
        Log.d(TAG, "moveCamera: moving the camera to: lat: " + latLng.latitude + ", lng: " + latLng.longitude );
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))

        var icon = BitmapDescriptorFactory.fromResource(R.drawable.ic_action_marker)
        var options = MarkerOptions()
                    .position(latLng)
                    .title(title)
                    .icon(icon)
            googleMap.addMarker(options)

//        hideSoftKeyboard()
    }

    fun getDeviceLocation(){
        Log.d(TAG, "getDeviceLocation: getting the current devices location ")
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity as HomeActivity)

        try {
            if (mLocationPermissionsGranted){
                var location = mFusedLocationProviderClient.lastLocation as Task<Location>
                location.addOnCompleteListener {
                    if(it.isSuccessful){
                        Log.d(TAG, "getDeviceLocation: found Location")
                        currentLocation = it.result
                        moveCamera(LatLng(currentLocation.latitude, currentLocation.longitude),
                                DEFAULT_ZOOM, "My Location")
                    }else{
                        Log.d(TAG, "getDeviceLocation: Current location is null")
                        Toast.makeText(activity, "unable to get current location", Toast.LENGTH_LONG).show()
                    }

                }
            }
        }catch (e: SecurityException){
            Log.e(TAG, "getDeviceLocation: SecurityException: "+ e.message)
        }

    }

}
