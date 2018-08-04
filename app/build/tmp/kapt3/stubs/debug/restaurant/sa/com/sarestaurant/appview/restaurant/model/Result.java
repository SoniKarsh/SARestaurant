package restaurant.sa.com.sarestaurant.appview.restaurant.model;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "Result")
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0018J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u00108J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u00be\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001J\t\u0010X\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010$R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R \u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010$R \u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R \u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\"\"\u0004\bC\u0010$\u00a8\u0006Y"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Result;", "", "_id", "", "geometry", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Geometry;", "icon", "", "name", "id", "photos", "", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Photo;", "placeId", "plusCode", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/PlusCode;", "openingHours", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;", "rating", "", "reference", "scope", "types", "vicinity", "(ILrestaurant/sa/com/sarestaurant/appview/restaurant/model/Geometry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/PlusCode;Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "get_id", "()I", "set_id", "(I)V", "getGeometry", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Geometry;", "setGeometry", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Geometry;)V", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getId", "setId", "getName", "setName", "getOpeningHours", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;", "setOpeningHours", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;)V", "getPhotos", "()Ljava/util/List;", "setPhotos", "(Ljava/util/List;)V", "getPlaceId", "setPlaceId", "getPlusCode", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/PlusCode;", "setPlusCode", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/PlusCode;)V", "getRating", "()Ljava/lang/Double;", "setRating", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getReference", "setReference", "getScope", "setScope", "getTypes", "setTypes", "getVicinity", "setVicinity", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILrestaurant/sa/com/sarestaurant/appview/restaurant/model/Geometry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/PlusCode;Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/OpeningHours;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Result;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Result {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int _id;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Embedded()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry geometry;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "icon")
    private java.lang.String icon;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> photos;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "placeId")
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "place_id")
    private java.lang.String placeId;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Embedded()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode plusCode;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Embedded()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours openingHours;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "rating")
    private java.lang.Double rating;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "reference")
    private java.lang.String reference;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "scope")
    private java.lang.String scope;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> types;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "vicinity")
    private java.lang.String vicinity;
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry getGeometry() {
        return null;
    }
    
    public final void setGeometry(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> getPhotos() {
        return null;
    }
    
    public final void setPhotos(@org.jetbrains.annotations.Nullable()
    java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId() {
        return null;
    }
    
    public final void setPlaceId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode getPlusCode() {
        return null;
    }
    
    public final void setPlusCode(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours getOpeningHours() {
        return null;
    }
    
    public final void setOpeningHours(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReference() {
        return null;
    }
    
    public final void setReference(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScope() {
        return null;
    }
    
    public final void setScope(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTypes() {
        return null;
    }
    
    public final void setTypes(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVicinity() {
        return null;
    }
    
    public final void setVicinity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Result(int _id, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry geometry, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverters(value = {restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotoConverters.class})
    java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> photos, @org.jetbrains.annotations.Nullable()
    java.lang.String placeId, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode plusCode, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours openingHours, @org.jetbrains.annotations.Nullable()
    java.lang.Double rating, @org.jetbrains.annotations.Nullable()
    java.lang.String reference, @org.jetbrains.annotations.Nullable()
    java.lang.String scope, @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverters(value = {restaurant.sa.com.sarestaurant.appview.restaurant.model.TypesConverters.class})
    java.util.List<java.lang.String> types, @org.jetbrains.annotations.Nullable()
    java.lang.String vicinity) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.Result copy(int _id, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry geometry, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverters(value = {restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotoConverters.class})
    java.util.List<restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo> photos, @org.jetbrains.annotations.Nullable()
    java.lang.String placeId, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode plusCode, @org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours openingHours, @org.jetbrains.annotations.Nullable()
    java.lang.Double rating, @org.jetbrains.annotations.Nullable()
    java.lang.String reference, @org.jetbrains.annotations.Nullable()
    java.lang.String scope, @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverters(value = {restaurant.sa.com.sarestaurant.appview.restaurant.model.TypesConverters.class})
    java.util.List<java.lang.String> types, @org.jetbrains.annotations.Nullable()
    java.lang.String vicinity) {
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