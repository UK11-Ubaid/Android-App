package com.example.mhaprototype;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.timessquare.CalendarPickerView;

import java.util.Calendar;
import java.util.Date;

public class childRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_register);

        Date today = new Date();
        Calendar nextyear = Calendar.getInstance();
        nextyear.add(Calendar.YEAR, 1);

        CalendarPickerView datepicker = findViewById(R.id.calendar);
        datepicker.init(today, nextyear.getTime()).withHighlightedDate(today);

        datepicker.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(Date date) {
               // String selectedDate = DateFormat.getDateInstance(DateFormat.FULL).format(date) ;
                Calendar calSelected = Calendar.getInstance();
                calSelected.setTime(date);
                String selectedDate = "" + calSelected.get(Calendar.DAY_OF_MONTH) + " " + (calSelected.get(Calendar.MONTH) + 1) + " " + calSelected.get(Calendar.YEAR);
               // Toast.makeText(childRegister.this, selectedDate, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDateUnselected(Date date) {

            }
        });
    }





}