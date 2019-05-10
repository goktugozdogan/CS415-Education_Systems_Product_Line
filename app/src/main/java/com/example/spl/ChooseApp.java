package com.example.spl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseApp extends AppCompatActivity {

    private Button a;
    private Button d;
    private Button f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_app);

        a = findViewById(R.id.choose_academy);
        d = findViewById(R.id.choose_dance);
        f = findViewById(R.id.choose_fitness);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Flag globalVariable = (Flag) getApplicationContext();
                globalVariable.setAcademyFlag(true);
                globalVariable.setDanceFlag(false);
                globalVariable.setFitnessFlag(false);

                Intent newPage = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(newPage);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Flag globalVariable = (Flag) getApplicationContext();
                globalVariable.setAcademyFlag(false);
                globalVariable.setDanceFlag(true);
                globalVariable.setFitnessFlag(false);

                Intent newPage = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(newPage);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Flag globalVariable = (Flag) getApplicationContext();
                globalVariable.setAcademyFlag(false);
                globalVariable.setDanceFlag(false);
                globalVariable.setFitnessFlag(true);

                Intent newPage = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(newPage);
            }
        });

    }
}
