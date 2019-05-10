package com.example.spl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ViewSchedule extends AppCompatActivity {
    ImageView scheduleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_schedule);
        scheduleView = findViewById(R.id.scheduleView);
        scheduleView.setImageResource(R.drawable.schedule);
    }
}
