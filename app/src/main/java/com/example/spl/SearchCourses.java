package com.example.spl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spl.R;

import java.util.ArrayList;
import java.util.List;

public class SearchCourses extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_courses);
        listView = findViewById(R.id.SearchCoursesListAc);
        final List< String > ListElementsArrayList;
        ArrayList<String> teamList = new ArrayList<String>();
        teamList.add("CS 492");
        teamList.add("MATH 234");
        teamList.add("IAED 421");
        teamList.add("COMD 213");
        teamList.add("GRA 213");
        teamList.add("EE 431");
        final ArrayAdapter< String > adapter1 = new ArrayAdapter < String >
                (getApplicationContext(), android.R.layout.simple_list_item_1,
                        teamList);
        listView.setAdapter(adapter1);

    }
}
