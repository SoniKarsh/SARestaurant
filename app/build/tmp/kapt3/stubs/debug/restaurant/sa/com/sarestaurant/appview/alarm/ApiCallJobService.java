package restaurant.sa.com.sarestaurant.appview.alarm;

import java.lang.System;

@android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020.H\u0016J\u0010\u00102\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020.2\u0006\u0010%\u001a\u00020&H\u0016J\u0006\u00105\u001a\u00020.J\u0006\u00106\u001a\u00020.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/alarm/ApiCallJobService;", "Landroid/app/job/JobService;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/HomeCallback;", "()V", "TAG", "", "builder", "Landroid/support/v4/app/NotificationCompat$Builder;", "getBuilder", "()Landroid/support/v4/app/NotificationCompat$Builder;", "setBuilder", "(Landroid/support/v4/app/NotificationCompat$Builder;)V", "builderLess", "Landroid/app/Notification$Builder;", "getBuilderLess", "()Landroid/app/Notification$Builder;", "setBuilderLess", "(Landroid/app/Notification$Builder;)V", "channelId", "jobCancelled", "", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mNotificationManager", "Landroid/app/NotificationManager;", "notification", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "setNotification", "(Landroid/app/Notification;)V", "notificationLayout", "Landroid/widget/RemoteViews;", "getNotificationLayout", "()Landroid/widget/RemoteViews;", "setNotificationLayout", "(Landroid/widget/RemoteViews;)V", "weatherData", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/WeatherData;", "getWeatherData", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/WeatherData;", "setWeatherData", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/WeatherData;)V", "weatherFragment", "Lrestaurant/sa/com/sarestaurant/appview/weather/WeatherFragment;", "doBackgroundWork", "", "params", "Landroid/app/job/JobParameters;", "getData", "onStartJob", "onStopJob", "sendWeatherData", "shownotification", "updateNotification", "app_debug"})
public final class ApiCallJobService extends android.app.job.JobService implements restaurant.sa.com.sarestaurant.appview.restaurant.presenter.HomeCallback {
    private final java.lang.String TAG = "ApiCallJobService";
    private boolean jobCancelled;
    @org.jetbrains.annotations.NotNull()
    public android.support.v4.app.NotificationCompat.Builder builder;
    @org.jetbrains.annotations.NotNull()
    public android.app.Notification.Builder builderLess;
    private final java.lang.String channelId = "restaurant.sa.com.sarestaurant.appview.alarm";
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationProviderClient;
    private restaurant.sa.com.sarestaurant.appview.weather.WeatherFragment weatherFragment;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData weatherData;
    @org.jetbrains.annotations.Nullable()
    private android.widget.RemoteViews notificationLayout;
    private android.app.NotificationManager mNotificationManager;
    @org.jetbrains.annotations.Nullable()
    private android.app.Notification notification;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.app.NotificationCompat.Builder getBuilder() {
        return null;
    }
    
    public final void setBuilder(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.NotificationCompat.Builder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification.Builder getBuilderLess() {
        return null;
    }
    
    public final void setBuilderLess(@org.jetbrains.annotations.NotNull()
    android.app.Notification.Builder p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData getWeatherData() {
        return null;
    }
    
    public final void setWeatherData(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.RemoteViews getNotificationLayout() {
        return null;
    }
    
    public final void setNotificationLayout(@org.jetbrains.annotations.Nullable()
    android.widget.RemoteViews p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Notification getNotification() {
        return null;
    }
    
    public final void setNotification(@org.jetbrains.annotations.Nullable()
    android.app.Notification p0) {
    }
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters params) {
        return false;
    }
    
    @java.lang.Override()
    public void sendWeatherData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.WeatherData weatherData) {
    }
    
    @java.lang.Override()
    public void getData() {
    }
    
    private final void doBackgroundWork(android.app.job.JobParameters params) {
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters params) {
        return false;
    }
    
    public final void shownotification() {
    }
    
    public final void updateNotification() {
    }
    
    public ApiCallJobService() {
        super();
    }
}