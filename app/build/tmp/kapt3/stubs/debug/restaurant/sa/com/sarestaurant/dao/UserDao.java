package restaurant.sa.com.sarestaurant.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lrestaurant/sa/com/sarestaurant/dao/UserDao;", "", "deleteAll", "", "deleteUser", "userModel", "Lrestaurant/sa/com/sarestaurant/model/UserModel;", "getAll", "", "insertData", "queryDb", "userName", "", "password", "updateData", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM User")
    public abstract java.util.List<restaurant.sa.com.sarestaurant.model.UserModel> getAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.model.UserModel userModel);
    
    @android.arch.persistence.room.Query(value = "DELETE from User")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.model.UserModel userModel);
    
    @android.arch.persistence.room.Update()
    public abstract void updateData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.model.UserModel userModel);
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * FROM User WHERE (userName = :userName OR emailId = :userName) AND password = :password")
    public abstract restaurant.sa.com.sarestaurant.model.UserModel queryDb(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
}