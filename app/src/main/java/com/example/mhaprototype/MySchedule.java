package com.example.mhaprototype;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MySchedule extends AppCompatActivity {
    private TextView labelDate, labelappointmentcounter, labelapp1, labelapp2, labelapp3, labelapp4, slot1, slot2, slot3, slot4, slot5;
    private Button buttoneighteenApril, buttonnineteenApril, buttontwentyApril, buttontwentyoneApril;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_schedule);

//        labelDate = (TextView) findViewById(R.id.lblDate);
//        labelappointmentcounter = (TextView) findViewById(R.id.lblappointmentcount);
//        labelapp1 = (TextView) findViewById(R.id.lblappointment1);
//        labelapp2 = (TextView) findViewById(R.id.lblappointment2);
//        labelapp3 = (TextView) findViewById(R.id.lblappointment3);
//        labelapp4 = (TextView) findViewById(R.id.lblappointment4);
//        slot1 = (TextView) findViewById(R.id.lbltime1);
//        slot2 = (TextView) findViewById(R.id.lbltime2);
//        slot3 = (TextView) findViewById(R.id.lbltime3);
//        slot4 = (TextView) findViewById(R.id.lbltime4);
//        slot5 = (TextView) findViewById(R.id.lbltime5);
//        buttoneighteenApril = (Button) findViewById(R.id.eighteenapril);

//        labelDate.setText("");

        //Eighteen April
//        View.OnClickListener clickeighteen = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result = "18 April 2021";
//                labelDate.setText(result);
//                labelappointmentcounter.setText("You have 2 Appointments");
//                labelapp2.setText("Video Consultation with Dr. Blauw");
//                labelapp4.setText("Chat with counsellor");
//                slot1.setText("09:00");
//                slot2.setText("10:00");
//                slot3.setText("12:00");
//                slot4.setText("13:00");
//                slot5.setText("14:00");
//            }
//    };

        //Eighteen April
//        buttoneighteenApril.setOnClickListener(clickeighteen);

    }


}