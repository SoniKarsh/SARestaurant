package restaurant.sa.com.sarestaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "User", indices = arrayOf(Index(value = arrayOf("userName", "emailId"), unique = true)))

data class UserModel(@PrimaryKey(autoGenerate = true) var _id: Long?,
                     @ColumnInfo(name = "emailId") var emailId: String,
                     @ColumnInfo(name = "mobileNo") var mobileNo: String,
                     @ColumnInfo(name = "userName") var userName: String,
                     @ColumnInfo(name = "password") var password: String
){
    constructor():this(null,"", "", "", "")
}
