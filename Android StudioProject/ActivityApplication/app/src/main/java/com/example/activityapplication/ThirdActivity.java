package com.example.activityapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "ThirdActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "ThirdActivity-onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "ThirdActivity-onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "ThirdActivity-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "ThirdActivity-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "ThirdActivity-onDestroy");
    }
}