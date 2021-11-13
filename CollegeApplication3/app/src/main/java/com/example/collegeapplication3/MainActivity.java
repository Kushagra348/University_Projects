package com.example.collegeapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    String gender = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = (EditText) findViewById(R.id.namefield);
        Button next = (Button) findViewById(R.id.continue_field);
        RadioGroup radiogrp= findViewById(R.id.radio_grp);

        radiogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.male:
                        gender = "Male";
                        break;
                    case R.id.female:
                        gender = "Female";
                        break;
                    case R.id.Transgender:
                        gender = "Transgender";
                        break;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (gender =="")
                    Toast.makeText(MainActivity.this,"Please select a option",Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(MainActivity.this, displaypage.class);

                    intent.putExtra("Username", username.getText().toString());
                    intent.putExtra("Gender", gender);

                    startActivity(intent);
                }   }
        });

    }
}