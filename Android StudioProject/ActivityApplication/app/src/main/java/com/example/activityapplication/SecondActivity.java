package com.example.activityapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "SecondActivity-onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "SecondActivity-onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "SecondActivity-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "SecondActivity-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "SecondActivity-onDestroy");
    }
}
