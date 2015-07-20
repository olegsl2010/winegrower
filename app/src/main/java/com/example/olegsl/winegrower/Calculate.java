package com.example.olegsl.winegrower;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Calculate extends Fragment{
    Button backbutt;
    Button button;
    EditText vedro;
    static Boolean allertShow;
    Boolean allarms;
    static int whatRaschCreated;
    int count,count1, count2, count3, count4, count5, count6, count7, count8, count9, count10, count11, count12, count13, count14, count15, count16, count17, count18;
    int countSumm1, countSumm2, countSumm3, countSumm4, countSumm5, countSumm6, countSumm7, countSumm8, countSumm9, countSumm10, countSumm11, countSumm12, countSumm13, countSumm14, countSumm15, countSumm16, countSumm17, countSumm18;
    int delFromRaschet1, delFromRaschet2, delFromRaschet3, delFromRaschet4, delFromRaschet5, delFromRaschet6, delFromRaschet7, delFromRaschet8, delFromRaschet9, delFromRaschet10, delFromRaschet11, delFromRaschet12, delFromRaschet13, delFromRaschet14, delFromRaschet15, delFromRaschet16, delFromRaschet17, delFromRaschet18;
    int poss;
    int poss1, poss2, poss3, poss4, poss5;
    int needBuy1, needBuy2, needBuy3, needBuy4, needBuy5, needBuy6, needBuy7, needBuy8, needBuy9, needBuy10, needBuy11, needBuy12, needBuy13, needBuy14, needBuy15, needBuy16, needBuy17, needBuy18;
    String preparat1, preparat2,preparat3,preparat4,preparat5;
    String msgToAddCelendar;
    String msgToInform;
    Spinner spinnerMain;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    AlertDialog.Builder builder;
    AlertDialog.Builder builder1;
    public static final String APP_PREFERENCES = "winegrower";

    //    TextView tvInfo;
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.raschet, container, false);

        builder = new AlertDialog.Builder(rootView.getContext());
        builder1 = new AlertDialog.Builder(rootView.getContext());
        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);


        vedro = (EditText) rootView.findViewById(R.id.editText);
        countVedra();

        backbutt = (Button) rootView.findViewById(R.id.backButton2);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }
        });
        button = (Button) rootView.findViewById(R.id.buttonRasch);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                whatRaschetCreated();
                poss = spinnerMain.getSelectedItemPosition();
                poss1=spinner1.getSelectedItemPosition();
                poss2=spinner2.getSelectedItemPosition();
                poss3=spinner3.getSelectedItemPosition();
                poss4=spinner4.getSelectedItemPosition();
                poss5=spinner5.getSelectedItemPosition();

                raschetBakSmesy();
            }
        });

        spinnerMain = (Spinner) rootView.findViewById(R.id.spinnerChSpraying);
        spinner1 = (Spinner) rootView.findViewById(R.id.spinnerPrep1);
        spinner2 = (Spinner) rootView.findViewById(R.id.spinnerPrep2);
        spinner3 = (Spinner) rootView.findViewById(R.id.spinnerPrep3);
        spinner4 = (Spinner) rootView.findViewById(R.id.spinnerPrep4);
        spinner5 = (Spinner) rootView.findViewById(R.id.spinnerPrep5);


        spinnerMain.setSelection(2);

        spinnerMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {
                poss = spinnerMain.getSelectedItemPosition();
                ifSelectedItem1();
                ifSelectedItem2();
                ifSelectedItem3();
                ifSelectedItem4();
                ifSelectedItem5();

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });



        return rootView;
    }

    private void saveToCelendar() {
        msgToAddCelendar="";
        final SharedPreferences.Editor editor = mSettings.edit();
        switch (whatRaschCreated){
            case(1):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect1),msgToAddCelendar);
                break;
            case(2):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect2),msgToAddCelendar);
                break;
            case(3):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect3),msgToAddCelendar);
                break;
            case(4):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect4),msgToAddCelendar);
                break;
            case(5):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect5),msgToAddCelendar);
                break;
            case(6):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect6),msgToAddCelendar);
                break;
            case(7):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect7),msgToAddCelendar);
                break;
            case(8):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }
            editor.putString(getString(R.string.oprSelect8),msgToAddCelendar);
                break;
            case(9):
            if (preparat1.equals("")!=true)
            {
                msgToAddCelendar+=preparat1+"\n";
            }
            if (preparat2.equals("")!=true)
            {
                msgToAddCelendar+=preparat2+"\n";
            }
            if (preparat3.equals("")!=true)
            {
                msgToAddCelendar+=preparat3+"\n";
            }
            if (preparat4.equals("")!=true)
            {
                msgToAddCelendar+=preparat4+"\n";
            }
            if (preparat5.equals("")!=true)
            {
                msgToAddCelendar+=preparat5+"\n";
            }

            editor.putString(getString(R.string.oprSelect9),msgToAddCelendar);
            break;
        }
        editor.apply();
    }

    private void whatRaschetCreated() {
        whatRaschCreated=0;
        for (int i = 0;i<=9;i++)
        {
            if(spinnerMain.getSelectedItemPosition()==i)
            {
                whatRaschCreated=i+1;
            }
        }

    }



    private void raschetBakSmesy() {
        allertShow= false;
        allarms=false;
        count = Integer.parseInt(vedro.getText().toString());
        allarms();
        preparat1="";preparat2="";preparat3="";preparat4="";preparat5="";
        if (allarms != true) {
            raschetMildiu();
            raschetOidium();
            raschetUdobrenija();
            raschetInsekticid();
            raschetZavyaz();
            msgToIformAlert();

            builder1.setTitle(R.string.allarmTitle)
                    .setCancelable(false)
                    .setPositiveButton(R.string.positiveButton,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    if (allarms != true) {
                                        alredyAddedSpraying();

                                    }
                                    dialog.cancel();
                                }
                            })
                    .setNegativeButton(R.string.cancelButton,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();

                                }
                            });
            builder1.setMessage(msgToInform);
            AlertDialog alert = builder1.create();
            alert.show();
        }

    }

    private void alredyAddedSpraying() {
        switch (whatRaschCreated){
            case(1):
            if (mSettings.contains(getString(R.string.oprSelect1))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(2):
            if (mSettings.contains(getString(R.string.oprSelect2))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(3):
            if (mSettings.contains(getString(R.string.oprSelect3))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(4):
            if (mSettings.contains(getString(R.string.oprSelect4))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(5):
            if (mSettings.contains(getString(R.string.oprSelect5))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(6):
            if (mSettings.contains(getString(R.string.oprSelect6))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(7):
            if (mSettings.contains(getString(R.string.oprSelect7))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(8):
            if (mSettings.contains(getString(R.string.oprSelect8))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
            case(9):
            if (mSettings.contains(getString(R.string.oprSelect9))== true) {
                alertChangeSpraing();
            }
            else{
                showAlertCount();
                toSPRaschetnoe();
                saveToCelendar();
            }
                break;
        }
    }

    private void alertChangeSpraing() {
        builder1.setTitle(R.string.allarmTitle)
                .setCancelable(false)
                .setPositiveButton(R.string.positiveChengeSpreyingButton,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                showAlertCount();
                                toSPRaschetnoe();
                                saveToCelendar();
                                dialog.cancel();
                            }
                        })
                .setNegativeButton(R.string.cancelChengeSpreyingButton,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();

                            }
                        });
        builder1.setMessage(R.string.msgChangeSpreying);
        AlertDialog alert = builder1.create();
        alert.show();
    }

    private void msgToIformAlert() {
        msgToInform=getString(R.string.msgToInform);
        if (preparat1.equals("")!=true)
        {
            msgToInform+=preparat1+" - ";
            if (countSumm1>0) {
                msgToInform += String.valueOf(countSumm1) + getString(R.string.gramm) +"\n";
            }
            if (countSumm2>0) {
                msgToInform += String.valueOf(countSumm2) + getString(R.string.gramm)+"\n";
            }
            if (countSumm3>0) {
                msgToInform += String.valueOf(countSumm3) + getString(R.string.gramm)+"\n";
            }
            if (countSumm4>0) {
                msgToInform += String.valueOf(countSumm4) + getString(R.string.gramm)+"\n";
            }
            if (countSumm5>0) {
                msgToInform += String.valueOf(countSumm5) + getString(R.string.milliliters)+"\n";
            }
            if (countSumm6>0) {
                msgToInform += String.valueOf(countSumm6) + getString(R.string.milliliters)+"\n";
            }
        }
        if (preparat2.equals("")!=true)
        {
            msgToInform+=preparat2+" - ";
            if (countSumm7>0) {
                msgToInform += String.valueOf(countSumm7) + getString(R.string.gramm)+"\n";
            }
            if (countSumm8>0) {
                msgToInform += String.valueOf(countSumm8) + getString(R.string.gramm)+"\n";
            }
            if (countSumm9>0) {
                msgToInform += String.valueOf(countSumm9) + getString(R.string.milliliters)+"\n";
            }
            if (countSumm10>0) {
                msgToInform += String.valueOf(countSumm10) + getString(R.string.milliliters)+"\n";
            }
        }
        if (preparat3.equals("")!=true)
        {
            msgToInform+=preparat3+" - ";
            if (countSumm11>0) {
                msgToInform += String.valueOf(countSumm11) + getString(R.string.gramm)+"\n";
            }
            if (countSumm12>0) {
                msgToInform += String.valueOf(countSumm12) + getString(R.string.gramm)+"\n";
            }
            if (countSumm13>0) {
                msgToInform += String.valueOf(countSumm13) + getString(R.string.gramm)+"\n";
            }
        }
        if (preparat4.equals("")!=true) {
            msgToInform += preparat4 + " - ";
            if (countSumm14 > 0) {
                msgToInform += String.valueOf(countSumm14) + getString(R.string.gramm) + "\n";
            }
            if (countSumm15 > 0) {
                msgToInform += String.valueOf(countSumm15) + getString(R.string.gramm) + "\n";
            }
            if (countSumm16 > 0) {
                msgToInform += String.valueOf(countSumm16) + getString(R.string.gramm) + "\n";
            }
        }
        if (preparat5.equals("") != true) {
            msgToInform += preparat5 + " - ";
            if (countSumm17 > 0) {
                msgToInform += String.valueOf(countSumm17) + getString(R.string.gramm)+"\n";
            }
            if (countSumm18 > 0) {
                msgToInform += String.valueOf(countSumm18) + getString(R.string.milliliters)+"\n";
            }
        }
    }


    private void toSPRaschetnoe()
    {
        final SharedPreferences.Editor editor = mSettings.edit();
        if (needBuy1 > 0) {
            editor.putInt(getString(R.string.horusRasch), needBuy1);
        }
        if (needBuy2 > 0) {
            editor.putInt(getString(R.string.ridomilRasch), needBuy2);
        }
        if (needBuy3 > 0) {
            editor.putInt(getString(R.string.melodiduoRasch), needBuy3);
        }
        if (needBuy4 > 0) {
            editor.putInt(getString(R.string.strobiRasch), needBuy4);
        }
        if (needBuy5 > 0) {
            editor.putInt(getString(R.string.kvadrisRasch), needBuy5);
        }
        if (needBuy6 > 0) {
            editor.putInt(getString(R.string.kuproksatRasch), needBuy6);
        }
        if (needBuy7 > 0) {
            editor.putInt(getString(R.string.topazRasch), needBuy7);
        }
        if (needBuy8 > 0) {
            editor.putInt(getString(R.string.topsinRasch), needBuy8);
        }
        if (needBuy9 > 0) {
            editor.putInt(getString(R.string.falkonRasch), needBuy9);
        }
        if (needBuy10 > 0) {
            editor.putInt(getString(R.string.tiltRasch), needBuy10);
        }
        if (needBuy11 > 0) {
            editor.putInt(getString(R.string.plantafol30Rasch), needBuy11);
        }
        if (needBuy12 > 0) {
            editor.putInt(getString(R.string.plantafol20Rasch), needBuy12);
        }
        if (needBuy13 > 0) {
            editor.putInt(getString(R.string.plantafol5Rasch), needBuy13);
        }
        if (needBuy14 > 0) {
            editor.putInt(getString(R.string.sanmaytRasch), needBuy14);
        }
        if (needBuy15 > 0) {
            editor.putInt(getString(R.string.decisRasch), needBuy15);
        }
        if (needBuy16 > 0) {
            editor.putInt(getString(R.string.mospilanRasch), needBuy16);
        }
        if (needBuy17 > 0) {
            editor.putInt(getString(R.string.vuskalKombiBrasch), needBuy17);
        }
        if (needBuy18 > 0) {
            editor.putInt(getString(R.string.maksikropZavyazRasch), needBuy18);
        }
        editor.apply();
    }

    private void showAlertCount() {
        String showMessage = "";
        builder.setTitle(R.string.allarmTitle)
                .setCancelable(false)
                .setNegativeButton(R.string.okButton,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        if (needBuy1>0)
        {
            showMessage+= getString(R.string.horus)+" "+String.valueOf(needBuy1)+getString(R.string.gramm)+"\n";
        }
        if (needBuy2>0)
        {
            showMessage+= getString(R.string.ridomil)+" "+String.valueOf(needBuy2)+getString(R.string.gramm)+"\n";
        }
        if (needBuy3>0)
        {
            showMessage+= getString(R.string.melodiduo)+" "+String.valueOf(needBuy3)+getString(R.string.gramm)+"\n";
        }
        if (needBuy4>0)
        {
            showMessage+= getString(R.string.strobi)+" "+String.valueOf(needBuy4)+getString(R.string.gramm)+"\n";
        }
        if (needBuy5>0)
        {
            showMessage+= getString(R.string.kvadris)+" "+String.valueOf(needBuy5)+getString(R.string.milliliters)+"\n";
        }
        if (needBuy6>0)
        {
            showMessage+= getString(R.string.kuproksat)+" "+String.valueOf(needBuy6)+getString(R.string.milliliters)+"\n";
        }
        if (needBuy7>0)
        {
            showMessage+= getString(R.string.topaz)+" "+String.valueOf(needBuy7)+getString(R.string.gramm)+"\n";
        }
        if (needBuy8>0)
        {
            showMessage+= getString(R.string.topsin)+" "+String.valueOf(needBuy8)+getString(R.string.gramm)+"\n";
        }
        if (needBuy9>0)
        {
            showMessage+= getString(R.string.falkon)+" "+String.valueOf(needBuy9)+getString(R.string.milliliters)+"\n";
        }
        if (needBuy10>0)
        {
            showMessage+= getString(R.string.tilt)+" "+String.valueOf(needBuy10)+getString(R.string.milliliters)+"\n";
        }
        if (needBuy11>0)
        {
            showMessage+= getString(R.string.plantafol30)+" "+String.valueOf(needBuy11)+getString(R.string.gramm)+"\n";
        }
        if (needBuy12>0)
        {
            showMessage+= getString(R.string.plantafol20)+" "+String.valueOf(needBuy12)+getString(R.string.gramm)+"\n";
        }
        if (needBuy13>0)
        {
            showMessage+= getString(R.string.plantafol5)+" "+String.valueOf(needBuy13)+getString(R.string.gramm)+"\n";
        }
        if (needBuy14>0)
        {
            showMessage+= getString(R.string.sanmayt)+" "+String.valueOf(needBuy14)+getString(R.string.gramm)+"\n";
        }
        if (needBuy15>0)
        {
            showMessage+= getString(R.string.decis)+" "+String.valueOf(needBuy15)+getString(R.string.gramm)+"\n";
        }
        if (needBuy16>0)
        {
            showMessage+= getString(R.string.mospilan)+" "+String.valueOf(needBuy16)+getString(R.string.gramm)+"\n";
        }
        if (needBuy17>0)
        {
            showMessage+= getString(R.string.vuskalKombiB)+" "+String.valueOf(needBuy17)+getString(R.string.gramm)+"\n";
        }
        if (needBuy18>0)
        {
            showMessage += getString(R.string.maksikropZavyaz)+" "+String.valueOf(needBuy18)+getString(R.string.milliliters)+"\n";
        }
        if(showMessage!="") {
            builder.setMessage(getString(R.string.alertNeedbuy) + showMessage);
            AlertDialog alert = builder.create();
            alert.show();
            allertShow = true;
        }

    }

    private void allarms() {
        String mess = "";
        builder.setTitle(R.string.allarmTitle)
                .setCancelable(false)
                .setNegativeButton(R.string.okButton,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        for (int i=1;i<=4;i++) {
            if (spinner2.getSelectedItemPosition() == i) {
                if (spinner1.getSelectedItemPosition() == 1) {
                    mess+= getString(R.string.horusAlert)+"\n";
                    spinner2.setSelection(0);
                }

            }
        }
        for (int i=1;i<=4;i++) {
            if (spinner2.getSelectedItemPosition() == i) {
                if (spinner1.getSelectedItemPosition() == 4) {
                    mess+= getString(R.string.strobiAlert)+"\n";
                    spinner2.setSelection(0);
                }
            }
        }
        for (int i=1;i<=4;i++) {
            if (spinner2.getSelectedItemPosition() == i) {
                if (spinner1.getSelectedItemPosition() == 5) {
                    mess+= getString(R.string.kvadrisAlert)+"\n";
                    spinner2.setSelection(0);
                }
            }
        }
        if (spinnerMain.getSelectedItemPosition() == 2)
        {
            if (spinner1.getSelectedItemPosition()!=0)
            {
                mess= getString(R.string.poCvetuAlert)+"\n";

                spinner1.setSelection(0);
            }
            if (spinner2.getSelectedItemPosition()!=0)
            {
                mess= getString(R.string.poCvetuAlert)+"\n";
                spinner2.setSelection(0);
            }
            if (spinner3.getSelectedItemPosition()!=0)
            {
                mess= getString(R.string.poCvetuAlert)+"\n";
                spinner3.setSelection(0);
            }
            if (spinner4.getSelectedItemPosition()!=0)
            {
                mess= getString(R.string.poCvetuAlert)+"\n";
                spinner4.setSelection(0);
            }

        }
        switch (spinner1.getSelectedItemPosition()){
            case(2):
            if (spinner2.getSelectedItemPosition() == 0) {

                mess= getString(R.string.oidiumAlert)+"\n";

                spinner2.setSelection(1);
            }
            case(3):
            if (spinner2.getSelectedItemPosition() == 0) {

                mess= getString(R.string.oidiumAlert)+"\n";
                spinner2.setSelection(1);
            }
        }
        if (mess!="") {
            builder.setMessage(mess);
            AlertDialog alert = builder.create();
            alert.show();
            allarms = true;
        }
    }

    private void raschetZavyaz() {

        needBuy17=0;needBuy18=0;
        countSumm17=0; countSumm18=0;

        switch (poss5){
            case(1):
            preparat5=getString(R.string.vuskalKombiB);
            count17 = mSettings.getInt(getString(R.string.vuskalKombiB), 0);
            countSumm17 = 12 * count;

            if (count17 <countSumm17) {
                needBuy17 = 12 * count - count17;
            }
                break;
            case(2):
            preparat5=getString(R.string.maksikropZavyaz);
            count18 = mSettings.getInt(getString(R.string.maksikropZavyaz), 0);
            countSumm18 = 50 * count;

            if (count18 < 50 * count) {
                needBuy18 = 50 * count - count18;
            }
                break;
        }
    }

    private void raschetInsekticid() {

        needBuy14=0;needBuy15=0;needBuy16=0;
        countSumm14=0; countSumm15=0; countSumm16=0;

        switch (poss4){
            case(1):
            preparat4=getString(R.string.sanmayt);
            count14 = mSettings.getInt(getString(R.string.sanmayt), 0);
            countSumm14 = 12 * count;

            if (count14 < 12 * count) {
                needBuy14 = 12 * count - count14;
            }
                break;
            case(2):
            preparat4=getString(R.string.decis);
            count15 = mSettings.getInt(getString(R.string.decis), 0);
            countSumm15 = 50 * count;
            if (count15 < 50 * count) {
                needBuy15 = 50 * count - count15;
            }
                break;
            case(3):
            preparat4=getString(R.string.mospilan);
            count16 = mSettings.getInt(getString(R.string.mospilan), 0);
            countSumm16 = 50 * count;
            if (count16 < 50 * count) {
                needBuy16 = 50 * count - count16;
            }
                break;
        }
    }


    private void raschetUdobrenija() {

        needBuy11=0;needBuy12=0;needBuy13=0;
        countSumm11=0; countSumm12=0; countSumm13=0;

        switch (poss3){
            case(1):
            preparat3=getString(R.string.plantafol30);
            count11 = mSettings.getInt(getString(R.string.plantafol30), 0);
            countSumm11 = 12 * count;

            if (count11 < 12 * count) {
                needBuy11 = 12 * count - count11;
            }
                break;
            case(2):
            preparat3=getString(R.string.plantafol20);
            count12 = mSettings.getInt(getString(R.string.plantafol20), 0);
            countSumm12 = 50 * count;

            if (count12 < 50 * count) {
                needBuy12 = 50 * count - count12;
            }
                break;
            case(3):
            preparat3=getString(R.string.plantafol5);
            count13 = mSettings.getInt(getString(R.string.plantafol5), 0);
            countSumm13 = 50 * count;

            if (count13 < 50 * count) {
                needBuy13 = 50 * count - count13;
            }
                break;
        }
    }


    private void raschetOidium() {

        needBuy7=0;needBuy8=0;needBuy9=0;needBuy10=0;
        countSumm7=0; countSumm8=0; countSumm9=0; countSumm10=0;

        switch (poss2){
            case(1):
            preparat2=getString(R.string.topaz);
            count7 = mSettings.getInt(getString(R.string.topaz), 0);
            countSumm7 = 12 * count;
            if (count7 < 12 * count) {
                needBuy7 = 12 * count - count7;
            }
                break;
        case(2):
            preparat2=getString(R.string.topsin);
            count8 = mSettings.getInt(getString(R.string.topsin), 0);
            countSumm8 = 50 * count;
            if (count8 < 50 * count) {
                needBuy8 = 50 * count - count8;
            }
            break;
            case(3):
            preparat2=getString(R.string.falkon);
            count9 = mSettings.getInt(getString(R.string.falkon), 0);
            countSumm9 = 50 * count;
            if (count9 < 50 * count) {
                needBuy9 = 50 * count - count9;
            }
                break;
            case(4):
            preparat2=getString(R.string.tilt);
            count10 = mSettings.getInt(getString(R.string.tilt), 0);
            countSumm10 = 3 * count;
            if (count10 < 3 * count) {
                needBuy10 = 3 * count - count10;
            }
                break;
        }
    }


    private void raschetMildiu() {

        needBuy1 = 0; needBuy2 = 0; needBuy3 = 0; needBuy4 = 0; needBuy5 = 0; needBuy6 = 0;
        countSumm1=0; countSumm2=0; countSumm3=0; countSumm4=0; countSumm5=0; countSumm6=0;

        switch (poss1){

            case(1):
            preparat1 = getString(R.string.horus);
            count1 = mSettings.getInt(getString(R.string.horus), 0);
            countSumm1 = 12 * count;
            if (count1 < countSumm1) {
                needBuy1 = countSumm1 - count1;
            }
             break;
            case(2):
            preparat1 = getString(R.string.ridomil);
            count2 = mSettings.getInt(getString(R.string.ridomil), 0);
            countSumm2 = 50 * count;

            if (count2 < countSumm2) {
                needBuy2 = countSumm2 - count2;
            }
                break;
            case(3):
            preparat1 = getString(R.string.melodiduo);
            count3 = mSettings.getInt(getString(R.string.melodiduo), 0);
            countSumm3 = 50 * count;

            if (count3 < countSumm3) {
                needBuy3 = countSumm3 - count3;
            }
                break;
            case(4):
            preparat1 = getString(R.string.strobi);
            count4 = mSettings.getInt(getString(R.string.strobi), 0);
            countSumm4 = 3 * count;

            if (count4 < countSumm4) {
                needBuy4 = countSumm4 - count4;
            }
                break;
            case(5):
            preparat1 = getString(R.string.kvadris);
            count5 = mSettings.getInt(getString(R.string.kvadris), 0);
            countSumm5 = 6 * count;

            if (count5 < countSumm5) {
                needBuy5 = countSumm5 - count5;
            }
                break;
            case(6):
            preparat1 = getString(R.string.kuproksat);
            count6 = mSettings.getInt(getString(R.string.kuproksat), 0);
            countSumm6 = 100 * count;

            if (count6 < countSumm6) {
                needBuy6 = 100 * count - count6;
            }
                break;
        }
    }

    private void countVedra() {

        if (vedro.getText().toString().isEmpty()) {
            count = 1;
            vedro.setText(String.valueOf(count));
        }


    }
    private void ifSelectedItem5() {
        switch (poss){
            case 0:
                spinner5.setSelection(0);
                break;
            case 1:
                spinner5.setSelection(0);
                break;
            case 2:
                spinner5.setSelection(2);
                break;
            case 3:
                spinner5.setSelection(0);
                break;
            case 4:
                spinner5.setSelection(0);
                break;
            case 5:
                spinner5.setSelection(0);
                break;
            case 6:
                spinner5.setSelection(0);
                break;
            case 7:
                spinner5.setSelection(0);
                break;
            case 8:
                spinner5.setSelection(0);
                break;
        }
    }

    private void ifSelectedItem4() {
        switch (poss){
            case 0:
            spinner4.setSelection(1);
            break;
            case 1:
                spinner4.setSelection(2);
                break;
            case 2:
                spinner4.setSelection(0);
                break;
            case 3:
                spinner4.setSelection(2);
                break;
            case 4:
                spinner4.setSelection(3);
                break;
            case 5:
                spinner4.setSelection(2);
                break;
            case 6:
                spinner4.setSelection(0);
                break;
            case 7:
                spinner4.setSelection(0);
                break;
            case 8:
                spinner4.setSelection(0);
                break;
        }
    }

    private void ifSelectedItem3() {
        switch (poss){
            case 0:
                spinner3.setSelection(1);
                break;
            case 1:
                spinner3.setSelection(0);
                break;
            case 2:
                spinner3.setSelection(0);
                break;
            case 3:
                spinner3.setSelection(2);
                break;
            case 4:
                spinner3.setSelection(1);
                break;
            case 5:
                spinner3.setSelection(2);
                break;
            case 6:
                spinner3.setSelection(2);
                break;
            case 7:
                spinner3.setSelection(3);
                break;
            case 8:
                spinner3.setSelection(0);
                break;
        }
    }

    private void ifSelectedItem2() {
        switch (poss){
            case 0:
            spinner2.setSelection(0);
                break;
            case 1:
                spinner2.setSelection(2);
                break;
            case 2:
                spinner2.setSelection(0);
                break;
            case 33:
                spinner2.setSelection(0);
                break;
            case 4:
                spinner2.setSelection(3);
                break;
            case 5:
                spinner2.setSelection(0);
                break;
            case 6:
                spinner2.setSelection(0);
                break;
            case 7:
                spinner2.setSelection(4);
                break;
            case 8:
                spinner2.setSelection(0);
                break;
        }
    }
    private void ifSelectedItem1() {

        switch (poss){
            case 0:
            spinner1.setSelection(1);
            break;
            case 1:
                spinner1.setSelection(2);
                break;
            case 2:
                spinner1.setSelection(0);
                break;
            case 3:
                spinner1.setSelection(5);
                break;
            case 4:
                spinner1.setSelection(3);
                break;
            case 5:
                spinner1.setSelection(1);
                break;
            case 6:
                spinner1.setSelection(4);
                break;
            case 7:
                spinner1.setSelection(6);
                break;
            case 8:
                spinner1.setSelection(6);
                break;
        }
    }
    public static int getWhatRaschCreated() {
        return whatRaschCreated;
    }

    public static void setWhatRaschCreated(int whatRaschCreated) {
        Calculate.whatRaschCreated = whatRaschCreated;
    }

}
