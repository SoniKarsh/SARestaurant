package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "PlusCode")
data class PlusCode(
        @SerializedName("compound_code")
        @Expose
        @ColumnInfo(name = "compoundCode") var compoundCode: String?,
        @SerializedName("global_code")
        @Expose
        @ColumnInfo(name = "globalCode") var globalCode: String?)