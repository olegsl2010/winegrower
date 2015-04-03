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
public class Raschet extends Fragment{
    Button backbutt;
    int horus;
    public static final String APP_PREFERENCES = "winegrower";

    TextView tvInfo;
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.raschet, container, false);



        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        tvInfo = (TextView)rootView.findViewById(R.id.textView);
        Map<String, ?> allPreferences = mSettings.getAll();
        boolean containtsNickName = mSettings.contains(String.valueOf(R.string.horus));
        horus = mSettings.getInt(String.valueOf(R.string.horus),0);
        tvInfo.setText("Хорус -"+String.valueOf(horus));

        System.out.println(allPreferences);
        System.out.println(String.valueOf(containtsNickName));
        System.out.println(String.valueOf(horus));

        backbutt = (Button) rootView.findViewById(R.id.backButton2);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }});

        return rootView;
    }
}
