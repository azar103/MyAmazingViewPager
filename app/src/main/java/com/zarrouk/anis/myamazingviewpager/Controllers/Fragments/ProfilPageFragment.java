package com.zarrouk.anis.myamazingviewpager.Controllers.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zarrouk.anis.myamazingviewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilPageFragment extends Fragment {


    public static ProfilPageFragment newInstance() {

        return (new ProfilPageFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_page, container, false);
    }

}
