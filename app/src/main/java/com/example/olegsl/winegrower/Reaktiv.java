package com.example.olegsl.winegrower;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;


public class Reaktiv extends Fragment {
    Button backbutt;
    ArrayList <Preparat> preparats = new ArrayList<>();
    private static final String TAG = "myLogs";
    String val;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.reaktiv, container, false);

        backbutt = (Button) rootView.findViewById(R.id.backbutt);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Вы нажали на кнопку",
                        Toast.LENGTH_SHORT).show();

            }});

        return rootView;
    }

}
