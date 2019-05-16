package com.example.spl.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.spl.R;

public class AcademicUserMain extends AppCompatActivity {
    private Button viewSchedule;
    private Button viewForum;
    private Button viewTeachers;
    private Button findMentorBut;
    private Button myCoursesBut;
    private Button taskRemBut;
    private Button selectCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_user_main);
        viewSchedule = findViewById(R.id.viewScheduleBut);
        viewForum = findViewById(R.id.academyGoForum);
        viewTeachers = findViewById(R.id.viewTeachersAcademy);
        findMentorBut = findViewById(R.id.findMentorButAc);
        myCoursesBut = findViewById(R.id.myCoursesBut);
        taskRemBut = findViewById(R.id.taskReminder);
        selectCourses = findViewById(R.id.searchCourseBut);
        viewSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),ViewSchedule.class);
                startActivity(newPage);
            }
        });
        viewForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),ForumList.class);
                startActivity(newPage);
            }
        });
        viewTeachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),TeacherList.class);
                startActivity(newPage);
            }
        });
        findMentorBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(), FindMentor.class);
                startActivity(newPage);
            }
        });
        myCoursesBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(), StudentMyCourses.class);
                startActivity(newPage);
            }
        });
        taskRemBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(), TaskReminder.class);
                startActivity(newPage);
            }
        });
        selectCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(), SearchCourses.class);
                startActivity(newPage);
            }
        });
    }
}
