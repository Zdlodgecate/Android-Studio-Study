package com.example.fragmentdemoapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

//    private static final int NAVIGATION_SHOUYE = R.id.navigation_shouye;
//    private static final int NAVIGATION_GOUWUCHE = R.id.navigation_gouwuche;
//    private static final int NAVIGATION_ME = R.id.navigation_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_shouye) {
                    selectedFragment = new FragmentShouye();
                } else if (itemId == R.id.navigation_gouwuche) {
                    selectedFragment = new FragmentGouwuche();
                } else if (itemId == R.id.navigation_me) {
                    selectedFragment = new FragmentMe();
                }
//                switch (item.getItemId()) {
//                    case R.id.navigation_shouye:
//                        selectedFragment = new FragmentShouye();
//                        break;
//                    case R.id.navigation_gouwuche:
//                        selectedFragment = new FragmentGouwuche();
//                        break;
//                    case R.id.navigation_me:
//                        selectedFragment = new FragmentMe();
//                        break;
//                    default:
//                        break;
//                }
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.contentContainer, selectedFragment)
                            .commit();
                }
                return true;
            }
        });

        // Set the default tab
        bottomNavigationView.setSelectedItemId(R.id.navigation_shouye);
    }
}