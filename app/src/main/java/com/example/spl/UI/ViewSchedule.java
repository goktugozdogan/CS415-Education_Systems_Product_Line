package com.example.spl.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.spl.R;

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
