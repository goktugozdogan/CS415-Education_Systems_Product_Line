package com.example.spl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DanceUserMain extends AppCompatActivity {
    private Button createTeamBut;
    private Button teamListBut;
    private Button forumBut;
    private Button teacherListBut;
    private Button viewNutPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_user_main);
        createTeamBut = findViewById(R.id.danceTeamBut);
        teamListBut = findViewById(R.id.teamList1);
        forumBut = findViewById(R.id.forumDance);
        teacherListBut = findViewById(R.id.danceTeacherListBut);
        viewNutPlan = findViewById(R.id.v_ewNutritonPlanDance);
        final Flag globalVariable = (Flag) getApplicationContext();
        final boolean a  = globalVariable.getAcademyFlag();
        final boolean d  = globalVariable.getDanceFlag();
        createTeamBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent newPage = new Intent(getApplicationContext(),BuildDanceTeam.class);
                    startActivity(newPage);

            }
        });
        teamListBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),DanceTeamList.class);
                startActivity(newPage);
            }
        });
        forumBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),ForumList.class);
                startActivity(newPage);
            }
        });
        teacherListBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),TeacherList.class);
                startActivity(newPage);
            }
        });
        viewNutPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),ViewNutPlan.class);
                startActivity(newPage);
            }
        });
    }
}
