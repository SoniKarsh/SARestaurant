package restaurant.sa.com.sarestaurant.appview.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherApiClient;", "", "sendRequestForPlaces", "Lretrofit2/Call;", "Lrestaurant/sa/com/sarestaurant/appview/weather/model/ResponseModelClass;", "q", "", "format", "app_debug"})
public abstract interface WeatherApiClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v1/public/yql")
    public abstract retrofit2.Call<restaurant.sa.com.sarestaurant.appview.weather.model.ResponseModelClass> sendRequestForPlaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "format")
    java.lang.String format);
}