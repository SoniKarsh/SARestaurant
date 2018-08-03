package restaurant.sa.com.sarestaurant.database;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {restaurant.sa.com.sarestaurant.appview.restaurant.model.TypesConverters.class, restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotoConverters.class})
@android.arch.persistence.room.Database(entities = {restaurant.sa.com.sarestaurant.model.UserModel.class, restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel.class, restaurant.sa.com.sarestaurant.appview.restaurant.model.Result.class}, version = 4)
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "favoriteRestaurantDao", "Lrestaurant/sa/com/sarestaurant/dao/FavoriteRestaurantDao;", "resultDao", "Lrestaurant/sa/com/sarestaurant/dao/ResultDao;", "userDao", "Lrestaurant/sa/com/sarestaurant/dao/UserDao;", "app_debug"})
public abstract class UserDatabase extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract restaurant.sa.com.sarestaurant.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract restaurant.sa.com.sarestaurant.dao.FavoriteRestaurantDao favoriteRestaurantDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract restaurant.sa.com.sarestaurant.dao.ResultDao resultDao();
    
    public UserDatabase() {
        super();
    }
}