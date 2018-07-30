package restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient

import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GooglePlacesClient{
    @GET("/maps/api/place/nearbysearch/json")
    fun sendRequestForPlaces(@Query("location") location: String, @Query("radius") radius: String, @retrofit2.http.Query("type") type:String, @Query("sensor") sensor:String, @Query("key") key:String): Call<ResponseModelClass>
}