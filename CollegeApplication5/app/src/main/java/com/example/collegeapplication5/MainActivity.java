package com.example.collegeapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display_capital= (TextView) findViewById(R.id.displaycapital);
        RadioGroup radiogrp= findViewById(R.id.radio_grp);

        radiogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.con1:display_capital.setText("New Delhi");
                    break;
                    case R.id.con2:display_capital.setText("Canberra");
                        break;
                    case R.id.con3:display_capital.setText("Cape Town");
                        break;
                    case R.id.con4:display_capital.setText("Wellington");
                        break;
                    case R.id.con5:display_capital.setText("London");
                        break;

                }
            }
        });
    }
}