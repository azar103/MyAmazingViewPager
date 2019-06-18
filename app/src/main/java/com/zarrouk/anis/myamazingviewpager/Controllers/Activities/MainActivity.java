package com.zarrouk.anis.myamazingviewpager.Controllers.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.zarrouk.anis.myamazingviewpager.Adapters.PageAdapter;


import com.zarrouk.anis.myamazingviewpager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.configureViewPagerAndTabs();
    }

    private void configureViewPagerAndTabs(){
        ViewPager pager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()));
        TabLayout tabs = (TabLayout)findViewById(R.id.activity_main_tabs);
        tabs.setupWithViewPager(pager);
        tabs.setTabMode(TabLayout.MODE_FIXED);

    }
}
