package restaurant.sa.com.sarestaurant.appview.restaurant.model

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TypesConverters {

    @TypeConverter
    fun fromImagesJson(stat: List<String>): String {
        return Gson().toJson(stat)
    }

    @TypeConverter
    fun toImagesList(jsonImages: String): List<String> {
        val notesType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson<List<String>>(jsonImages, notesType)
    }

}