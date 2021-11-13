package com.example.collegeapplication3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class displaypage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_page);

        TextView output = (TextView)findViewById(R.id.Username);

        output.setText(getIntent().getStringExtra("Username")+ "\nGender: "+getIntent().getStringExtra("Gender"));
    }
}
