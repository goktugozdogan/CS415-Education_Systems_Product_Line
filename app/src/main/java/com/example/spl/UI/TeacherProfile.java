package com.example.spl.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.spl.R;

public class TeacherProfile extends AppCompatActivity {
    private TextView teacherInfoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);

        teacherInfoText = findViewById(R.id.teacherInfoText);

        teacherInfoText.setText("Name: John\nSurname: Doe\nCourses: Digital Design, Computer Organizations, Operating Systems\nRate: 4.5/5");
    }
}
