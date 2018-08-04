package restaurant.sa.com.sarestaurant.appview.restaurant.model;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "OpeningHours")
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;", "", "openNow", "", "(Ljava/lang/Boolean;)V", "getOpenNow", "()Ljava/lang/Boolean;", "setOpenNow", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class OpeningHours {
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "openNow")
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "open_now")
    private java.lang.Boolean openNow;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOpenNow() {
        return null;
    }
    
    public final void setOpenNow(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public OpeningHours(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean openNow) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean openNow) {
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