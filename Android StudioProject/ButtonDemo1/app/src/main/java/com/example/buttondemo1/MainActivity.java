package com.example.buttondemo1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//    指定Button的onClick属性方式
    private TextView tv_show;
//    匿名内部类方式
    private TextView tv_show1;
    private Button btn_anonymous;
//    接口方式
    private TextView tv_show2;
    private Button btn_interface;
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

        tv_show= findViewById(R.id.tv_show);

        tv_show1= (TextView)findViewById(R.id.tv_show1);
        btn_anonymous=(Button)findViewById(R.id.btn_anonymous);

        btn_anonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show1.setText("匿名内部类处理事件");
            }
        });

    }
//    实现这个click方法
    public void click(View v){
        tv_show.setText("Onclick方式处理事件.");
    }
}