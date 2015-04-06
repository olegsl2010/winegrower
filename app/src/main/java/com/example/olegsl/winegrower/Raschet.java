package com.example.olegsl.winegrower;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

import static android.R.*;

/**
 * Created by olegs_000 on 02.04.2015.
 */
public class Raschet extends Fragment{
    Button backbutt;
    int horus;
    int poss;
    Spinner spinnerMain;
    Spinner spinner1;
    Spinner spinner2;

    public static final String APP_PREFERENCES = "winegrower";

    TextView tvInfo;
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.raschet, container, false);


        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        tvInfo = (TextView) rootView.findViewById(R.id.textView);
        Map<String, ?> allPreferences = mSettings.getAll();
        boolean containtsNickName = mSettings.contains(String.valueOf(R.string.horus));
        horus = mSettings.getInt(String.valueOf(R.string.horus), 0);
        tvInfo.setText("Хорус -"+String.valueOf(horus));


        System.out.println(allPreferences);
        System.out.println(String.valueOf(containtsNickName));
        System.out.println(String.valueOf(horus));

        backbutt = (Button) rootView.findViewById(R.id.backButton2);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }
        });

         spinnerMain = (Spinner) rootView.findViewById(R.id.spinnerChSpraying);
        spinner1 = (Spinner) rootView.findViewById(R.id.spinnerPrep1);
        spinner2 = (Spinner) rootView.findViewById(R.id.spinnerPrep2);

        spinnerMain.setSelection(2);
//        spinner.setPrompt("Title");

        spinnerMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {
                // TODO Auto-generated method stub
                String strChoose = spinnerMain.getSelectedItem().toString();
                poss = spinnerMain.getSelectedItemPosition();
                System.out.println(strChoose+ poss);
                tvInfo.setText(strChoose+poss);
                ((TextView) parent.getChildAt(0)).setTextColor(Color.MAGENTA);
                ((TextView) parent.getChildAt(0)).setTextSize(20);
                ifSelectedItem1();
                ifSelectedItem2();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
//        ifSelectedItem();


        return rootView;
    }

    private void ifSelectedItem2() {
        if (poss==0)
        {
            spinner1.setSelection(1);
        }
        if (poss==1)
        {
            spinner1.setSelection(2);
        }
        if (poss==2)
        {
            spinner1.setSelection(0);
        }
        if (poss==3)
        {
            spinner1.setSelection(3);
        }
        if (poss==4)
        {
            spinner1.setSelection(1);
        }
        if (poss==5)
        {
            spinner1.setSelection(1);
        }
        if (poss==6)
        {
            spinner1.setSelection(5);
        }
        if (poss==7)
        {
            spinner1.setSelection(7);
        }
        if (poss==8)
        {
            spinner1.setSelection(7);
        }


    }

    private void ifSelectedItem1() {
        if (poss==0)
        {
spinner2.setSelection(1);
        }
        if (poss==1)
        {
            spinner2.setSelection(2);
        }
        if (poss==2)
        {
            spinner2.setSelection(0);
        }
        if (poss==3)
        {
            spinner2.setSelection(4);
        }
        if (poss==4)
        {
            spinner2.setSelection(4);
        }
        if (poss==5)
        {
            spinner2.setSelection(1);
        }
        if (poss==6)
        {
            spinner2.setSelection(5);
        }
        if (poss==7)
        {
            spinner2.setSelection(5);
        }
        if (poss==8)
        {
            spinner2.setSelection(0);
        }
    }

}
