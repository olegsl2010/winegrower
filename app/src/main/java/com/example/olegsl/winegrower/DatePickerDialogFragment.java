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

        TextView tv;
            switch (Celendar.whatClick){
                 case(1):
                tv = (TextView) getActivity().findViewById(R.id.tvDate1);
                tv.setText(day + "-" + month + "-" + year);
            break;
                case (2):
                    tv = (TextView) getActivity().findViewById(R.id.tvDate2);
                    tv.setText(day + "-" + month + "-" + year);
            break;
                case (3):
            tv = (TextView) getActivity().findViewById(R.id.tvDate3);
            tv.setText(day + "-" + month + "-" + year);
                    break;
                case(4):
            tv = (TextView) getActivity().findViewById(R.id.tvDate4);
            tv.setText(day + "-" + month + "-" + year);
                    break;
                case(5):
            tv = (TextView) getActivity().findViewById(R.id.tvDate5);
            tv.setText(day + "-" + month + "-" + year);
                    break;
                case (6):
            tv = (TextView) getActivity().findViewById(R.id.tvDate6);
            tv.setText(day + "-" + month + "-" + year);
                    break;
                case(7):
            tv = (TextView) getActivity().findViewById(R.id.tvDate7);
            tv.setText(day + "-" + month + "-" + year);
                    break;
                case(8):
            tv = (TextView) getActivity().findViewById(R.id.tvDate8);
            tv.setText(day + "-" + month + "-" + year);
                    break;
                case(9):
            tv = (TextView) getActivity().findViewById(R.id.tvDate9);
            tv.setText(day + "-" + month + "-" + year);
                    break;
        }
    }
}