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
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.tasks.Task
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.custom_info_window.view.*
import kotlinx.android.synthetic.main.fragment_maps.*
import kotlinx.android.synthetic.main.fragment_restaurant_detail.*
import kotlinx.android.synthetic.main.fragment_restaurant_detail.view.*
import restaurant.sa.com.sarestaurant.HomeActivity
import restaurant.sa.com.sarestaurant.SARestaurantApp
import restaurant.sa.com.sarestaurant.appview.location.presenter.LocationCommunication
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TitleImgModel
import restaurant.sa.com.sarestaurant.appview.restaurant.presenter.MarkerCallback
import restaurant.sa.com.sarestaurant.utils.LogUtils
import java.util.*
import kotlin.collections.ArrayList

class MapsFragment: Fragment(), OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleMap.InfoWindowAdapter, GoogleApiClient.OnConnectionFailedListener {

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
    var listOfTitleImgModel: ArrayList<TitleImgModel> = ArrayList()
    lateinit var locationCommunication: LocationCommunication
    var geofencingClient: GeofencingClient? = null
    lateinit var homeActivity: HomeActivity
    lateinit var curLocation: LatLng
    private val LOC_PERM_REQ_CODE = 1
    //meters
    private val GEOFENCE_RADIUS = 100000
    //in milli seconds
    private val GEOFENCE_EXPIRATION = 6000
    var inflater: LayoutInflater? = null


    interface GetLoc{
        fun onGetLoc(listener: onReceiveLoc)
        interface onReceiveLoc{
            fun successForLoc()
        }
    }

    override fun getInfoContents(p0: Marker?): View? {
        return null
    }


    override fun onConnectionSuspended(p0: Int) {
        Log.d(TAG, "onConnectionSuspended: ")
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
        SARestaurantApp.isMapVisible = true
        homeActivity = context as HomeActivity
//        context.supportActionBar?.title = TAG
        context.supportActionBar?.hide()
        locationCommunication = homeActivity
    }

    override fun onDetach() {
        SARestaurantApp.isMapVisible = false
        super.onDetach()
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
        listOfTitleImgModel = locationCommunication.getNameImgFromRestaurant()
        LogUtils.setTag(TAG)
        LogUtils.d(listOfTitleImgModel.size.toString()+""+listOfLocations.size.toString())

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

    @SuppressLint("MissingPermission")
    override fun onMapReady(p0: GoogleMap?) {
        Log.d(TAG, "onMapReady: Map is Ready")
        googleMap = p0!!
        googleMap.isMyLocationEnabled = true
        googleMap.setInfoWindowAdapter(this)
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
            for(i in 0 until listOfLocations.size){
                        options.position(listOfLocations[i])
                            .icon(icon)
                            .title(listOfTitleImgModel[i].name)
                            .snippet(i.toString())
                googleMap.addMarker(options)
            }

        }else{
            Toast.makeText(this.activity, "Empty!!!", Toast.LENGTH_LONG).show()
            Log.d(TAG, "multipleMarkers: Empty!!!");
        }

    }

    override fun getInfoWindow(p0: Marker?): View {
        val i = p0!!.snippet.toInt()
        inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
        val v: View = inflater!!.inflate(R.layout.custom_info_window, null)
        v.tvInfo.text = p0.title
        v.tvAddress.text = listOfTitleImgModel[i].address
        v.ratingBar2.rating = listOfTitleImgModel[i].rating!!.toFloat()
        if(v.ratingBar2.rating == 0.0.toFloat()){
            v.ratingBar2.visibility = View.GONE
            v.tvRatingBar2.visibility = View.VISIBLE
        }
        Log.d(TAG, "getInfoWindow: ${p0.snippet}")
        Picasso.get().load(listOfTitleImgModel[i].imgUrl)
                .into(v.ivInfo, MarkerCallback(p0))
        return v
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
