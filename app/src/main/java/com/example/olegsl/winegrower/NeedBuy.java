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


public class NeedBuy extends Fragment{
    Button backbutt;
    TextView text;
    int needbuy1,needbuy2,needbuy3,needbuy4,needbuy5,needbuy6,needbuy7,needbuy8,needbuy9,needbuy10,needbuy11,needbuy12,needbuy13,needbuy14,needbuy15,needbuy16,needbuy17,needbuy18;
    public static final String APP_PREFERENCES = "winegrower";
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.needbuy, container, false);
        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        text=(TextView)rootView.findViewById(R.id.textView30);
        if (Calculate.allertShow=true) {
            whatCountNeedBuy();


        }




        backbutt = (Button) rootView.findViewById(R.id.backButton3);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }});

        return rootView;
    }

    private void whatCountNeedBuy() {
        String showNeeded = getString(R.string.needBuyShow)+"\n";
        System.out.println("sdafasfasfasffaff-----"+mSettings.getInt(getString(R.string.melodiduoRasch),0));

        if (mSettings.getInt(getString(R.string.horusRasch),0)>0)
        {
           showNeeded+=getString(R.string.horus)+" - "+mSettings.getInt(getString(R.string.horusRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.ridomilRasch),0)>0)
        {
            showNeeded+=getString(R.string.ridomil)+" - "+mSettings.getInt(getString(R.string.ridomilRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.melodiduoRasch),0)>0)
        {
            System.out.println("yeeptaa"+mSettings.getInt(getString(R.string.melodiduoRasch),0));
            showNeeded+=getString(R.string.melodiduo)+" - "+mSettings.getInt(getString(R.string.melodiduoRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.strobiRasch),0)>0)
        {
            showNeeded+=getString(R.string.strobi)+" - "+mSettings.getInt(getString(R.string.strobiRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.kvadrisRasch),0)>0)
        {
            showNeeded+=getString(R.string.kvadris)+" - "+mSettings.getInt(getString(R.string.kvadrisRasch),0)+getString(R.string.milliliters)+"\n";
        }
        if (mSettings.getInt(getString(R.string.kuproksatRasch),0)>0)
        {
            showNeeded+=getString(R.string.kuproksat)+" - "+mSettings.getInt(getString(R.string.kuproksatRasch),0)+getString(R.string.milliliters)+"\n";
        }
        if (mSettings.getInt(getString(R.string.topazRasch),0)>0)
        {
            showNeeded+=getString(R.string.topaz)+" - "+mSettings.getInt(getString(R.string.topazRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.topsinRasch),0)>0)
        {
            showNeeded+=getString(R.string.topsin)+" - "+mSettings.getInt(getString(R.string.topsinRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.falkonRasch),0)>0)
        {
            showNeeded+=getString(R.string.falkon)+" - "+mSettings.getInt(getString(R.string.falkonRasch),0)+getString(R.string.milliliters)+"\n";
        }
        if (mSettings.getInt(getString(R.string.tiltRasch),0)>0)
        {
            showNeeded+=getString(R.string.tilt)+" - "+mSettings.getInt(getString(R.string.tiltRasch),0)+getString(R.string.milliliters)+"\n";
        }
        if (mSettings.getInt(getString(R.string.plantafol30Rasch),0)>0)
        {
            showNeeded+=getString(R.string.plantafol30)+" - "+mSettings.getInt(getString(R.string.plantafol30Rasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.plantafol20Rasch),0)>0)
        {
            showNeeded+=getString(R.string.plantafol20)+" - "+mSettings.getInt(getString(R.string.plantafol20Rasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.plantafol5Rasch),0)>0)
        {
            showNeeded+=getString(R.string.plantafol5)+" - "+mSettings.getInt(getString(R.string.plantafol5Rasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.sanmaytRasch),0)>0)
        {
            showNeeded+=getString(R.string.sanmayt)+" - "+mSettings.getInt(getString(R.string.sanmaytRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.decisRasch),0)>0)
        {
            showNeeded+=getString(R.string.decis)+" - "+mSettings.getInt(getString(R.string.decisRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.mospilanRasch),0)>0)
        {
            showNeeded+=getString(R.string.mospilan)+" - "+mSettings.getInt(getString(R.string.mospilanRasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.vuskalKombiBrasch),0)>0)
        {
            showNeeded+=getString(R.string.vuskalKombiB)+" - "+mSettings.getInt(getString(R.string.vuskalKombiBrasch),0)+getString(R.string.gramm)+"\n";
        }
        if (mSettings.getInt(getString(R.string.maksikropZavyazRasch),0)>0)
        {
            showNeeded+=getString(R.string.maksikropZavyaz)+" - "+mSettings.getInt(getString(R.string.maksikropZavyazRasch),0)+getString(R.string.milliliters)+"\n";
        }

        text.setText(showNeeded);

    }
}
