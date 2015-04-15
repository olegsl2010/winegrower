package com.example.olegsl.winegrower;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class Raschet extends Fragment{
    Button backbutt;
    Button button;
    EditText vedro;
    static Boolean allertShow= false;
    Boolean allarms=false;
    static int whatRaschCreated;
    int count,count1, count2, count3, count4, count5, count6, count7, count8, count9, count10, count11, count12, count13, count14, count15, count16, count17, count18;
    int countSumm1, countSumm2, countSumm3, countSumm4, countSumm5, countSumm6, countSumm7, countSumm8, countSumm9, countSumm10, countSumm11, countSumm12, countSumm13, countSumm14, countSumm15, countSumm16, countSumm17, countSumm18;
    int poss;
    int poss1, poss2, poss3, poss4, poss5;
    int needBuy1, needBuy2, needBuy3, needBuy4, needBuy5, needBuy6, needBuy7, needBuy8, needBuy9, needBuy10, needBuy11, needBuy12, needBuy13, needBuy14, needBuy15, needBuy16, needBuy17, needBuy18;
    String preparat1, preparat2,preparat3,preparat4,preparat5;
    Spinner spinnerMain;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    AlertDialog.Builder builder;
    public static final String APP_PREFERENCES = "winegrower";

    //    TextView tvInfo;
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.raschet, container, false);

        builder = new AlertDialog.Builder(rootView.getContext());
        mSettings = getActivity().getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);


        vedro = (EditText) rootView.findViewById(R.id.editText);
        vedra();

        backbutt = (Button) rootView.findViewById(R.id.backButton2);
        backbutt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActivity().onBackPressed();

            }
        });
        button = (Button) rootView.findViewById(R.id.buttonRasch);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                poss = spinnerMain.getSelectedItemPosition();
                poss1=spinner1.getSelectedItemPosition();
                poss2=spinner2.getSelectedItemPosition();
                poss3=spinner3.getSelectedItemPosition();
                poss4=spinner4.getSelectedItemPosition();
                poss5=spinner5.getSelectedItemPosition();
//                poss6=spinner6.getSelectedItemPosition();
//ifwrongSelected();
                raschetBakSmesy();
                whatRaschetCreated();

            }
        });

        spinnerMain = (Spinner) rootView.findViewById(R.id.spinnerChSpraying);
        spinner1 = (Spinner) rootView.findViewById(R.id.spinnerPrep1);
        spinner2 = (Spinner) rootView.findViewById(R.id.spinnerPrep2);
        spinner3 = (Spinner) rootView.findViewById(R.id.spinnerPrep3);
        spinner4 = (Spinner) rootView.findViewById(R.id.spinnerPrep4);
        spinner5 = (Spinner) rootView.findViewById(R.id.spinnerPrep5);
//        spinner6 = (Spinner) rootView.findViewById(R.id.spinnerPrep6);

        spinnerMain.setSelection(2);

        spinnerMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {
                poss = spinnerMain.getSelectedItemPosition();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.MAGENTA);
                ((TextView) parent.getChildAt(0)).setTextSize(20);
                ifSelectedItem1();
                ifSelectedItem2();
                ifSelectedItem3();
                ifSelectedItem4();
                ifSelectedItem5();
//                ifSelectedItem6(); считаю пока без смысла использовать
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });



        return rootView;
    }

    private void whatRaschetCreated() {
        for (int i = 0;i<=8;i++)
        {
            if(spinnerMain.getSelectedItemPosition()==i)
            {
                whatRaschCreated=i;
            }
        }
    }

//    private void ifwrongSelected() {
//        if (poss==0)
//        {
//            if (poss1==0)
//            {
//
//            }
//        }
//    }

    private void raschetBakSmesy() {
        allertShow= false;
        allarms=false;
        count = Integer.parseInt(vedro.getText().toString());
        allarms();
        preparat1="";preparat2="";preparat3="";preparat4="";preparat5="";
        raschetMildiu();
        raschetOidium();
        raschetUdobrenija();
        raschetInsekticid();
        raschetZavyaz();
        if (allarms!=true) {
            showAlertCount();
        }

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
        int possFor;
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

            possFor=i;

            if (spinner2.getSelectedItemPosition() == possFor) {
                if (spinner1.getSelectedItemPosition() == 1) {
                    mess+= getString(R.string.horusAlert)+"\n";
                    spinner2.setSelection(0);
                }

            }
        }
        for (int i=1;i<=4;i++) {

            possFor=i;

            if (spinner2.getSelectedItemPosition() == possFor) {
                if (spinner1.getSelectedItemPosition() == 4) {
                    mess+= getString(R.string.strobiAlert)+"\n";

                    spinner2.setSelection(0);
                }

            }
        }
        for (int i=1;i<=4;i++) {

            possFor=i;

            if (spinner2.getSelectedItemPosition() == possFor) {
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
        if (spinner1.getSelectedItemPosition()==2)
        {
            if (spinner2.getSelectedItemPosition() == 0) {

                mess= getString(R.string.oidiumAlert)+"\n";

                spinner2.setSelection(1);
            }
        }
        if (spinner1.getSelectedItemPosition()==3)
        {
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
        if (allarms != true) {
            needBuy17=0;needBuy18=0;
            final SharedPreferences.Editor editor = mSettings.edit();

            if (poss5 == 1) {
                preparat5=getString(R.string.vuskalKombiB);
                count17 = mSettings.getInt(getString(R.string.vuskalKombiB), 0);

                if (count17 >= 12 * count) {
                    countSumm17 = 12 * count;
                    editor.putInt(getString(R.string.vuskalKombiBrasch), countSumm17);

                } else {
                    needBuy17 = 12 * count - count17;

                }
            }
            if (poss5 == 2) {
                preparat5=getString(R.string.maksikropZavyaz);
                count18 = mSettings.getInt(getString(R.string.maksikropZavyaz), 0);

                if (count18 >= 50 * count) {
                    countSumm18 = 50 * count;
                    editor.putInt(getString(R.string.maksikropZavyazRasch), countSumm18);

                } else {
                    needBuy18 = 50 * count - count18;

                }
            }

            editor.apply();

        }
    }

    private void raschetInsekticid() {
        if (allarms != true) {
            needBuy14=0;needBuy15=0;needBuy16=0;
            final SharedPreferences.Editor editor = mSettings.edit();

            if (poss4 == 1) {
                count14 = mSettings.getInt(getString(R.string.sanmayt), 0);

                if (count14 >= 12 * count) {
                    countSumm14 = 12 * count;
                    editor.putInt(getString(R.string.sanmaytRasch), countSumm14);

                } else {
                    needBuy14 = 12 * count - count14;

                }
            }
            if (poss4 == 2) {
                count15 = mSettings.getInt(getString(R.string.decis), 0);

                if (count15 >= 50 * count) {
                    countSumm15 = 50 * count;
                    editor.putInt(getString(R.string.decisRasch), countSumm15);

                } else {
                    needBuy15 = 50 * count - count15;

                }
            }
            if (poss4 == 3) {
                count16 = mSettings.getInt(getString(R.string.mospilan), 0);

                if (count16 >= 50 * count) {
                    countSumm16 = 50 * count;
                    editor.putInt(getString(R.string.mospilanRasch), countSumm16);

                } else {
                    needBuy16 = 50 * count - count16;

                }
            }

            editor.apply();
        }
    }

    private void raschetUdobrenija() {
        if (allarms != true) {
            needBuy11=0;needBuy12=0;needBuy13=0;
            final SharedPreferences.Editor editor = mSettings.edit();

            if (poss3 == 1) {
                count11 = mSettings.getInt(getString(R.string.plantafol30), 0);

                if (count11 >= 12 * count) {
                    countSumm11 = 12 * count;
                    editor.putInt(getString(R.string.plantafol30Rasch), countSumm11);

                } else {
                    needBuy11 = 12 * count - count11;

                }
            }
            if (poss3 == 2) {
                count12 = mSettings.getInt(getString(R.string.plantafol20), 0);

                if (count12 >= 50 * count) {
                    countSumm12 = 50 * count;
                    editor.putInt(getString(R.string.plantafol20Rasch), countSumm12);

                } else {
                    needBuy12 = 50 * count - count12;

                }
            }
            if (poss3 == 3) {
                count13 = mSettings.getInt(getString(R.string.plantafol5), 0);

                if (count13 >= 50 * count) {
                    countSumm13 = 50 * count;
                    editor.putInt(getString(R.string.plantafol5Rasch), countSumm13);

                } else {
                    needBuy13 = 50 * count - count13;

                }
            }

            editor.apply();
        }
    }

    private void raschetOidium() {
        if (allarms != true) {
            needBuy7=0;needBuy8=0;needBuy9=0;needBuy10=0;
            final SharedPreferences.Editor editor = mSettings.edit();

            if (poss2 == 1) {
                count7 = mSettings.getInt(getString(R.string.topaz), 0);

                if (count7 >= 12 * count) {
                    countSumm7 = 12 * count;
                    editor.putInt(getString(R.string.topazRasch), countSumm7);

                } else {
                    needBuy7 = 12 * count - count7;

                }
            }
            if (poss2 == 2) {
                count8 = mSettings.getInt(getString(R.string.topsin), 0);

                if (count8 >= 50 * count) {
                    countSumm8 = 50 * count;
                    editor.putInt(getString(R.string.topsinRasch), countSumm8);

                } else {
                    needBuy8 = 50 * count - count8;

                }
            }
            if (poss2 == 3) {
                count9 = mSettings.getInt(getString(R.string.falkon), 0);

                if (count9 >= 50 * count) {
                    countSumm9 = 50 * count;
                    editor.putInt(getString(R.string.falkonRasch), countSumm9);

                } else {
                    needBuy9 = 50 * count - count9;

                }
            }
            if (poss2 == 4) {
                count10 = mSettings.getInt(getString(R.string.tilt), 0);

                if (count10 >= 3 * count) {
                    countSumm10 = 3 * count;
                    editor.putInt(getString(R.string.tiltRasch), countSumm10);

                } else {
                    needBuy10 = 3 * count - count10;

                }
            }
            editor.apply();
        }
    }

    private void raschetMildiu() {
        if (allarms != true) {
            needBuy1=0;needBuy2=0;needBuy3=0;needBuy4=0;needBuy5=0;needBuy6=0;
            final SharedPreferences.Editor editor = mSettings.edit();

            if (poss1 == 1) {
                count1 = mSettings.getInt(getString(R.string.horus), 0);


                if (count1 >= 12 * count) {
                    countSumm1 = 12 * count;
                    editor.putInt(getString(R.string.horusRasch), countSumm1);

                } else {
                    needBuy1 = 12 * count - count1;

                }
            }
            if (poss1 == 2) {
                count2 = mSettings.getInt(getString(R.string.ridomil), 0);

                if (count2 >= 50 * count) {
                    countSumm2 = 50 * count;
                    editor.putInt(getString(R.string.ridomilRasch), countSumm2);

                } else {
                    needBuy2 = 50 * count - count2;

                }
            }
            if (poss1 == 3) {
                count3 = mSettings.getInt(getString(R.string.melodiduo), 0);

                if (count3 >= 50 * count) {
                    countSumm3 = 50 * count;
                    editor.putInt(getString(R.string.melodiduoRasch), countSumm3);

                } else {
                    needBuy3 = 50 * count - count3;

                }
            }
            if (poss1 == 4) {
                count4 = mSettings.getInt(getString(R.string.strobi), 0);

                if (count4 >= 3 * count) {
                    countSumm4 = 3 * count;
                    editor.putInt(getString(R.string.strobiRasch), countSumm4);

                } else {
                    needBuy4 = 3 * count - count4;

                }
            }
            if (poss1 == 5) {
                count5 = mSettings.getInt(getString(R.string.kvadris), 0);

                if (count5 >= 6 * count) {
                    countSumm5 = 6 * count;
                    editor.putInt(getString(R.string.kvadrisRasch), countSumm5);

                } else {
                    needBuy5 = 6 * count - count5;

                }
            }
            if (poss1 == 6) {
                count6 = mSettings.getInt(getString(R.string.kuproksat), 0);

                if (count6 >= 100 * count) {
                    countSumm6 = 100 * count;
                    editor.putInt(getString(R.string.kuproksatRasch), countSumm6);

                } else {
                    needBuy6 = 100 * count - count6;

                }
            }
            editor.apply();
        }
    }


    private void vedra() {

        if (vedro.getText().toString().equals("")) {
            count = 1;
            vedro.setText(String.valueOf(count));
        }


    }



    private void ifSelectedItem5() {
        if (poss==0)
        {
            spinner5.setSelection(0);
        }
        if (poss==1)
        {
            spinner5.setSelection(1);
        }
        if (poss==2)
        {
            spinner5.setSelection(2);
        }
        if (poss==3)
        {
            spinner5.setSelection(0);
        }
        if (poss==4)
        {
            spinner5.setSelection(0);
        }
        if (poss==5)
        {
            spinner5.setSelection(0);
        }
        if (poss==6)
        {
            spinner5.setSelection(0);
        }
        if (poss==7)
        {
            spinner5.setSelection(0);
        }
        if (poss==8)
        {
            spinner5.setSelection(0);
        }

    }

    private void ifSelectedItem4() {
        if (poss==0)
        {
            spinner4.setSelection(1);
        }
        if (poss==1)
        {
            spinner4.setSelection(2);
        }
        if (poss==2)
        {
            spinner4.setSelection(0);
        }
        if (poss==3)
        {
            spinner4.setSelection(2);
        }
        if (poss==4)
        {
            spinner4.setSelection(3);
        }
        if (poss==5)
        {
            spinner4.setSelection(2);
        }
        if (poss==6)
        {
            spinner4.setSelection(0);
        }
        if (poss==7)
        {
            spinner4.setSelection(0);
        }
        if (poss==8)
        {
            spinner4.setSelection(0);
        }

    }

    private void ifSelectedItem3() {
        if (poss==0)
        {
            spinner3.setSelection(1);
        }
        if (poss==1)
        {
            spinner3.setSelection(0);
        }
        if (poss==2)
        {
            spinner3.setSelection(0);
        }
        if (poss==3)
        {
            spinner3.setSelection(2);
        }
        if (poss==4)
        {
            spinner3.setSelection(1);
        }
        if (poss==5)
        {
            spinner3.setSelection(2);
        }
        if (poss==6)
        {
            spinner3.setSelection(2);
        }
        if (poss==7)
        {
            spinner3.setSelection(3);
        }
        if (poss==8)
        {
            spinner3.setSelection(0);
        }

    }

    private void ifSelectedItem2() {
        if (poss==0)
        {
            spinner2.setSelection(0);
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
            spinner2.setSelection(0);
        }
        if (poss==4)
        {
            spinner2.setSelection(3);
        }
        if (poss==5)
        {
            spinner2.setSelection(0);
        }
        if (poss==6)
        {
            spinner2.setSelection(0);
        }
        if (poss==7)
        {
            spinner2.setSelection(4);
        }
        if (poss==8)
        {
            spinner2.setSelection(0);
        }

    }

    private void ifSelectedItem1() {
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
            spinner1.setSelection(5);
        }
        if (poss==4)
        {
            spinner1.setSelection(3);
        }
        if (poss==5)
        {
            spinner1.setSelection(1);
        }
        if (poss==6)
        {
            spinner1.setSelection(4);
        }
        if (poss==7)
        {
            spinner1.setSelection(6);
        }
        if (poss==8)
        {
            spinner1.setSelection(6);
        }

    }

    public static int getWhatRaschCreated() {
        return whatRaschCreated;
    }

    public static void setWhatRaschCreated(int whatRaschCreated) {
        Raschet.whatRaschCreated = whatRaschCreated;
    }

}
