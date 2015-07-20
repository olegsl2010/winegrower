package com.example.olegsl.winegrower;



import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PlaceholderFragment extends Fragment implements View.OnClickListener {
    View rootView;
    Button reaktiv;
    Button sorts;
    Button raschet;
    Button needBuy;
    Button information;
    Button celendar;
    FragmentTransaction FragManager;


    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView =inflater.inflate(R.layout.fragment_main, container, false);

        reaktiv = (Button) rootView.findViewById(R.id.reaktiv);
        sorts = (Button) rootView.findViewById(R.id.sorts);
        raschet = (Button) rootView.findViewById(R.id.back);
        needBuy = (Button) rootView.findViewById(R.id.needbuy);
        information = (Button) rootView.findViewById(R.id.information);
        celendar = (Button) rootView.findViewById(R.id.celendar);

        reaktiv.setOnClickListener(this);
        sorts.setOnClickListener(this);
        raschet.setOnClickListener(this);
        needBuy.setOnClickListener(this);
        information.setOnClickListener(this);
        celendar.setOnClickListener(this);


        return rootView;
    }



    @Override
    public void onClick(View v) {
        FragManager=null;
        int buttonIndex = translateIdToIndex(v.getId());
        switch (buttonIndex){
            case(1):
            FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Reagetns());
            FragManager.commit();
                break;
            case (2):
            FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Sorts());
            FragManager.commit();
                break;
            case(3):
            FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Calculate());
            FragManager.commit();
                break;
            case(4):
            FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new NeedBuy());
            FragManager.commit();
                break;
            case(5):
            FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Information());
            FragManager.commit();
                break;
            case(6):
            FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Celendar());
            FragManager.commit();
                break;
        }
    }

    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.reaktiv:
                index = 1;
                break;
            case R.id.sorts:
                index = 2;
                break;
            case R.id.back:
                index = 3;
                break;
            case R.id.needbuy:
                index = 4;
                break;
            case R.id.information:
                index = 5;
                break;
            case R.id.celendar:
                index = 6;
                break;
        }
        return index;
    }
}

