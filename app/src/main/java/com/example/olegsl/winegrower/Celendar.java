package com.example.olegsl.winegrower;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Celendar extends Fragment{
    Button backbutt;
    TextView text;
    TextView date1, date2, date3, date4, date5, date6, date7, date8, date9 ;
    TextView composition1,composition2,composition3,composition4,composition5,composition6,composition7,composition8,composition9;
    public static final String APP_PREFERENCES = "winegrower";
    SharedPreferences mSettings;
    public static int whatClick;





    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.myCelendar, container, false);
        backbutt = (Button) rootView.findViewById(R.id.backButton5);
        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        date1 = (TextView) rootView.findViewById(R.id.tvDate1);
        date2 = (TextView) rootView.findViewById(R.id.tvDate2);
        date3 = (TextView) rootView.findViewById(R.id.tvDate3);
        date4 = (TextView) rootView.findViewById(R.id.tvDate4);
        date5 = (TextView) rootView.findViewById(R.id.tvDate5);
        date6 = (TextView) rootView.findViewById(R.id.tvDate6);
        date7 = (TextView) rootView.findViewById(R.id.tvDate7);
        date8 = (TextView) rootView.findViewById(R.id.tvDate8);
        date9 = (TextView) rootView.findViewById(R.id.tvDate9);

        composition1 = (TextView) rootView.findViewById(R.id.textView29);
        composition2 = (TextView) rootView.findViewById(R.id.textView31);
        composition3 = (TextView) rootView.findViewById(R.id.textView34);
        composition4 = (TextView) rootView.findViewById(R.id.textView37);
        composition5 = (TextView) rootView.findViewById(R.id.textView60);
        composition6 = (TextView) rootView.findViewById(R.id.textView43);
        composition7 = (TextView) rootView.findViewById(R.id.textView46);
        composition8 = (TextView) rootView.findViewById(R.id.textView49);
        composition9 = (TextView) rootView.findViewById(R.id.textView52);


        date1.setOnClickListener(dateClick1);
        date2.setOnClickListener(dateClick1);
        date3.setOnClickListener(dateClick1);
        date4.setOnClickListener(dateClick1);
        date5.setOnClickListener(dateClick1);
        date6.setOnClickListener(dateClick1);
        date7.setOnClickListener(dateClick1);
        date8.setOnClickListener(dateClick1);
        date9.setOnClickListener(dateClick1);
        selectedDates();
        addComposition();

        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDatefields();
                getActivity().onBackPressed();

            }});


        System.out.println(Raschet.getWhatRaschCreated());

        text=(TextView)rootView.findViewById(R.id.textView26);
        if (Raschet.allertShow=false) {
            text.setText((String.valueOf(mSettings.getInt(getString(R.string.horusRasch), 0))) + "-");
        }
        return rootView;

    }

    private void addComposition() {
        if(mSettings.contains(getString(R.string.oprSelect1))==true)
        {
            composition1.setText(mSettings.getString(getString(R.string.oprSelect1),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect2))==true)
        {
            composition2.setText(mSettings.getString(getString(R.string.oprSelect2),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect3))==true)
        {
            composition3.setText(mSettings.getString(getString(R.string.oprSelect3),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect4))==true)
        {
            composition4.setText(mSettings.getString(getString(R.string.oprSelect4),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect5))==true)
        {
            composition5.setText(mSettings.getString(getString(R.string.oprSelect5),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect6))==true)
        {
            composition6.setText(mSettings.getString(getString(R.string.oprSelect6),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect7))==true)
        {
            composition7.setText(mSettings.getString(getString(R.string.oprSelect7),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect8))==true)
        {
            composition8.setText(mSettings.getString(getString(R.string.oprSelect8),"0"));
        }
        if(mSettings.contains(getString(R.string.oprSelect9))==true)
        {
            composition9.setText(mSettings.getString(getString(R.string.oprSelect9),"0"));
        }

    }

    View.OnClickListener dateClick1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("sss", getString(v.getId()) + "   " + R.id.tvDate1);
            DatePickerDialogFragment ddf = new DatePickerDialogFragment();
            ddf.show(getActivity().getFragmentManager(), "date picker dialog fragment");
            setWhatClick(v);
        }
    };

    private void setWhatClick(View v) {
        switch (v.getId()){
            case R.id.tvDate1:
                whatClick = 1;
                break;
            case R.id.tvDate2:
                whatClick = 2;
                break;
            case R.id.tvDate3:
                whatClick = 3;
                break;
            case R.id.tvDate4:
                whatClick = 4;
                break;
            case R.id.tvDate5:
                whatClick = 5;
                break;
            case R.id.tvDate6:
                whatClick = 6;
                break;
            case R.id.tvDate7:
                whatClick = 7;
                break;
            case R.id.tvDate8:
                whatClick = 8;
                break;
            case R.id.tvDate9:
                whatClick = 9;
                break;

        }
    }

    private void setDatefields() {
        final SharedPreferences.Editor editor = mSettings.edit();

        if (date1.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr1), (String) date1.getText());
        }

        if (date2.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr2), (String) date2.getText());
        }


        if (date3.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr3), (String) date3.getText());
        }

        if (date4.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr4), (String) date4.getText());
        }
        editor.apply();
        if (date5.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr5), (String) date5.getText());
        }
        editor.apply();
        if (date6.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr6), (String) date6.getText());
        }
        editor.apply();
        if (date7.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr7), (String) date7.getText());
        }
        editor.apply();
        if (date8.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr8), (String) date8.getText());
        }
        editor.apply();
        if (date9.getText().equals(getString(R.string.tvDate1)))
        {
        }
        else {
            editor.putString(getString(R.string.opr9), (String) date9.getText());
        }
        editor.apply();
        System.out.println(date1);
// ggfjtdyydt

    }
    private void selectedDates() {

        if (mSettings.contains(getString(R.string.opr1))==true)
        {
                date1.setText(mSettings.getString(getString(R.string.opr1), "0"));
            }
        else {
            date1.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr2))==true)
        {
            date2.setText(mSettings.getString(getString(R.string.opr2), "0"));
        }
        else {
            date2.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr3))==true)
        {
            date3.setText(mSettings.getString(getString(R.string.opr3), "0"));
        }
        else {
            date3.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr4))==true)
        {
            date4.setText(mSettings.getString(getString(R.string.opr4), "0"));
        }
        else {
            date4.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr5))==true)
        {
            date5.setText(mSettings.getString(getString(R.string.opr5), "0"));
        }
        else {
            date5.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr6))==true)
        {
            date6.setText(mSettings.getString(getString(R.string.opr6), "0"));
        }
        else {
            date6.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr7))==true)
        {
            date7.setText(mSettings.getString(getString(R.string.opr7), "0"));
        }
        else {
            date7.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr8))==true)
        {
            date8.setText(mSettings.getString(getString(R.string.opr8), "0"));
        }
        else {
            date8.setText(R.string.tvDate1);
        }
        if (mSettings.contains(getString(R.string.opr9))==true)
        {
            date9.setText(mSettings.getString(getString(R.string.opr9), "0"));
        }
        else {
            date9.setText(R.string.tvDate1);
        }

    }
}
