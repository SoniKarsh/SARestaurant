package restaurant.sa.com.sarestaurant.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nJ\u0019\u0010!\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\u0002\u0010\u0018J-\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00062\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00142\u0006\u0010%\u001a\u00020&H\u0016\u00a2\u0006\u0002\u0010\'R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006)"}, d2 = {"Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "LOCATION_PERMISSION_REQUEST_CODE", "", "getLOCATION_PERMISSION_REQUEST_CODE", "()I", "TAG", "", "getTAG", "()Ljava/lang/String;", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "nonGrantedPermissions", "", "getNonGrantedPermissions", "()[Ljava/lang/String;", "setNonGrantedPermissions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "permissionCount", "getPermissionCount", "setPermissionCount", "(I)V", "askForPermissions", "", "permissionList", "checkPermissions", "onRequestPermissionsResult", "requestCode", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "app_debug"})
public final class PermissionUtils implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback {
    private int permissionCount;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "PermissionUtils";
    private final int LOCATION_PERMISSION_REQUEST_CODE = 9001;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] nonGrantedPermissions;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PERMISSION_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PERMISSION_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    public static final restaurant.sa.com.sarestaurant.utils.PermissionUtils.Companion Companion = null;
    
    public final int getPermissionCount() {
        return 0;
    }
    
    public final void setPermissionCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.HomeActivity getHomeActivity() {
        return null;
    }
    
    public final void setHomeActivity(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.HomeActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final int getLOCATION_PERMISSION_REQUEST_CODE() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getNonGrantedPermissions() {
        return null;
    }
    
    public final void setNonGrantedPermissions(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void checkPermissions(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permissionList) {
    }
    
    public final void askForPermissions(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permissionList) {
    }
    
    public final void askForPermissions(@org.jetbrains.annotations.NotNull()
    java.lang.String permissionList) {
    }
    
    public PermissionUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils$Companion;", "", "()V", "PERMISSION_COARSE_LOCATION", "", "getPERMISSION_COARSE_LOCATION", "()Ljava/lang/String;", "PERMISSION_FINE_LOCATION", "getPERMISSION_FINE_LOCATION", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPERMISSION_COARSE_LOCATION() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPERMISSION_FINE_LOCATION() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}