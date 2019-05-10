package com.example.spl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DanceInstructorMain extends AppCompatActivity {
    private Button createCourse;
    private Button createTraining;
    private Button createNutBut;
    private Button viewStuList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_instructor_main);
        createCourse = findViewById(R.id.danceInsBut1);
        createTraining = findViewById(R.id.danceInsBut2);
        createNutBut = findViewById(R.id.danceInsBut3);
        viewStuList = findViewById(R.id.danceInsBut4);
        
        createCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),CreatePersonalCourse.class);
                startActivity(newPage);
            }
        });
        createTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),CreateTraining.class);
                startActivity(newPage);
            }
        });
        createNutBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),CreateNutPlan.class);
                startActivity(newPage);
            }
        });
        viewStuList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),StudentList.class);
                startActivity(newPage);
            }
        });

    }
}
