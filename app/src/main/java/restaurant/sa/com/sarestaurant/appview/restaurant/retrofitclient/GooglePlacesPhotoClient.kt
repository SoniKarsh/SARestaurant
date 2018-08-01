package restaurant.sa.com.sarestaurant.appview.restaurant.retrofitclient

import restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel.ResponsePhotoModelClass
import restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GooglePlacesPhotoClient {

    @GET("/maps/api/place/details/json")
    fun sendRequestForPlacesPhotos(@Query("placeid") placeId: String, @Query("key") key: String): Call<ResponsePhotoModelClass>

}