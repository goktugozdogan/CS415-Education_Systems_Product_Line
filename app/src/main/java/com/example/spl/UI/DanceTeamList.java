package com.example.spl.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spl.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DanceTeamList extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_team_list);
        listview = (ListView) findViewById(R.id.danceTeamList);
        final List< String > ListElementsArrayList;
        ArrayList<String> teamList = new ArrayList<String>();
        teamList.add("Group Salsa");
        teamList.add("born 2 hiphop");
        teamList.add("Bachata is my girl");
        teamList.add("Group R&B");
        teamList.add("Butterflies");
        teamList.add("Latino Group");
        final ArrayAdapter< String > adapter = new ArrayAdapter < String >
                (getApplicationContext(), android.R.layout.simple_list_item_1,
                        teamList);
        listview.setAdapter(adapter);

    }
}
