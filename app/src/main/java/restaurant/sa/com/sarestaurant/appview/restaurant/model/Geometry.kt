package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity

@Entity(tableName = "Geometry")
data class Geometry(
        @Embedded var location: Location?,
        @Embedded var viewport: Viewport?)