package com.zarrouk.anis.myamazingviewpager.Controllers.Activities;

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
        this.configureViewPager();
    }

    private void configureViewPager(){
        ViewPager viewPager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), getResources().getIntArray(R.array.colorPagesViewPager)));

    }
}
