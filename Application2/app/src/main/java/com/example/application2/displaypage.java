package com.example.application2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class displaypage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_page);

        TextView num1 = (TextView) findViewById(R.id.Result);

        num1.setText("Result: "+getIntent().getFloatExtra("Result",0) );
    }
}
