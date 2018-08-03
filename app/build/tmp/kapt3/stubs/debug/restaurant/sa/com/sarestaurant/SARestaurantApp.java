package restaurant.sa.com.sarestaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lrestaurant/sa/com/sarestaurant/SARestaurantApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class SARestaurantApp extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static restaurant.sa.com.sarestaurant.database.UserDatabase database;
    @org.jetbrains.annotations.Nullable()
    private static android.content.SharedPreferences sharedPreference;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREFERENCE_FILE_NAME = "restaurant.sa.com.sarestaurant.mainactivity";
    private static int countAdapter;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "SARestaurantApp";
    @org.jetbrains.annotations.NotNull()
    public static android.content.ComponentName componentName;
    public static final restaurant.sa.com.sarestaurant.SARestaurantApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public SARestaurantApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lrestaurant/sa/com/sarestaurant/SARestaurantApp$Companion;", "", "()V", "PREFERENCE_FILE_NAME", "", "getPREFERENCE_FILE_NAME", "()Ljava/lang/String;", "TAG", "getTAG", "componentName", "Landroid/content/ComponentName;", "getComponentName", "()Landroid/content/ComponentName;", "setComponentName", "(Landroid/content/ComponentName;)V", "countAdapter", "", "getCountAdapter", "()I", "setCountAdapter", "(I)V", "database", "Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "getDatabase", "()Lrestaurant/sa/com/sarestaurant/database/UserDatabase;", "setDatabase", "(Lrestaurant/sa/com/sarestaurant/database/UserDatabase;)V", "sharedPreference", "Landroid/content/SharedPreferences;", "getSharedPreference", "()Landroid/content/SharedPreferences;", "setSharedPreference", "(Landroid/content/SharedPreferences;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final restaurant.sa.com.sarestaurant.database.UserDatabase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.Nullable()
        restaurant.sa.com.sarestaurant.database.UserDatabase p0) {
        }
        
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
        
        public final int getCountAdapter() {
            return 0;
        }
        
        public final void setCountAdapter(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.ComponentName getComponentName() {
            return null;
        }
        
        public final void setComponentName(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName p0) {
        }
        
        private Companion() {
            super();
        }
    }
}