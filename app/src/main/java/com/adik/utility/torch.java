package com.adik.utility;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pddstudio.easyflashlight.EasyFlashlight;


public class torch extends Fragment {


    public torch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_torch, container, false);
        Button b;
        Button c;
        b=(Button)rootView.findViewById(R.id.start);
        c=(Button)rootView.findViewById(R.id.stop);
        EasyFlashlight.init(getActivity());
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EasyFlashlight.getInstance().turnOn();            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EasyFlashlight.getInstance().turnOff();            }
        });







        // Inflate the layout for this fragment
        return rootView;
    }


}
