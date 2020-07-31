package com.heiko.workmanagertest;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * 上传日志
 *
 * @author Heiko
 * @date 2020/3/19 0019
 */
public class UploadLogWorker extends Worker {
    public UploadLogWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.i("Z-UploadLog", "currTime:" + System.currentTimeMillis());
        return Result.success();
    }
}
