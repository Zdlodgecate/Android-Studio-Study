package com.example.sharedpreferencesstorageapplication;

import android.os.Bundle;
import java.util.Map;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editPwd;
    private Button btnLogin;
    private CheckBox cbRemember;

    private static final String FIXED_USER_NAME = "ZCL";
    private static final String FIXED_USER_PWD = "123456";
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

        Map<String, String> userInfo = SPSaveInfo.getInfoFromSP(this);
        if (userInfo != null) {
            editName.setText(userInfo.get("userName"));
            editPwd.setText(userInfo.get("userPwd"));
        }
    }
    private void initView() {
        editName = findViewById(R.id.et_user_name);
        editPwd = findViewById(R.id.et_psw);
        cbRemember = findViewById(R.id.cb_remember);
        btnLogin = findViewById(R.id.btn_login);
    }

    private void initListener() {
        btnLogin.setOnClickListener(v -> {
            String userName = editName.getText().toString().trim();
            String psw = editPwd.getText().toString();

            if (userName.isEmpty() || psw.isEmpty()) {
                Toast.makeText(MainActivity.this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            if (userName.equals(FIXED_USER_NAME) && psw.equals(FIXED_USER_PWD)) {
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();

                if (cbRemember.isChecked()) {
                    boolean isSave = SPSaveInfo.saveInfoToSP(MainActivity.this, userName, psw);
                    if (isSave) {
                        Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
                    }
                }
            } else {
                Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
            }
        });
    }
}