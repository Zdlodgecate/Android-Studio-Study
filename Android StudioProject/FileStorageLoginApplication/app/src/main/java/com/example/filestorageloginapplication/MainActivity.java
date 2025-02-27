package com.example.filestorageloginapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import java.util.Map;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editPwd;
    private Button btnLogin;

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
        initView();
        initListener();

        Map<String, String> userInfo = SaveFile.getInfoFromFile(this);
        if (userInfo != null) {
            editName.setText(userInfo.get("userName"));
            editPwd.setText(userInfo.get("userPwd"));
        }
    }
    private void initView() {
        editName = findViewById(R.id.et_user_name);
        editPwd = findViewById(R.id.et_psw);
        btnLogin = findViewById(R.id.btn_login);
    }
    private void initListener() {
        btnLogin.setOnClickListener(v -> {
            String userName = editName.getText().toString().trim();
            String psw = editPwd.getText().toString();

            if (userName.isEmpty() || psw.isEmpty()) {
                Toast.makeText(MainActivity.this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
                return;
            } else {
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();

                boolean isSave = SaveFile.saveInfoToFile(MainActivity.this, userName, psw);
                if (isSave) {
                    Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}