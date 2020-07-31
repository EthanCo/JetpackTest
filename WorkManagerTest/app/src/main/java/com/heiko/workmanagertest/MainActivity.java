package com.heiko.workmanagertest;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import java.util.concurrent.TimeUnit;

/**
 * WorkManager
 * 详见文档:https://developer.android.google.cn/topic/libraries/architecture/workmanager
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //执行 Worker 的确切时间取决于 WorkRequest 中使用的约束以及系统优化。WorkManager 的设计目的就是要在这些限制下提供尽可能好的表现。
        //如果指定了多个约束，您的任务将仅在满足所有约束时才会运行。
        /*Constraints constraints = new Constraints.Builder()
                .setRequiresDeviceIdle(true)
                .setRequiresCharging(true)
                .build();*/

        /*OneTimeWorkRequest uploadWorkRequest = new OneTimeWorkRequest
                .Builder(UploadWorker.class)
                .setConstraints(constraints)
                .build();*/


        /*OneTimeWorkRequest uploadWorkRequest = new OneTimeWorkRequest.Builder(UploadWorker.class)
                .setInitialDelay(10, TimeUnit.MINUTES)
                .build();*/

        //重试和退避政策
        /*OneTimeWorkRequest uploadWorkRequest =
                new OneTimeWorkRequest.Builder(UploadWorker.class)
                        .setBackoffCriteria(
                                BackoffPolicy.LINEAR,
                                OneTimeWorkRequest.MIN_BACKOFF_MILLIS,
                                TimeUnit.MILLISECONDS)
                        .build();*/

        //定义任务的输入/输出
        /*Data imageData = new Data.Builder()
                .putString("KEY_IMAGE_URI", "imageUriString")
                .build();

        OneTimeWorkRequest uploadWorkRequest = new OneTimeWorkRequest.Builder(UploadWorker.class)
                .setInputData(imageData)
                .build();*/
        /*WorkManager.getInstance(this).enqueue(uploadWorkRequest);*/


        findViewById(R.id.btn_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重复性工作
                Constraints constraints = new Constraints.Builder()
                        .setRequiresCharging(true)
                        .build();

                PeriodicWorkRequest saveRequest =
                        new PeriodicWorkRequest.Builder(UploadLogWorker.class, 1, TimeUnit.SECONDS)
                                .setConstraints(constraints)
                                .build();

                WorkManager.getInstance(getApplication())
                        .enqueue(saveRequest);
            }
        });
    }
}
