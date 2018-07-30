package restaurant.sa.com.sarestaurant.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import restaurant.sa.com.sarestaurant.dao.FavoriteRestaurantDao
import restaurant.sa.com.sarestaurant.dao.UserDao
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel
import restaurant.sa.com.sarestaurant.model.UserModel


@Database(entities = [(UserModel::class), (FavoriteRestaurantModel::class)], version = 1)
abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao() : UserDao

    abstract fun favoriteRestaurantDao(): FavoriteRestaurantDao

}