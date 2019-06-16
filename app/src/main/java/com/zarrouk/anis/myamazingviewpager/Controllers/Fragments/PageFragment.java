package com.zarrouk.anis.myamazingviewpager.Controllers.Fragments;


import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import com.zarrouk.anis.myamazingviewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {
    //create keys for our bundle
    private static final String KEY_POSITION = "position";
    private static final String KEY_COLOR = "color";


    public PageFragment() { }

    public static android.support.v4.app.Fragment newInstance(int position, int color) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(KEY_POSITION, position);
        args.putInt(KEY_COLOR, color);
        fragment.setArguments(args);
        return (fragment);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View result = inflater.inflate(R.layout.fragment_page, container, false);
        LinearLayout rootView = (LinearLayout) result.findViewById(R.id.fragment_page_rootview);
        TextView textView = (TextView) result.findViewById(R.id.fragment_page_title);

        int position = getArguments().getInt(KEY_POSITION, -1);
        int color =  getArguments().getInt(KEY_COLOR, -1);


        rootView.setBackgroundColor(color);
        textView.setText("Page numéro "+position);


        Log.e(getClass().getSimpleName(),"on CreateView called for fragment number "+position);

        return result;
    }

}
