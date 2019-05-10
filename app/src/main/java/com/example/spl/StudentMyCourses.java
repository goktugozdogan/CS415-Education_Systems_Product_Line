package com.example.spl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spl.R;

import java.util.ArrayList;
import java.util.List;

public class StudentMyCourses extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_my_courses);
        listView = findViewById(R.id.StudentMyCoursesList);
        final List< String > ListElementsArrayList;
        ArrayList<String> teamList = new ArrayList<String>();
        teamList.add("CS 491");
        teamList.add("CS 223");
        teamList.add("Math 245");
        teamList.add("COMD 431");
        teamList.add("LAW 312");
        teamList.add("IAED 400");

        final ArrayAdapter< String > adapter1 = new ArrayAdapter < String >
                (getApplicationContext(), android.R.layout.simple_list_item_1,
                        teamList);
        listView.setAdapter(adapter1);

    }
}
