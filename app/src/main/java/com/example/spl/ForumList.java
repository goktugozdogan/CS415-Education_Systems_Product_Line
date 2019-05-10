package com.example.spl;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ForumList extends AppCompatActivity {
    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum_list);
        listview = (ListView) findViewById(R.id.forumListView);
        final List< String > ListElementsArrayList;
        ArrayList<String> teamList = new ArrayList<String>();
        teamList.add("Hoca hakkındaki düşüncelerim");
        teamList.add("Dans etmenin vücuda yararları");
        teamList.add("Dans turnavaları hakem hataları");
        teamList.add("Reistale Hazırlanıyoruz");
        teamList.add("Acı kaybımız usta dansçı Ali Danseder...");
        teamList.add("Bu akşamki latin gecesi...");

        ArrayList<String> teamList1 = new ArrayList<String>();
        teamList1.add("Hoca hakkındaki düşüncelerim");
        teamList1.add("Yeni AI arastırması");
        teamList1.add("Ders Calısma Teknikleri");
        teamList1.add("Sınav calısma programım");
        teamList1.add("Universite degerlendirmesi");

        ArrayList<String> teamList2 = new ArrayList<String>();
        teamList2.add("Bulk mı Cut mı");
        teamList2.add("Definasyon ne zaman yapılmalı");
        teamList2.add("Strongman yarısması");
        teamList2.add("Protein tozu marka karsılastırması");
        teamList2.add("Bench mi dumbell mi");

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

        if(a)
            listview.setAdapter(adapter2);
        else if(d)
            listview.setAdapter(adapter1);
        else
            listview.setAdapter(adapter3);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent newPage = new Intent(getApplicationContext(),ForumPage.class);
                startActivity(newPage);

            }
        });
    }
}
