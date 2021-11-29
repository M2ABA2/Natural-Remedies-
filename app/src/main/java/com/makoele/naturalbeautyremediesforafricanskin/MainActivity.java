package com.makoele.naturalbeautyremediesforafricanskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        toolbar.setSubtitle("Beauty Remedies for Black Women");
        //toolbar.setSubtitleTextColor();

        //TabLayout responsible for fragment  view
        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);

        //Add tabs in TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Face"));
        tabLayout.addTab(tabLayout.newTab().setText("Hair"));
        tabLayout.addTab(tabLayout.newTab().setText("Body"));
        tabLayout.addTab(tabLayout.newTab().setText("Health"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Adapter
       final PagerAdapter adapter = new PageAdapter(this,getSupportFragmentManager(),tabLayout.getTabCount());
       viewPager.setAdapter(adapter);

       viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        //Change tabs view when tab is selected
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}