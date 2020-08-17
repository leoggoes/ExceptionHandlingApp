package com.example.exceptionapplication;

import android.app.Application;

public class MyApplication extends Application {

    ExceptionHandler exceptionHandler;
    public MyApplication() {
        super();
        exceptionHandler = new ExceptionHandler(this);
        Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
    }
}
