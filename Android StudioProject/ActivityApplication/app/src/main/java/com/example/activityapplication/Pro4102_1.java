package com.example.activityapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.util.Log;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pro4102_1 extends AppCompatActivity{

    private static final String TAG = "Pro4102_1_Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro4);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pro4), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button explicitButton = findViewById(R.id.explicit_button);
        explicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 显示Intent方式打开第二个Activity
                Intent intent = new Intent(Pro4102_1.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        Button implicitButton = findViewById(R.id.implicit_button);
        implicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 隐式Intent方式打开第三个Activity
                Intent intent = new Intent("com.example.action.OPEN_THIRD_ACTIVITY");
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Pro4102_1_Activity-onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Pro4102_1_Activity-onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Pro4102_1_Activity-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Pro4102_1_Activity-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Pro4102_1_Activity-onDestroy");
    }
}
