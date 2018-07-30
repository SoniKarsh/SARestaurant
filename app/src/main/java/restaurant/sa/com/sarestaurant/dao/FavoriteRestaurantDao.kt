package restaurant.sa.com.sarestaurant.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel
import restaurant.sa.com.sarestaurant.model.UserModel

@Dao
interface FavoriteRestaurantDao {

    @Insert
    fun insertItem(favoriteRestaurantModel: FavoriteRestaurantModel)

    @Query("DELETE from FavoriteRestaurant WHERE adapter_position = :position")
    fun removeItem(position: Int)

    @Update
    fun updateData(favoriteRestaurantModel: FavoriteRestaurantModel)

    @Query("SELECT * FROM FavoriteRestaurant")
    fun getAll(): List<FavoriteRestaurantModel>

}