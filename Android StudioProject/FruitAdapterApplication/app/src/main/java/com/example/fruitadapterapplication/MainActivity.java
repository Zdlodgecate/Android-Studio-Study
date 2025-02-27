package com.example.fruitadapterapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<Fruit> fruitlist = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            Fruit pineapple=new Fruit(R.drawable.pineapple,"菠萝","¥16.9 元/KG");
            fruitlist.add(pineapple);
            Fruit mango = new Fruit(R.drawable.mango, "芒果","¥29.9 元/kg");
            fruitlist.add(mango);
            Fruit pomegranate = new Fruit(R.drawable.pomegranate, "石榴","¥15元/kg");
            fruitlist.add(pomegranate);
            Fruit grape = new Fruit(R.drawable.grape, "葡萄","¥19.9 元/kg");
            fruitlist.add(grape);
            Fruit apple = new Fruit(R.drawable.apple, "苹果","¥20 元/kg");
            fruitlist.add(apple);
            Fruit orange = new Fruit(R.drawable.orange, "橙子","¥18.8 元/kg");
            fruitlist.add(orange);
            Fruit watermelon = new Fruit(R.drawable.watermelon, "西瓜","¥28.8元/kg");
            fruitlist.add(watermelon);
        }
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitlist);
        listView.setAdapter(adapter);

    }
}