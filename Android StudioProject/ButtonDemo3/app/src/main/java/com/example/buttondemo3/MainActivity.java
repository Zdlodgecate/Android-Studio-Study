package com.example.buttondemo3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //首先让MainActivity实现接口，然后定义onClick方法

    private TextView tv_show;
    private Button btn_interface;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv_show=(TextView)findViewById(R.id.tv_show);
        btn_interface=(Button)findViewById(R.id.btn_interface);

        btn_interface.setOnClickListener(this);  //接着添加一个事件监听，然后将MainActivity这个对象自己放入，即this
    }
    public void onClick(View v) {
        tv_show.setText("接口方式处理事件。");
    }
}