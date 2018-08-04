package restaurant.sa.com.sarestaurant.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\'\u00a8\u0006\r"}, d2 = {"Lrestaurant/sa/com/sarestaurant/dao/ResultDao;", "", "deleteAll", "", "getAll", "", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Result;", "insertData", "result", "loadAllUsersByPage", "limit", "", "offset", "app_debug"})
public abstract interface ResultDao {
    
    @android.arch.persistence.room.Insert()
    public abstract void insertData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Result result);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Result LIMIT :limit OFFSET :offset")
    public abstract java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> loadAllUsersByPage(int limit, int offset);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Result")
    public abstract java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE from Result")
    public abstract void deleteAll();
}