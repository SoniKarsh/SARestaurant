package restaurant.sa.com.sarestaurant.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotoConverters
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TypesConverters
import restaurant.sa.com.sarestaurant.dao.FavoriteRestaurantDao
import restaurant.sa.com.sarestaurant.dao.ResultDao
import restaurant.sa.com.sarestaurant.dao.UserDao
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel
import restaurant.sa.com.sarestaurant.model.UserModel


@Database(entities = [(UserModel::class), (FavoriteRestaurantModel::class), (Result::class)], version = 4)
@TypeConverters(TypesConverters::class, PhotoConverters::class)
abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao() : UserDao

    abstract fun favoriteRestaurantDao(): FavoriteRestaurantDao

    abstract fun resultDao(): ResultDao

}