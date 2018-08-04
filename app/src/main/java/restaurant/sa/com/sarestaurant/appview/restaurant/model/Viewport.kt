package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "Viewport")
data class Viewport(
        @Embedded var northeast: Northeast?,
        @Embedded var southwest: Southwest?)

