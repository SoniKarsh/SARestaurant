package restaurant.sa.com.sarestaurant.appview.weather.presenter

import android.location.Location

interface WeatherPresenter {

    interface OnReceiveWeatherInfo {
        fun getWeatherInfo(location: Location)
    }

    fun sendLocation(listener: OnReceiveWeatherInfo)

}