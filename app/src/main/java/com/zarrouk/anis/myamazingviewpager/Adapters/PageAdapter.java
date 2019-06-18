package com.zarrouk.anis.myamazingviewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zarrouk.anis.myamazingviewpager.Controllers.Fragments.NewsPageFragment;
import com.zarrouk.anis.myamazingviewpager.Controllers.Fragments.ParamPageFragment;
import com.zarrouk.anis.myamazingviewpager.Controllers.Fragments.ProfilPageFragment;

/**
 * Created by Anis Zarrouk on 16/06/2019
 */
public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case  0:
                return NewsPageFragment.newInstance();
            case  1:
                return ProfilPageFragment.newInstance();
            case 2:
                return ParamPageFragment.newInstance();
            default:
                return  null;

        }

    }

    @Override
    public int getCount() {

        return (3);
    }

    @Override
    public CharSequence getPageTitle(int position) {
       switch (position){
           case 0:
               return "Fil d'actualité ";
           case 1:
               return "Profil";
           case 2:
               return  "Paramètre";
           default:
               return  null;
       }
    }
}
