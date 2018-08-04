package restaurant.sa.com.sarestaurant.appview.restaurant.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/PhotoConverters;", "", "()V", "fromImagesJson", "", "stat", "", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Photo;", "toImagesList", "jsonImages", "app_debug"})
public final class PhotoConverters {
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.String fromImagesJson(@org.jetbrains.annotations.Nullable()
    java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> stat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public final java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> toImagesList(@org.jetbrains.annotations.Nullable()
    java.lang.String jsonImages) {
        return null;
    }
    
    public PhotoConverters() {
        super();
    }
}