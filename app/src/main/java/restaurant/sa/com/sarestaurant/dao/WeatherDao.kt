package restaurant.sa.com.sarestaurant.dao

import android.arch.persistence.room.*
import restaurant.sa.com.sarestaurant.model.UserModel
import restaurant.sa.com.sarestaurant.model.WeatherModel

@Dao
interface WeatherDao {

    @Query("SELECT * FROM Weather")
    fun getAll(): List<WeatherModel>

    @Insert()
    fun insertData(weatherModel: WeatherModel)

    @Query("DELETE from Weather")
    fun deleteAll()

}