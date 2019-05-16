package com.example.spl.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        teamList.add("CS 473");
        teamList.add("MATH 234");
        teamList.add("IAED 421");
        teamList.add("COMD 213");
        teamList.add("GRA 213");
        teamList.add("EE 431");

        ArrayList<String> teamList1 = new ArrayList<String>();
        teamList1.add("Salsa ");
        teamList1.add("Hip Hop Dance For Beginners");
        teamList1.add("Bachata");
        teamList1.add("Halay from Mahmut Tuncer");

        ArrayList<String> teamList2 = new ArrayList<String>();
        teamList2.add("Body Building");
        teamList2.add("Cross Fit");
        teamList2.add("Fat Cuting");
        teamList2.add("Zumba");

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent newPage = new Intent(getApplicationContext(),TeacherList.class);
                startActivity(newPage);

            }
        });
    }
}
