package com.example.collegeapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView displayfood= (ListView) findViewById(R.id.displayfood);
        CheckBox checkBox1 = findViewById(R.id.food1);
        CheckBox checkBox2 = findViewById(R.id.food2);
        CheckBox checkBox3 = findViewById(R.id.food3);
        CheckBox checkBox4 = findViewById(R.id.food4);
        Button proceed = (Button) findViewById(R.id.button);

        ArrayList<String> arrayList = new ArrayList<>();
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked())
                    arrayList.add("Pizza");
                else
                    arrayList.remove("Pizza");
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox2.isChecked())
                    arrayList.add("Momo");
                else
                    arrayList.remove("Momo");
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox3.isChecked())
                    arrayList.add("Tacos");
                else
                    arrayList.remove("Tacos");
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox4.isChecked())
                    arrayList.add("Pepsi");
                else
                    arrayList.remove("Pepsi");
            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrayList.isEmpty())
                    Toast.makeText(MainActivity.this,"Please select a preference",Toast.LENGTH_SHORT).show();
                else {
                    arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
                    displayfood.setAdapter(arrayAdapter);
                }

            }
        });





    }
}