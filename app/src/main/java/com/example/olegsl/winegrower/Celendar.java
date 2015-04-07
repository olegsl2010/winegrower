package com.example.olegsl.winegrower;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

/**
 * Created by olegs_000 on 02.04.2015.
 */
public class Celendar extends Fragment{
    Button backbutt;
    TextView text;
    public static final String APP_PREFERENCES = "winegrower";
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.celendar, container, false);
        backbutt = (Button) rootView.findViewById(R.id.backButton5);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }});
        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        text=(TextView)rootView.findViewById(R.id.textView26);
        text.setText((String.valueOf(mSettings.getInt(String.valueOf(R.string.horusRasch), 0)))+"-"+(String.valueOf(mSettings.getInt(String.valueOf(R.string.ridomilRasch), 0)))+"-"+(String.valueOf(mSettings.getInt(String.valueOf(R.string.melodiduoRasch), 0)))+"-"+(String.valueOf(mSettings.getInt(String.valueOf(R.string.strobiRasch), 0)))+"-"+(String.valueOf(mSettings.getInt(String.valueOf(R.string.kvadrisRasch), 0)))+"-"+(String.valueOf(mSettings.getInt(String.valueOf(R.string.kuproksatRasch), 0))));
        return rootView;
    }
}
