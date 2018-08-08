package restaurant.sa.com.sarestaurant.model;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "Weather")
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lrestaurant/sa/com/sarestaurant/model/WeatherModel;", "", "()V", "_id", "", "temperature", "", "imgUrl", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/Long;", "set_id", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "getTemperature", "setTemperature", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lrestaurant/sa/com/sarestaurant/model/WeatherModel;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class WeatherModel {
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long _id;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "temperature")
    private java.lang.String temperature;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "imgUrl")
    private java.lang.String imgUrl;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long get_id() {
        return null;
    }
    
    public final void set_id(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemperature() {
        return null;
    }
    
    public final void setTemperature(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImgUrl() {
        return null;
    }
    
    public final void setImgUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public WeatherModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long _id, @org.jetbrains.annotations.Nullable()
    java.lang.String temperature, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
        super();
    }
    
    public WeatherModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.model.WeatherModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long _id, @org.jetbrains.annotations.Nullable()
    java.lang.String temperature, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
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