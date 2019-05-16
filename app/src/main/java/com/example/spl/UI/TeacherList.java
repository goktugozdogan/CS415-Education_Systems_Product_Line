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

public class TeacherList extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_list);
        listView = findViewById(R.id.teacherList);
        final List< String > ListElementsArrayList;
        ArrayList<String> teamList = new ArrayList<String>();
        teamList.add("Eray Tüzün");
        teamList.add("Altay Güvenir");
        teamList.add("Mustafa Özdal");
        teamList.add("Hamdi Dibeklioğlu");
        teamList.add("Erman Ayday");
        teamList.add("Özcan Öztürk");

        ArrayList<String> teamList1 = new ArrayList<String>();
        teamList1.add("Muhammed Danseder");
        teamList1.add("Ali Salsa");
        teamList1.add("Ricardo Dancer");
        teamList1.add("Leo Latin");

        ArrayList<String> teamList2 = new ArrayList<String>();
        teamList2.add("Lazar Angelov");
        teamList2.add("Jay Cutler");
        teamList2.add("Emre Agirsaglam");
        teamList2.add("Semih Guclu");

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

                Intent newPage = new Intent(getApplicationContext(),CourseDetails.class);
                startActivity(newPage);

            }
        });
    }
}
