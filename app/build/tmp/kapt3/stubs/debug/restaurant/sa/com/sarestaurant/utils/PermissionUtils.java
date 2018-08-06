package restaurant.sa.com.sarestaurant.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u001b\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010-\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u001b\u00a2\u0006\u0002\u0010\u001fJ-\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u00062\u000e\u0010\'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001b2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\u000e\u00103\u001a\u00020+2\u0006\u0010%\u001a\u00020&R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001f\u00a8\u00065"}, d2 = {"Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils;", "Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "LOCATION_PERMISSION_REQUEST_CODE", "", "getLOCATION_PERMISSION_REQUEST_CODE", "()I", "PERMISSION_DENIED", "", "getPERMISSION_DENIED", "()Ljava/lang/String;", "setPERMISSION_DENIED", "(Ljava/lang/String;)V", "PERMISSION_GRANTED", "getPERMISSION_GRANTED", "setPERMISSION_GRANTED", "TAG", "getTAG", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "nonGrantedPermissions", "", "getNonGrantedPermissions", "()[Ljava/lang/String;", "setNonGrantedPermissions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "permissionCount", "getPermissionCount", "setPermissionCount", "(I)V", "permissionGranted", "Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils$PermissionGranted;", "permissions", "getPermissions", "setPermissions", "askForPermissions", "", "permissionList", "checkPermissions", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setPermissionGranted", "PermissionGranted", "app_debug"})
public final class PermissionUtils implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback {
    private restaurant.sa.com.sarestaurant.utils.PermissionUtils.PermissionGranted permissionGranted;
    private int permissionCount;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "PermissionUtils";
    private final int LOCATION_PERMISSION_REQUEST_CODE = 9001;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] nonGrantedPermissions;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PERMISSION_GRANTED;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PERMISSION_DENIED;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] permissions;
    private final android.content.Context context = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPERMISSION_GRANTED() {
        return null;
    }
    
    public final void setPERMISSION_GRANTED(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPERMISSION_DENIED() {
        return null;
    }
    
    public final void setPERMISSION_DENIED(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getPermissions() {
        return null;
    }
    
    public final void setPermissions(@org.jetbrains.annotations.Nullable()
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
    
    public final void setPermissionGranted(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.utils.PermissionUtils.PermissionGranted permissionGranted) {
    }
    
    public PermissionUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * * This is callback interface.
     */
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lrestaurant/sa/com/sarestaurant/utils/PermissionUtils$PermissionGranted;", "", "onPermissionDenied", "", "onPermissionGranted", "app_debug"})
    public static abstract interface PermissionGranted {
        
        public abstract void onPermissionGranted();
        
        public abstract void onPermissionDenied();
    }
}