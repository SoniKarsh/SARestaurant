package restaurant.sa.com.sarestaurant.dao

import android.arch.persistence.room.*
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result
import restaurant.sa.com.sarestaurant.model.UserModel

@Dao
interface ResultDao {

    @Insert()
    fun insertData(result: Result)

    @Query("SELECT * FROM Result LIMIT :limit OFFSET :offset")
    fun loadAllUsersByPage(limit: Int, offset: Int): List<Result>

    @Query("SELECT * FROM Result")
    fun getAll(): List<Result>

    @Query("DELETE from Result")
    fun deleteAll()

}