package com.example.spl.UI;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.spl.R;
import com.example.spl._core.Database;
import com.example.spl._core.User;
import com.example.spl._factory.UserFactory;

public class MainActivity extends AppCompatActivity {
    private TextView header;
    private Button signIn;
    private ImageView logo;
    private CheckBox studentCheck;
    private CheckBox instructorCheck;
    private TextView username;
    private TextView password;
    private boolean isUserConnected = true;
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
        username = findViewById(R.id.main_username);
        password = findViewById(R.id.main_password);

        final Flag globalVariable = (Flag) getApplicationContext();
        final boolean a  = globalVariable.getAcademyFlag();
        final boolean d  = globalVariable.getDanceFlag();

        if ( a ) {
            header.setText("Welcome to Academica !!");
            logo.setImageResource(R.drawable.academicalogo);
            header.setTextColor(Color.parseColor("#ff33b5e5"));
        }
        else if ( d ) {
            header.setText("Welcome to Burn2Dance!!");
            logo.setImageResource(R.drawable.dancebg);
            header.setTextColor(Color.GREEN);
        }
        else {
            header.setText("Welcome to Pain2Strong");
            logo.setImageResource(R.drawable.fitnesslogo);
            header.setTextColor(Color.parseColor("#f49b42"));

        }

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Database db = new Database();
                User s = db.Login(username.getText().toString(),password.getText().toString(),globalVariable.getAppType());
                System.out.print(globalVariable.getAppType());

                if ( isUserConnected ) {
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
                else {
                    // give alert
                }
            }
        });

    }
}
