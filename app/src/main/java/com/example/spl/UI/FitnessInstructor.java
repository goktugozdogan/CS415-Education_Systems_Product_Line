package com.example.spl.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.spl.R;

public class FitnessInstructor extends AppCompatActivity {
    private Button createCourse;
    private Button createTraining;
    private Button viewStudentList;
    private Button createNutrition;
    private Button stepTreckerBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_instructor);
        createCourse = findViewById(R.id.fitnessInsBut1);
        createTraining = findViewById(R.id.fitnessInsBut3);
        viewStudentList = findViewById(R.id.fitnessInsBut4);
        createNutrition = findViewById(R.id.fitnessInsBut2);


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
        viewStudentList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),StudentList.class);
                startActivity(newPage);
            }
        });
        createNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),CreateNutPlan.class);
                startActivity(newPage);
            }
        });

    }
}
