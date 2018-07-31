package restaurant.sa.com.sarestaurant.appview.restaurant.presenter

import restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData

interface HomeCallback{

    fun sendWeatherData(weatherData: WeatherData)
    fun getData()
//    interface onInfoGet{
//
//    }
}