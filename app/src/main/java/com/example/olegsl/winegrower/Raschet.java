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

    public static final String APP_PREFERENCES = "winegrower";
    String[] data = {String.valueOf(R.string.opr1),
            String.valueOf(R.string.opr2),
            String.valueOf(R.string.opr3),
            String.valueOf(R.string.opr4),
            String.valueOf(R.string.opr5),
            String.valueOf(R.string.opr6),
            String.valueOf(R.string.opr7),
            String.valueOf(R.string.opr8),
            String.valueOf(R.string.opr9)};

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

        final Spinner spinner = (Spinner) rootView.findViewById(R.id.spinnerChSpraying);

        spinner.setSelection(2);
//        spinner.setPrompt("Title");

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {
                // TODO Auto-generated method stub
                String strChoose = spinner.getSelectedItem().toString();
                poss = spinner.getSelectedItemPosition();
                System.out.println(strChoose+ poss);
                tvInfo.setText(strChoose+poss);
                ((TextView) parent.getChildAt(0)).setTextColor(Color.MAGENTA);
                ((TextView) parent.getChildAt(0)).setTextSize(20);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        ifSelectedItem();


        return rootView;
    }

    private void ifSelectedItem() {
        if (poss==0)
        {

        }
    }

}
