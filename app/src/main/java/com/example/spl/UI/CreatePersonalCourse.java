package com.example.spl.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.spl.R;

public class CreatePersonalCourse extends AppCompatActivity {
    private CheckBox privateCheck;
    private CheckBox onlineCheck;
    private Button contBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_personal_course);
        privateCheck = findViewById(R.id.privateCheck);
        onlineCheck = findViewById(R.id.onlineCheck);
        contBut = findViewById(R.id.contButCourseCre);
        contBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),CreatePrivateCoursePage.class);
                Intent newPage2 = new Intent(getApplicationContext(),OnlineCourseCreatePage.class);
                if(privateCheck.isChecked())
                {
                    startActivity(newPage);
                }
                else if(onlineCheck.isChecked())
                {
                    startActivity(newPage2);
                }
            }
        });
    }
}
