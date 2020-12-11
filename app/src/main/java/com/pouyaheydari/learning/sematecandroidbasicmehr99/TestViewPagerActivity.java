package com.pouyaheydari.learning.sematecandroidbasicmehr99;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TestViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view_pager);

        ViewPager2 pager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        TestViewPagerAdapter adapter = new TestViewPagerAdapter(this);
        pager.setAdapter(adapter);


        new TabLayoutMediator(tabLayout, pager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("First Fragment");
                    break;
                case 1:
                    tab.setText("Second Fragment");
                    break;
                case 2:
                    tab.setText("Third Fragment");
                    break;
            }
        }
        ).attach();

    }
}