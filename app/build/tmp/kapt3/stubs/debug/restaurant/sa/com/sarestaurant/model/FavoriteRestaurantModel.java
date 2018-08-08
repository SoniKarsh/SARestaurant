package restaurant.sa.com.sarestaurant.model;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "FavoriteRestaurant")
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0013J\u0010\u00106\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u00107\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010>\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010?\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010@\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u008a\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\u0006H\u00d6\u0001J\t\u0010F\u001a\u00020\bH\u00d6\u0001R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u000b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R \u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R \u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+\u00a8\u0006G"}, d2 = {"Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "", "()V", "_id", "", "adapterPosition", "", "restaurantName", "", "restaurantAddress", "restaurantImagePath", "isFavorite", "", "latitude", "", "longitude", "rating", "rest_isClosed", "placeId", "(Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/Long;", "set_id", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getAdapterPosition", "()I", "setAdapterPosition", "(I)V", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getPlaceId", "()Ljava/lang/String;", "setPlaceId", "(Ljava/lang/String;)V", "getRating", "setRating", "getRest_isClosed", "setRest_isClosed", "getRestaurantAddress", "setRestaurantAddress", "getRestaurantImagePath", "setRestaurantImagePath", "getRestaurantName", "setRestaurantName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class FavoriteRestaurantModel {
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long _id;
    @android.arch.persistence.room.ColumnInfo(name = "adapter_position")
    private int adapterPosition;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "restaurant_name")
    private java.lang.String restaurantName;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "restaurant_address")
    private java.lang.String restaurantAddress;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "restaurant_img_path")
    private java.lang.String restaurantImagePath;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "is_favorite")
    private java.lang.Boolean isFavorite;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "latitude")
    private java.lang.Double latitude;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "longitude")
    private java.lang.Double longitude;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "rating")
    private java.lang.Double rating;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "restIsClosed")
    private java.lang.String rest_isClosed;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "placeId")
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "place_id")
    private java.lang.String placeId;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long get_id() {
        return null;
    }
    
    public final void set_id(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final int getAdapterPosition() {
        return 0;
    }
    
    public final void setAdapterPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestaurantName() {
        return null;
    }
    
    public final void setRestaurantName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestaurantAddress() {
        return null;
    }
    
    public final void setRestaurantAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestaurantImagePath() {
        return null;
    }
    
    public final void setRestaurantImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFavorite() {
        return null;
    }
    
    public final void setFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRest_isClosed() {
        return null;
    }
    
    public final void setRest_isClosed(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId() {
        return null;
    }
    
    public final void setPlaceId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public FavoriteRestaurantModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long _id, int adapterPosition, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantName, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantImagePath, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavorite, @org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double rating, @org.jetbrains.annotations.Nullable()
    java.lang.String rest_isClosed, @org.jetbrains.annotations.Nullable()
    java.lang.String placeId) {
        super();
    }
    
    public FavoriteRestaurantModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long _id, int adapterPosition, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantName, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantImagePath, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavorite, @org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double rating, @org.jetbrains.annotations.Nullable()
    java.lang.String rest_isClosed, @org.jetbrains.annotations.Nullable()
    java.lang.String placeId) {
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