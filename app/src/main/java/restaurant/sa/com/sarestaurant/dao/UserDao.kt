package restaurant.sa.com.sarestaurant.dao

import android.arch.persistence.room.*
import restaurant.sa.com.sarestaurant.model.UserModel

@Dao
interface UserDao {

    @Query("SELECT * FROM User")
    fun getAll(): List<UserModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(userModel: UserModel)

    @Query("DELETE from User")
    fun deleteAll()

    @Delete
    fun deleteUser(userModel: UserModel)

    @Update
    fun updateData(userModel: UserModel)

    @Query("SELECT * FROM User WHERE (userName = :userName OR emailId = :userName) AND password = :password")
    fun queryDb(userName: String, password: String): UserModel?

}