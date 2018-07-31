package restaurant.sa.com.sarestaurant.appview.alarm;

import java.lang.System;

@android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/alarm/ApiCallJobService;", "Landroid/app/job/JobService;", "()V", "TAG", "", "jobCancelled", "", "doBackgroundWork", "", "params", "Landroid/app/job/JobParameters;", "onStartJob", "onStopJob", "app_debug"})
public final class ApiCallJobService extends android.app.job.JobService {
    private final java.lang.String TAG = "ApiCallJobService";
    private boolean jobCancelled;
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters params) {
        return false;
    }
    
    private final void doBackgroundWork(android.app.job.JobParameters params) {
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters params) {
        return false;
    }
    
    public ApiCallJobService() {
        super();
    }
}