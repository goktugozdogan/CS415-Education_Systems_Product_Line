package com.example.spl;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView header;
    private Button signIn;
    private Button signUp;
    private ImageView logo;
    private CheckBox studentCheck;
    private CheckBox instructorCheck;
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signIn = findViewById(R.id.signInBut);
        header = findViewById(R.id.header);
        logo = findViewById(R.id.headerImage);
        studentCheck = findViewById(R.id.mainStudentCheck);
        instructorCheck = findViewById(R.id.mainInstructorCheck);

        final Flag globalVariable = (Flag) getApplicationContext();
        final boolean a  = globalVariable.getAcademyFlag();
        final boolean d  = globalVariable.getDanceFlag();

        if ( a ) {
            header.setText("Welcome to Acamdemica !!");
        }
        else if ( d ) {
            header.setText("Welcome to Burn2Dance!!");
            logo.setImageResource(R.drawable.dancebg);
        }
        else {
            header.setText("Welcome to Pain2Strong");
        }

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(d)
                {
                    Intent newPage = new Intent(getApplicationContext(),DanceUserMain.class);
                    Intent newPage2 = new Intent(getApplicationContext(),DanceInstructorMain.class);
                    if(studentCheck.isChecked())
                       startActivity(newPage);
                    else if(instructorCheck.isChecked())
                        startActivity(newPage2);
                }
                else if(a)
                {
                    Intent newPage = new Intent(getApplicationContext(),AcademicUserMain.class);
                    Intent newPage2 = new Intent(getApplicationContext(),AcademicInstructorMain.class);
                    if(studentCheck.isChecked())
                        startActivity(newPage);
                    else if(instructorCheck.isChecked())
                        startActivity(newPage2);
                }
                else
                {
                    Intent newPage = new Intent(getApplicationContext(),SportUserMain.class);
                    Intent newPage2 = new Intent(getApplicationContext(),FitnessInstructor.class);
                    if(studentCheck.isChecked())
                        startActivity(newPage);
                    else if(instructorCheck.isChecked())
                        startActivity(newPage2);
                }

            }
        });

    }
}
