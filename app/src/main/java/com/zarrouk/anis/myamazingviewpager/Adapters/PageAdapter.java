package com.zarrouk.anis.myamazingviewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zarrouk.anis.myamazingviewpager.Controllers.Fragments.PageFragment;

/**
 * Created by Anis Zarrouk on 16/06/2019
 */
public class PageAdapter extends FragmentPagerAdapter {
    private int[] colors;
    public PageAdapter(FragmentManager fm , int[] colors) {
        super(fm);
        this.colors = colors;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position, this.colors[position]);
    }

    @Override
    public int getCount() {

        return (5);
    }
}
