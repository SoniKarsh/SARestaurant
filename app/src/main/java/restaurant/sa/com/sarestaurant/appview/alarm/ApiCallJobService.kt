package restaurant.sa.com.sarestaurant.appview.alarm

import android.app.job.JobParameters
import android.app.job.JobService
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.Log

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class ApiCallJobService: JobService() {
    private val TAG = "ApiCallJobService"
    private var jobCancelled = false

    override fun onStartJob(params: JobParameters): Boolean {
        Log.d(TAG, "Job started")
        doBackgroundWork(params)

        return true
    }



    private fun doBackgroundWork(params: JobParameters) {
        Thread(Runnable {
            for (i in 0..9) {
                Log.d(TAG, "run: $i")
                if (jobCancelled) {
                    return@Runnable
                }

                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }

            }

            Log.d(TAG, "Job finished")
            jobFinished(params, false)
        }).start()
    }

    override fun onStopJob(params: JobParameters): Boolean {
        Log.d(TAG, "Job cancelled before completion")
        jobCancelled = true
        return true
    }
}