package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PhotoConverters {

    @TypeConverter
    fun fromImagesJson(stat: List<Photo>?): String? {
        return Gson().toJson(stat)
    }

    @TypeConverter
    fun toImagesList(jsonImages: String?): List<Photo>? {
        val notesType = object : TypeToken<List<Photo>>() {}.type
        return Gson().fromJson<List<Photo>>(jsonImages, notesType)
    }

}