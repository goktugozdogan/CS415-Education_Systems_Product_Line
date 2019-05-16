package com.example.spl.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.spl.R;

public class CreateNutPlan extends AppCompatActivity {
    private Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        create = findViewById(R.id.createNutPlanBut);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_nut_plan);
    }
}
