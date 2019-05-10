package com.example.spl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SportUserMain extends AppCompatActivity {
    private Button viewTeacher;
    private Button macrosBut;
    private Button viewWeightBut;
    private Button stepTrackerBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_user_main);
        viewTeacher = findViewById(R.id.sportTeacherListBut);
        macrosBut = findViewById(R.id.calBut);
        viewWeightBut = findViewById(R.id.sportWieghtBut);
        stepTrackerBut = findViewById(R.id.stepTracker);
        viewTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),TeacherList.class);
                startActivity(newPage);
            }
        });
        viewWeightBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),ViewWeightLift.class);
                startActivity(newPage);
            }
        });
        macrosBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),TakenCaloriePage.class);
                startActivity(newPage);
            }
        });
        stepTrackerBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),SleepTracker.class);
                startActivity(newPage);
            }
        });
    }
}
