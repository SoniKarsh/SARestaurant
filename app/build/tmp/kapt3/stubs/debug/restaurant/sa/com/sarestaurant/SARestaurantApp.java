package restaurant.sa.com.sarestaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006#"}, d2 = {"Lrestaurant/sa/com/sarestaurant/SARestaurantApp;", "Landroid/app/Application;", "()V", "PREFERENCE_FILE_NAME", "", "getPREFERENCE_FILE_NAME", "()Ljava/lang/String;", "TAG", "getTAG", "isClickableForMap", "", "()Z", "setClickableForMap", "(Z)V", "isFavVisible", "setFavVisible", "isMapVisible", "setMapVisible", "isRestVisible", "setRestVisible", "isWeatherVisible", "setWeatherVisible", "jobId", "", "getJobId", "()I", "sharedPreference", "Landroid/content/SharedPreferences;", "getSharedPreference", "()Landroid/content/SharedPreferences;", "setSharedPreference", "(Landroid/content/SharedPreferences;)V", "onCreate", "", "Companion", "app_debug"})
public final class SARestaurantApp extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences sharedPreference;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PREFERENCE_FILE_NAME = "restaurant.sa.com.sarestaurant.mainactivity";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "SARestaurantApp";
    private boolean isMapVisible;
    private boolean isFavVisible;
    private boolean isRestVisible;
    private final int jobId = 123;
    private boolean isWeatherVisible;
    private boolean isClickableForMap;
    @org.jetbrains.annotations.Nullable()
    private static restaurant.sa.com.sarestaurant.SARestaurantApp instance;
    @org.jetbrains.annotations.Nullable()
    private static restaurant.sa.com.sarestaurant.database.UserDatabase database;
    public static final restaurant.sa.com.sarestaurant.SARestaurantApp.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPreference() {
        return null;
    }
    
    public final void setSharedPreference(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPREFERENCE_FILE_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final boolean isMapVisible() {
        return false;
    }
    
    public final void setMapVisible(boolean p0) {
    }
    
    public final boolean isFavVisible() {
        return false;
    }
    
    public final void setFavVisible(boolean p0) {
    }
    
    public final boolean isRestVisible() {
        return false;
    }
    
    public final void setRestVisible(boolean p0) {
    }
    
    public final int getJobId() {
        return 0;
    }
    
    public final boolean isWeatherVisible() {
        return false;
    }
    
    public final void setWeatherVisible(boolean p0) {
    }
    
    public final boolean isClickableForMap() {
        return false;
    }
    
    public final void setClickableForMap(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public SARestaurantApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lrestaurant/sa/com/sarestaurant/SARestaurantApp$Companion;", "", "()V", "database", "Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "getDatabase", "()Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "setDatabase", "(Lrestaurant/sa/com/sarestaurant/database/UserDatabase;)V", "instance", "Lrestaurant/sa/com/sarestaurant/SARestaurantApp;", "getInstance", "()Lrestaurant/sa/com/sarestaurant/SARestaurantApp;", "setInstance", "(Lrestaurant/sa/com/sarestaurant/SARestaurantApp;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final restaurant.sa.com.sarestaurant.SARestaurantApp getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        restaurant.sa.com.sarestaurant.SARestaurantApp p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final restaurant.sa.com.sarestaurant.database.UserDatabase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.Nullable()
        restaurant.sa.com.sarestaurant.database.UserDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}