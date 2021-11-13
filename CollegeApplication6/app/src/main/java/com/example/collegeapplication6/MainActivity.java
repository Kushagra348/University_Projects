package com.example.collegeapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText) findViewById(R.id.Num1);
        EditText num2 = (EditText) findViewById(R.id.Num2);
        Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Float.parseFloat(num1.getText().toString()) ==0 || Float.parseFloat(num2.getText().toString()) ==0)
                    Toast.makeText(MainActivity.this,"Wrong Input",Toast.LENGTH_SHORT).show();
                else{
                    float result = Float.parseFloat(num1.getText().toString()) % Float.parseFloat(num2.getText().toString());
                    Toast.makeText(MainActivity.this,"Result : "+result,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}