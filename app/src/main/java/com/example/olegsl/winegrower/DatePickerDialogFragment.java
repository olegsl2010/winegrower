package com.example.olegsl.winegrower;

import java.util.Calendar;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;
import android.widget.Button;
import android.widget.TextView;

public class DatePickerDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

    // определяем текущую дату
    final Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);

    // создаем DatePickerDialog и возвращаем его
    Dialog picker = new DatePickerDialog(getActivity(), this,
            year, month, day);
    picker.setTitle(getResources().getString(R.string.choose_date));

    return picker;
}
    @Override
    public void onStart() {
        super.onStart();
        // добавляем кастомный текст для кнопки
        Button nButton =  ((AlertDialog) getDialog())
                .getButton(DialogInterface.BUTTON_POSITIVE);
        nButton.setText(getResources().getString(R.string.ready));

    }

    @Override
    public void onDateSet(android.widget.DatePicker datePicker, int year,
                          int month, int day) {

            if (Celendar.whatClick==1)
            {
                TextView tv = (TextView) getActivity().findViewById(R.id.tvDate1);
                tv.setText(day + "-" + month + "-" + year);
            }
        if (Celendar.whatClick==2)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate2);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==3)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate3);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==4)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate4);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==5)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate5);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==6)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate6);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==7)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate7);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==8)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate8);
            tv.setText(day + "-" + month + "-" + year);
        }
        if (Celendar.whatClick==9)
        {
            TextView tv = (TextView) getActivity().findViewById(R.id.tvDate9);
            tv.setText(day + "-" + month + "-" + year);
        }
    }
}