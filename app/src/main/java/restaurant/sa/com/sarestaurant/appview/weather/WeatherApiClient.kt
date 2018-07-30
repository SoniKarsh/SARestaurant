package restaurant.sa.com.sarestaurant.appview.weather


import restaurant.sa.com.sarestaurant.appview.weather.model.ResponseModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiClient{
    @GET("/v1/public/yql")
    fun sendRequestForPlaces(@Query("q") q: String, @Query("format") format: String): Call<ResponseModelClass>
}