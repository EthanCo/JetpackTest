package com.heiko.workmanagertest;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * TODO
 *
 * @author Heiko
 * @date 2020/3/19 0019
 */
public class UploadWorker extends Worker {
    public UploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        // Get the input
        /*String imageUriInput = getInputData().getString("KEY_IMAGE_URI");*/

        //在这里工作 比如，在这里，上传图像。
        uploadImages();
        //用结果表明任务是否成功完成
        return Result.success();

        /**
         * 已成功完成：Result.success()
         * 已失败：Result.failure()
         * 需要稍后重试：Result.retry()
         */

        /*// Create the output of the work
        Data outputData = new Data.Builder()
                .putString("KEY_IMAGE_URL", "imageUrl")
                .build();

        // Return the output
        return Result.success(outputData);*/
    }

    private void uploadImages() {
    }
}
