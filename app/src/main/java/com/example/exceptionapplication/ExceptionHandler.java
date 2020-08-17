package com.example.exceptionapplication;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
        public static final String TAG = "Exception handler";
        private final Context activity;

        public ExceptionHandler(Context activity) {
            this.activity = activity;
        }

        @Override
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable throwable) {
            Log.e("Handler","Caught the exception",throwable);
            Intent error = new Intent(activity, ErrorCatcher.class);
            error.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(error);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(10);
        }
}

