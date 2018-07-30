package restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/retrofitclient/GooglePlacesClient;", "", "sendRequestForPlaces", "Lretrofit2/Call;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;", "location", "", "radius", "type", "sensor", "key", "app_debug"})
public abstract interface GooglePlacesClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/maps/api/place/nearbysearch/json")
    public abstract retrofit2.Call<restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass> sendRequestForPlaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "location")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "radius")
    java.lang.String radius, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sensor")
    java.lang.String sensor, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key);
}