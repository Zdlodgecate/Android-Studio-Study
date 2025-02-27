package com.example.phonedialerapplication;

import android.net.Uri;
import android.os.Bundle;
import android.app.SearchManager.OnCancelListener;
import android.content.Intent;
import android.text.TextUtils;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pro4102_2 extends  AppCompatActivity {

    private EditText et_phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro4_2);

        et_phone_number = (EditText)findViewById(R.id.et_phone_number);
        Button btn_call = (Button)findViewById(R.id.btn_call);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pro4), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        btn_call.setOnClickListener(new OnClickListener() {
//
//            public void onClick(View v) {
//                String number = et_phone_number.getText().toString();
//                if(TextUtils.isEmpty(number)) {
//                    Toast.makeText(Pro4102_2.this, "电话号码不能为空", 0).show();
//                    return;
//                }
//                Intent intent=new Intent();
//                intent.setAction("android.intent.action.CALL");
//                intent.addCategory("android.intent.category.DEFAULT");
//                intent.setData(Uri.parse("tel:"+number));
//                startActivity(intent);
//
//            }
//        });
        btn_call.setOnClickListener(v -> {
            String number = et_phone_number.getText().toString();
            if(TextUtils.isEmpty(number)) {
                Toast.makeText(Pro4102_2.this, "电话号码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + number));
            startActivity(intent);
        });


    }
}