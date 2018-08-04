package restaurant.sa.com.sarestaurant.appview.restaurant.model;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "Geometry")
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Geometry;", "", "location", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Location;", "viewport", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Viewport;", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Location;Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Viewport;)V", "getLocation", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Location;", "setLocation", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Location;)V", "getViewport", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Viewport;", "setViewport", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Viewport;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Geometry {
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Embedded()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.Location location;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Embedded()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport viewport;
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Location p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport getViewport() {
        return null;
    }
    
    public final void setViewport(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport p0) {
    }
    
    public Geometry(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Location location, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport viewport) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Location component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry copy(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Location location, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport viewport) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}