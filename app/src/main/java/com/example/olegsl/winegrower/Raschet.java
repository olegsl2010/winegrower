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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.util.Map;

import static android.R.*;

/**
 * Created by olegs_000 on 02.04.2015.
 */
public class Raschet extends Fragment{
    Button backbutt;
    Button button;
    EditText vedro;
    int count,count1, count2, count3, count4, count5, count6, count7, count8, count9, count10, count11, count12, count13, count14, count15, count16, count17, count18;
    int horusCount;
    int countSumm1, countSumm2, countSumm3, countSumm4, countSumm5, countSumm6, countSumm7, countSumm8, countSumm9, countSumm10, countSumm11, countSumm12, countSumm13, countSumm14, countSumm15, countSumm16, countSumm17, countSumm18;
    int poss;
    int poss1, poss2, poss3, poss4, poss5, poss6;
    int needBuy1, needBuy2, needBuy3, needBuy4, needBuy5, needBuy6, needBuy7, needBuy8, needBuy9, needBuy10, needBuy11, needBuy12, needBuy13, needBuy14, needBuy15, needBuy16, needBuy17, needBuy18;

    Spinner spinnerMain;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;

    public static final String APP_PREFERENCES = "winegrower";

    //    TextView tvInfo;
    SharedPreferences mSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.raschet, container, false);


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
                poss1=spinner1.getSelectedItemPosition();
                poss2=spinner2.getSelectedItemPosition();
                poss3=spinner3.getSelectedItemPosition();
                poss4=spinner4.getSelectedItemPosition();
                poss5=spinner5.getSelectedItemPosition();
                poss6=spinner6.getSelectedItemPosition();
                System.out.println("tttt"+String.valueOf(poss1)+String.valueOf(poss2)+String.valueOf(poss3)+String.valueOf(poss4)+String.valueOf(poss5)+String.valueOf(poss6));

                raschetBakSmesy();
            }
        });

        spinnerMain = (Spinner) rootView.findViewById(R.id.spinnerChSpraying);
        spinner1 = (Spinner) rootView.findViewById(R.id.spinnerPrep1);
        spinner2 = (Spinner) rootView.findViewById(R.id.spinnerPrep2);
        spinner3 = (Spinner) rootView.findViewById(R.id.spinnerPrep3);
        spinner4 = (Spinner) rootView.findViewById(R.id.spinnerPrep4);
        spinner5 = (Spinner) rootView.findViewById(R.id.spinnerPrep5);
        spinner6 = (Spinner) rootView.findViewById(R.id.spinnerPrep6);

        spinnerMain.setSelection(2);


        spinnerMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {

//                String strChoose = spinnerMain.getSelectedItem().toString();
//                poss = spinnerMain.getSelectedItemPosition();
//                System.out.println(strChoose+ poss);
//                tvInfo.setText(strChoose+poss);
                ((TextView) parent.getChildAt(0)).setTextColor(Color.MAGENTA);
                ((TextView) parent.getChildAt(0)).setTextSize(20);
                ifSelectedItem1();
                ifSelectedItem2();
                ifSelectedItem3();
                ifSelectedItem4();
                ifSelectedItem5();
                ifSelectedItem6();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });



        return rootView;
    }

    private void raschetBakSmesy() {

        count = Integer.parseInt(vedro.getText().toString());
        raschetMildiu();

    }

    private void raschetMildiu() {
        final SharedPreferences.Editor editor = mSettings.edit();
        if (poss1==0)
        {
            // Диалог в этом опрыскивании обязательно нужен препарат от Милдью
        }
        if (poss1==1)
        {
            count1= mSettings.getInt(String.valueOf(R.string.horus), 0);

            if (count1>=12*count)
            {
                countSumm1 = 12*count;
                editor.putInt(String.valueOf(R.string.horusRasch), countSumm1);

            }
            else
            {
                needBuy1= 12*count-countSumm1;
            }
        }
        if (poss1==2)
        {
            count2= mSettings.getInt(String.valueOf(R.string.ridomil), 0);

            if (count2>=50*count)
            {
                countSumm2 = 50*count;
                editor.putInt(String.valueOf(R.string.ridomilRasch), countSumm2);

            }
            else
            {
                needBuy2= 50*count-countSumm2;
            }
        }
        if (poss1==3)
        {
            count3= mSettings.getInt(String.valueOf(R.string.melodiduo), 0);

            if (count3>=50*count)
            {
                countSumm3 = 50*count;
                editor.putInt(String.valueOf(R.string.melodiduoRasch), countSumm3);

            }
            else
            {
                needBuy3= 50*count-countSumm3;
            }
        }
        if (poss1==4)
        {
            count4= mSettings.getInt(String.valueOf(R.string.strobi), 0);

            if (count4>=3*count)
            {
                countSumm4 = 3*count;
                editor.putInt(String.valueOf(R.string.strobiRasch), countSumm4);

            }
            else
            {
                needBuy4= 3*count-countSumm4;
            }
        }
        if (poss1==5)
        {
            count5= mSettings.getInt(String.valueOf(R.string.kvadris), 0);

            if (count5>=6*count)
            {
                countSumm5 = 6*count;
                editor.putInt(String.valueOf(R.string.kvadrisRasch), countSumm5);

            }
            else
            {
                needBuy5= 6*count-countSumm5;
            }
        }
        if (poss1==6)
        {
            count6= mSettings.getInt(String.valueOf(R.string.kuproksat), 0);

            if (count6>=100*count)
            {
                countSumm6 = 100*count;
                editor.putInt(String.valueOf(R.string.kuproksatRasch), countSumm6);

            }
            else
            {
                needBuy6= 100*count-countSumm6;
            }
        }

        editor.apply();

    }

    private void vedra() {

        if (vedro.getText().toString().equals("")) {
            count = 1;
            vedro.setText(String.valueOf(count));
        }


    }

    private void ifSelectedItem6() {
        if (poss==0)
        {
            spinner6.setSelection(0);
        }
        if (poss==1)
        {
            spinner6.setSelection(0);
        }
        if (poss==2)
        {
            spinner6.setSelection(7);
        }
        if (poss==3)
        {
            spinner6.setSelection(0);
        }
        if (poss==4)
        {
            spinner6.setSelection(0);
        }
        if (poss==5)
        {
            spinner6.setSelection(0);
        }
        if (poss==6)
        {
            spinner6.setSelection(0);
        }
        if (poss==7)
        {
            spinner6.setSelection(0);
        }
        if (poss==8)
        {
            spinner6.setSelection(0);
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
            spinner1.setSelection(7);
        }
        if (poss==8)
        {
            spinner1.setSelection(7);
        }

    }

}
