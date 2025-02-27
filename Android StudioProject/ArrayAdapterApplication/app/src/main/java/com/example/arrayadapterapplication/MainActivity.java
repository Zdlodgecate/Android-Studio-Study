package com.example.arrayadapterapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Construct the data source
    private ArrayList<Members> arrayOfMembers = new ArrayList<Members>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Create the adapter to convert the array to views
        MembersAdapter adapter = new MembersAdapter(this, arrayOfMembers);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // add members
        addMembers();
    }
    public void addMembers()
    {
        Members member1 = new Members(R.drawable.img1, "猕猴桃", "生产日期：2023-06-21");
        arrayOfMembers.add(member1);
        Members member2 = new Members(R.drawable.img2, "甜橙", "生产日期：2023-05-04");
        arrayOfMembers.add(member2);
        Members member3 = new Members(R.drawable.img3, "西瓜", "生产日期：2023-09-23");
        arrayOfMembers.add(member3);
        Members member4 = new Members(R.drawable.img4, "草莓", "生产日期：2023-01-04");
        arrayOfMembers.add(member4);
        Members member5 = new Members(R.drawable.img5, "苹果", "生产日期：2023-03-23");
        arrayOfMembers.add(member5);
        Members member6 = new Members(R.drawable.img6, "甜桃", "生产日期：2023-05-28");
        arrayOfMembers.add(member6);
        Members member7 = new Members(R.drawable.img7, "芒果", "生产日期：2023-07-02");
        arrayOfMembers.add(member7);
        Members member8 = new Members(R.drawable.img8, "樱桃", "生产日期：2023-11-15");
        arrayOfMembers.add(member8);
        Members member9 = new Members(R.drawable.img9, "橙子", "生产日期：2023-07-17");
        arrayOfMembers.add(member9);
        Members member10 = new Members(R.drawable.img10, "樱桃", "生产日期：2023-01-01");
        arrayOfMembers.add(member10);
        Members member11 = new Members(R.drawable.img11, "蓝莓", "生产日期：2023-04-24");
        arrayOfMembers.add(member11);
    }

}