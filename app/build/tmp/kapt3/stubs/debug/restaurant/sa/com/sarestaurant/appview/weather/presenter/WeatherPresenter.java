package restaurant.sa.com.sarestaurant.appview.weather.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/weather/presenter/WeatherPresenter;", "", "sendLocation", "", "listener", "Lrestaurant/sa/com/sarestaurant/appview/weather/presenter/WeatherPresenter$OnReceiveWeatherInfo;", "OnReceiveWeatherInfo", "app_debug"})
public abstract interface WeatherPresenter {
    
    public abstract void sendLocation(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.weather.presenter.WeatherPresenter.OnReceiveWeatherInfo listener);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/weather/presenter/WeatherPresenter$OnReceiveWeatherInfo;", "", "getWeatherInfo", "", "location", "Landroid/location/Location;", "app_debug"})
    public static abstract interface OnReceiveWeatherInfo {
        
        public abstract void getWeatherInfo(@org.jetbrains.annotations.NotNull()
        android.location.Location location);
    }
}