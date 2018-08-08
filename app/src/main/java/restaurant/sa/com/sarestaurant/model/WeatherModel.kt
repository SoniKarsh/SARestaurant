package restaurant.sa.com.sarestaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "Weather")

data class WeatherModel(@PrimaryKey(autoGenerate = true) var _id: Long?,
                     @ColumnInfo(name = "temperature") var temperature: String?,
                     @ColumnInfo(name = "imgUrl") var imgUrl: String?
){
    constructor():this(null,"", "")
}
