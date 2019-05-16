package com.example.spl.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.spl.R;
import com.example.spl._core.Database;
import com.example.spl._core.User;

public class CourseDetails extends AppCompatActivity {
    private TextView description;
    private TextView details;
    private TextView name;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        final Flag globalVariable = (Flag) getApplicationContext();
        final boolean a  = globalVariable.getAcademyFlag();
        final boolean d  = globalVariable.getDanceFlag();
        description = findViewById(R.id.CourseDetailsCourseDescription);
        details = findViewById(R.id.CourseDetailsGeneral);
        name = findViewById(R.id.CourseDetailsName);
        register = findViewById(R.id.CourseDetailsButton);

        if(a)
        {
            description.setText("Asymptotic notation. Divide and conquer approach. Solving recurrences: substitution method, master method. Bounding summations. Analysis of randomized quicksort. Medians and order statistics. Heaps: heapsort, priority queues. Sorting in linear time. Dynamic programming. Greedy algorithms. Amortized analysis: aggregate, accounting and potential methods, dynamic tables. Elementary graph algorithms: breadth-/depth-first search, topological sort, strongly connected components.");
            details.setText("Teacher: Mustafa Özdal \nThis course is a Online. \nLecture Hours: 22 Hours \nVideo Count: 104 \n\nPricing: $69.99");
            name.setText("CS 473 - Algorithms I");
        }
        else if(d)
        {
            description.setText("What you'll learn\n" +
                    "Comfortably perform hip hop choreography\n" +
                    "Understand basic 8 counts\n" +
                    "Know how to perform without a boring facial expression\n" +
                    "Use the choreography for their own purposes (wedding dance routines, quinceanera, etc)\n" +
                    "Understand basic hip hop grooves, movement, and footowork");
            details.setText("Teacher: Ricardo Dancer \nThis course is given in a Saloon. \nLecture Hours: 2 Hours in lecture days \nLecture Count: 18 \n\nPricing: $129.99");
            name.setText("Hip Hop for Beginners");
        }
        else
        {
            description.setText("What you'll learn\n" +
                    "You'll burn fat and blow-torch off excess body weight so quickly that you can literally eat more than you normally do and still look better than ever.\n" +
                    "You'll sleep like a log. Eight hours of deep sleep will no longer be a goal. It'll be an automatic. As soon as you hit the rack you'll be out like a light.\n" +
                    "You'll pack functional muscle onto your legs, chest and back. No \"bulk\", just lean muscle making you super flexible and incredibly strong.\n" +
                    "You'll triple your endurance and improve your athletic skills by (literally) leaps and bounds. While everyone else is suckin' wind, you'll be running circles around them ready for more.");
            details.setText("");
            name.setText("");
        }

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),StudentMyCourses.class);
                startActivity(newPage);
            }
        });




    }
}
