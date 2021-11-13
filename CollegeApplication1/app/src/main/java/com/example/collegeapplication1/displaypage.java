package com.example.collegeapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class displaypage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_page);
        TextView name = (TextView) findViewById(R.id.displayname);
        TextView roll= (TextView) findViewById(R.id.displayroll);
        TextView section= (TextView) findViewById(R.id.displaysection);
        TextView clgname= (TextView) findViewById(R.id.displayclgname);
        TextView stream= (TextView) findViewById(R.id.displaystream);

        String namestr = getIntent().getStringExtra("Name");
        String rollstr = getIntent().getStringExtra("Roll");
        String sectionstr = getIntent().getStringExtra("Section");
        String clgnamestr = getIntent().getStringExtra("College");
        String streamstr = getIntent().getStringExtra("Stream");

        name.setText(namestr);
        roll.setText(rollstr);
        section.setText(sectionstr);
        clgname.setText(clgnamestr);
        stream.setText(streamstr);

    }
}