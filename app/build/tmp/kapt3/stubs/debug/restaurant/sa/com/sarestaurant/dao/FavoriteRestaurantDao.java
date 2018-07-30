package restaurant.sa.com.sarestaurant.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\f"}, d2 = {"Lrestaurant/sa/com/sarestaurant/dao/FavoriteRestaurantDao;", "", "getAll", "", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "insertItem", "", "favoriteRestaurantModel", "removeItem", "position", "", "updateData", "app_debug"})
public abstract interface FavoriteRestaurantDao {
    
    @android.arch.persistence.room.Insert()
    public abstract void insertItem(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel favoriteRestaurantModel);
    
    @android.arch.persistence.room.Query(value = "DELETE from FavoriteRestaurant WHERE adapter_position = :position")
    public abstract void removeItem(int position);
    
    @android.arch.persistence.room.Update()
    public abstract void updateData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel favoriteRestaurantModel);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM FavoriteRestaurant")
    public abstract java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> getAll();
}