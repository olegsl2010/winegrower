package com.example.olegsl.winegrower;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NeedBuy extends Fragment{
    Button backbutt;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.needbuy, container, false);
        backbutt = (Button) rootView.findViewById(R.id.backButton3);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }});

        return rootView;
    }
}
