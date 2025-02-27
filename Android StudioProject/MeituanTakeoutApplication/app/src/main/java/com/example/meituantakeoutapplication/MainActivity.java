package com.example.meituantakeoutapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import android.graphics.Color;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private LeftFragment leftFragment;
    private RightFragment rightFragment;
    private TextView tv_recommed, tv_must_buy;

    private String[] names1 = {"爆款*肥牛鱼豆腐骨肉相连三荤五素一份米饭", "豪华双人套餐", "【热销】双人套餐（含两份米饭）"};
    private String[] sales1 = {"月售520  好评度80%", "月售520  好评度80%", "月售520  好评度80%"};
    private String[] prices1 = {"$ 23", "$ 41", "$ 32"};
    private int[] imgs1 = {R.drawable.recom_one, R.drawable.recom_two, R.drawable.recom_three};

    private String[] names2 = {"素菜主义一人套餐", "两人经典套套餐", "三人经典套餐"};
    private String[] sales2 = {"月售520  好评度80%", "月售520  好评度80%", "月售520  好评度80%"};
    private String[] prices2 = {"$ 23", "$ 41", "$ 32"};
    private int[] imgs2 = {R.drawable.must_buy_one, R.drawable.must_buy_two, R.drawable.must_buy_three};

    private Map<String, List<FoodsBean>> map;

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
        initData();
        initView();
        initEvent();
    }

    private void initView() {
        fragmentManager = getSupportFragmentManager();
        leftFragment = (LeftFragment) fragmentManager.findFragmentById(R.id.left);
        tv_recommed = findViewById(R.id.tv_recommend);
        tv_must_buy = findViewById(R.id.tv_must_buy);
    }

    private void initData() {
        map = new HashMap<>();
        List<FoodsBean> list1 = new ArrayList<>();
        List<FoodsBean> list2 = new ArrayList<>();
        for (int i = 0; i < names1.length; i++) {
            FoodsBean bean = new FoodsBean();
            bean.setName(names1[i]);
            bean.setPrice(prices1[i]);
            bean.setImg(imgs1[i]);
            bean.setSales(sales1[i]);
            list1.add(bean);
        }
        map.put("1", list1);
        for (int i = 0; i < names2.length; i++) {
            FoodsBean bean = new FoodsBean();
            bean.setName(names2[i]);
            bean.setPrice(prices2[i]);
            bean.setImg(imgs2[i]);
            bean.setSales(sales2[i]);
            list2.add(bean);
        }
        map.put("2", list2);
    }

    private void initEvent() {
        tv_recommed.setOnClickListener(view -> {
            switchData(map.get("1"));
            tv_recommed.setBackgroundColor(Color.WHITE);
        });

        tv_must_buy.setOnClickListener(view -> {
            switchData(map.get("2"));
            tv_must_buy.setBackgroundColor(Color.WHITE);
        });

        switchData(map.get("1"));
    }

    private void switchData(List<FoodsBean> list) {
        rightFragment = new RightFragment().getInstance(list);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.right, rightFragment)
                .commit();
    }
}