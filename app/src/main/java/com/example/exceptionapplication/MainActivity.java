package com.example.exceptionapplication;

import android.util.AndroidException;
import android.util.AndroidRuntimeException;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Uncomment to throw excpetion
        //throw new AndroidRuntimeException("Catch this excpetion");
    }
}