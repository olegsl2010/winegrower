package com.example.olegsl.winegrower;



import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class PlaceholderFragment extends Fragment implements View.OnClickListener {
    View rootView;
    Button reaktiv;
    Button sorts;
    Button raschet;
    Button needBuy;
    Button information;
    Button celendar;


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

        int buttonIndex = translateIdToIndex(v.getId());
        if (buttonIndex==1)
        {
            FragmentTransaction FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Reaktiv());
            FragManager.commit();
        }
        else if (buttonIndex==2)
        {
            FragmentTransaction FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Sorts());
            FragManager.commit();
        }
        else if (buttonIndex==3)
        {
            FragmentTransaction FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Raschet());
            FragManager.commit();
        }
        else if (buttonIndex==4)
        {
            FragmentTransaction FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new NeedBuy());
            FragManager.commit();
        }
        else if (buttonIndex==5)
        {
            FragmentTransaction FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Information());
            FragManager.commit();
        }
        else if (buttonIndex==6)
        {
            FragmentTransaction FragManager = getFragmentManager().beginTransaction();
            FragManager.addToBackStack("");
            FragManager.replace(R.id.container, new Celendar());
            FragManager.commit();
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

