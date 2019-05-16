package com.example.spl.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spl.R;

import java.util.ArrayList;
import java.util.List;

public class TeacherMyCourses extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_my_courses);
        listView = findViewById(R.id.TeacherMyCourseCourseList);
        final List< String > ListElementsArrayList;
        ArrayList<String> teamList = new ArrayList<String>();
        teamList.add("CS 473");
        teamList.add("CS 473");
        teamList.add("CS 223");
        teamList.add("CS 456");

        ArrayList<String> teamList1 = new ArrayList<String>();
        teamList1.add("Hip Hop for Beginners");
        teamList1.add("Hip Hop for Beginners");
        teamList1.add("Salsa");
        teamList1.add("Bachata for Advanced");
        teamList1.add("Tango in Saloon");

        ArrayList<String> teamList2 = new ArrayList<String>();
        teamList2.add("Body Building");
        teamList2.add("Zumba");
        teamList2.add("Fat Cutting");


        final ArrayAdapter< String > adapter1 = new ArrayAdapter < String >
                (getApplicationContext(), android.R.layout.simple_list_item_1,
                        teamList);
        final ArrayAdapter< String > adapter2 = new ArrayAdapter < String >
                (getApplicationContext(), android.R.layout.simple_list_item_1,
                        teamList1);

        final ArrayAdapter< String > adapter3 = new ArrayAdapter < String >
                (getApplicationContext(), android.R.layout.simple_list_item_1,
                        teamList2);
        final Flag globalVariable = (Flag) getApplicationContext();
        final boolean a  = globalVariable.getAcademyFlag();
        final boolean d  = globalVariable.getDanceFlag();

        if(d)
            listView.setAdapter(adapter2);
        else if(a)
            listView.setAdapter(adapter1);
        else
            listView.setAdapter(adapter3);
    }
}
