package com.example.collegeapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText) findViewById(R.id.NameField);
        EditText roll = (EditText) findViewById(R.id.RollField);
        EditText section = (EditText) findViewById(R.id.SectionField);
        EditText college_name = (EditText) findViewById(R.id.CollegeName);
        EditText stream = (EditText) findViewById(R.id.StreamField);
        Button continue_button = (Button) findViewById(R.id.Continuebutton);

        continue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myname = name.getText().toString();
                String myroll = roll.getText().toString();
                String mysection = section.getText().toString();
                String mycollege = college_name.getText().toString();
                String mystream = stream.getText().toString();

                Intent intent = new Intent(MainActivity.this,displaypage.class);
                intent.putExtra("Name",myname);
                intent.putExtra("Roll",myroll);
                intent.putExtra("Section",mysection);
                intent.putExtra("College",mycollege);
                intent.putExtra("Stream",mystream);

                startActivity(intent);
            }
        });


    }
}