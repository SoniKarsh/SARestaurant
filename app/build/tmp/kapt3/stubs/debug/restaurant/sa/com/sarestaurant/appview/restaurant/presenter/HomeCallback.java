package restaurant.sa.com.sarestaurant.appview.restaurant.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;", "", "getData", "", "sendWeatherData", "weatherData", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/WeatherData;", "app_debug"})
public abstract interface HomeCallback {
    
    public abstract void sendWeatherData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData weatherData);
    
    public abstract void getData();
}