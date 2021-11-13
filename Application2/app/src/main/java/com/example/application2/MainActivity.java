package com.example.application2;

import android.content.Intent;
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
                float numone = Float.parseFloat(num1.getText().toString());
                float numtwo = Float.parseFloat(num2.getText().toString());

                if (numone == 0 || numtwo==0)
                    Toast.makeText(MainActivity.this,"Input Can't be 0",Toast.LENGTH_SHORT).show();
                else{
                    float result = (float) numone/numtwo;
                Intent intent = new Intent(MainActivity.this,displaypage.class);
                intent.putExtra("Result", result);
                startActivity(intent);

            }}
        });
    }
}