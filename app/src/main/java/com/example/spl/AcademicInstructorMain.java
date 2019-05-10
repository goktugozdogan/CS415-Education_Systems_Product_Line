package com.example.spl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcademicInstructorMain extends AppCompatActivity {
    private Button createCourse;
    private Button assignTask;
    private Button createSchedule;
    private Button viewStudents;
    private Button informParents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_instructor_main);
        createCourse = findViewById(R.id.acaInsBut4);
        assignTask = findViewById(R.id.acaInsBut2);
        createSchedule = findViewById(R.id.acaInsBut3);
        viewStudents = findViewById(R.id.acaInsBut1);
        informParents = findViewById(R.id.acaInsBut5);

        createCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),CreatePersonalCourse.class);
                startActivity(newPage);
            }
        });
        assignTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),AssignTask.class);
                startActivity(newPage);
            }
        });
        createSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),ViewSchedule.class);
                startActivity(newPage);
            }
        });
        viewStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),StudentList.class);
                startActivity(newPage);
            }
        });
        informParents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),InformParents.class);
                startActivity(newPage);
            }
        });
    }
}
