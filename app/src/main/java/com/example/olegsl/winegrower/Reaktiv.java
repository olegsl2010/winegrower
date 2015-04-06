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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Reaktiv extends Fragment {

    int count1, count2, count3, count4, count5, count6, count7, count8, count9, count10, count11, count12, count13, count14, count15, count16,count17,count18;
    Button backbutt;
    EditText text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16,text17,text18;
    public static final String APP_PREFERENCES = "winegrower";
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.reaktiv, container, false);

        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        final SharedPreferences.Editor editor = mSettings.edit();

        backbutt = (Button) rootView.findViewById(R.id.backButton1);
        text1 = (EditText) rootView.findViewById(R.id.editText1);
        text2 = (EditText) rootView.findViewById(R.id.editText2);
        text3 = (EditText) rootView.findViewById(R.id.editText3);
        text4 = (EditText) rootView.findViewById(R.id.editText4);
        text5 = (EditText) rootView.findViewById(R.id.editText5);
        text6 = (EditText) rootView.findViewById(R.id.editText6);
        text7 = (EditText) rootView.findViewById(R.id.editText7);
        text8 = (EditText) rootView.findViewById(R.id.editText8);
        text9 = (EditText) rootView.findViewById(R.id.editText9);
        text10 = (EditText) rootView.findViewById(R.id.editText10);
        text11 = (EditText) rootView.findViewById(R.id.editText11);
        text12 = (EditText) rootView.findViewById(R.id.editText12);
        text13 = (EditText) rootView.findViewById(R.id.editText13);
        text14 = (EditText) rootView.findViewById(R.id.editText14);
        text15 = (EditText) rootView.findViewById(R.id.editText15);
        text16 = (EditText) rootView.findViewById(R.id.editText16);
        text17 = (EditText) rootView.findViewById(R.id.editText17);
        text18 = (EditText) rootView.findViewById(R.id.editText18);

        values();

        backbutt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setTextFields();

                getActivity().onBackPressed();
            }
        });

        return rootView;
    }

    private void setTextFields() {
        final SharedPreferences.Editor editor = mSettings.edit();
        if (text1.getText().toString().equals("")) {
            count1 = 0;
        } else {
            count1 = Integer.parseInt(text1.getText().toString());
            editor.putInt(String.valueOf(R.string.horus), count1);

        }

        if (text2.getText().toString().equals("")) {
            count2 = 0;
        } else {
            count2 = Integer.parseInt(text2.getText().toString());
            editor.putInt(String.valueOf(R.string.sanmayt), count2);

        }

        if (text3.getText().toString().equals("")) {
            count3 = 0;
        } else {
            count3 = Integer.parseInt(text3.getText().toString());
            editor.putInt(String.valueOf(R.string.plantafol30), count3);
        }

        if (text4.getText().toString().equals("")) {
            count4 = 0;
        } else {
            count4 = Integer.parseInt(text4.getText().toString());
            editor.putInt(String.valueOf(R.string.ridomil), count4);
        }

        if (text5.getText().toString().equals("")) {
            count5 = 0;
        } else {
            count5 = Integer.parseInt(text5.getText().toString());
            editor.putInt(String.valueOf(R.string.topaz), count5);
        }

        if (text6.getText().toString().equals("")) {
            count6 = 0;
        } else {
            count6 = Integer.parseInt(text6.getText().toString());
            editor.putInt(String.valueOf(R.string.topsin), count6);
        }

        if (text7.getText().toString().equals("")) {
            count7 = 0;
        } else {
            count7 = Integer.parseInt(text7.getText().toString());
            editor.putInt(String.valueOf(R.string.decis), count7);
        }

        if (text8.getText().toString().equals("")) {
            count8 = 0;
        } else {
            count8 = Integer.parseInt(text8.getText().toString());
            editor.putInt(String.valueOf(R.string.vuskalKombiB), count8);
        }

        if (text9.getText().toString().equals("")) {
            count9 = 0;
        } else {
            count9 = Integer.parseInt(text9.getText().toString());
            editor.putInt(String.valueOf(R.string.maksikropZavyaz), count9);
        }

        if (text10.getText().toString().equals("")) {
            count10 = 0;
        } else {
            count10 = Integer.parseInt(text10.getText().toString());
            editor.putInt(String.valueOf(R.string.melodiduo), count10);
        }

        if (text11.getText().toString().equals("")) {
            count11 = 0;
        } else {
            count11 = Integer.parseInt(text11.getText().toString());
            editor.putInt(String.valueOf(R.string.falkon), count11);
        }

        if (text12.getText().toString().equals("")) {
            count12 = 0;
        } else {
            count12 = Integer.parseInt(text12.getText().toString());
            editor.putInt(String.valueOf(R.string.mospilan), count12);
        }

        if (text13.getText().toString().equals("")) {
            count13 = 0;
        } else {
            count13 = Integer.parseInt(text13.getText().toString());
            editor.putInt(String.valueOf(R.string.strobi), count13);
        }

        if (text14.getText().toString().equals("")) {
            count14 = 0;
        } else {
            count14 = Integer.parseInt(text14.getText().toString());
            editor.putInt(String.valueOf(R.string.kvadris), count14);
        }

        if (text15.getText().toString().equals("")) {
            count15 = 0;
        } else {
            count15 = Integer.parseInt(text15.getText().toString());
            editor.putInt(String.valueOf(R.string.plantafol20), count15);
        }

        if (text16.getText().toString().equals("")) {
            count16 = 0;
        } else {
            count16 = Integer.parseInt(text16.getText().toString());
            editor.putInt(String.valueOf(R.string.plantafol5), count16);
        }
        if (text17.getText().toString().equals("")) {
            count17 = 0;
        } else {
            count17 = Integer.parseInt(text17.getText().toString());
            editor.putInt(String.valueOf(R.string.kuproksat), count17);
        }
        if (text18.getText().toString().equals("")) {
            count18 = 0;
        } else {
            count18 = Integer.parseInt(text18.getText().toString());
            editor.putInt(String.valueOf(R.string.tilt), count18);
        }
        editor.apply();
    }


    private void values() {
        if (mSettings.contains(String.valueOf(R.string.horus))==true)
        {
            text1.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.horus),0)));
        }
        else {
            text1.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.sanmayt))==true)
        {
            text2.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.sanmayt),0)));
        }
        else {
            text2.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.plantafol30))==true)
        {
            text3.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.plantafol30),0)));
        }
        else {
            text3.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.ridomil))==true)
        {
            text4.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.ridomil),0)));
        }
        else {
            text4.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.topaz))==true)
        {
            text5.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.topaz),0)));
        }
        else {
            text5.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.topsin))==true)
        {
            text6.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.topsin),0)));
        }
        else {
            text6.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.decis))==true)
        {
            text7.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.decis),0)));
        }
        else {
            text7.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.vuskalKombiB))==true)
        {
            text8.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.vuskalKombiB),0)));
        }
        else {
            text8.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.maksikropZavyaz))==true)
        {
            text9.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.maksikropZavyaz),0)));
        }
        else {
            text9.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.melodiduo))==true)
        {
            text10.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.melodiduo),0)));
        }
        else {
            text10.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.falkon))==true)
        {
            text11.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.falkon),0)));
        }
        else {
            text11.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.mospilan))==true)
        {
            text12.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.mospilan),0)));
        }
        else {
            text12.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.strobi))==true)
        {
            text13.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.strobi),0)));
        }
        else {
            text13.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.kvadris))==true)
        {
            text14.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.kvadris),0)));
        }
        else {
            text14.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.plantafol20))==true)
        {
            text15.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.plantafol20),0)));
        }
        else {
            text15.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.plantafol5))==true)
        {
            text16.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.plantafol5),0)));
        }
        else {
            text16.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.kuproksat))==true)
        {
            text17.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.kuproksat),0)));
        }
        else {
            text17.setText("0");}
        if (mSettings.contains(String.valueOf(R.string.tilt))==true)
        {
            text18.setText(String.valueOf(mSettings.getInt(String.valueOf(R.string.tilt),0)));
        }
        else {
            text18.setText("0");}
    }

}
