package com.example.patnugot_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.patnugot_physicscalculator.Model.Variables;
import com.example.patnugot_physicscalculator.R;

public class Physics extends AppCompatActivity {

    Variables variables= new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_physics);

        Button force = findViewById(R.id.btnForce);
        Button density = findViewById(R.id.btnDensity);
        Button power = findViewById(R.id.btnPower);
        Button weight = findViewById(R.id.btnWeight);
        Button pressure = findViewById(R.id.btnPressure);

        force.setOnClickListener(this::onClick);
        density.setOnClickListener(this::onClick);
        power.setOnClickListener(this::onClick);
        weight.setOnClickListener(this::onClick);
        pressure.setOnClickListener(this::onClick);

    }
    @SuppressLint("NonConstantResourceId")
    private void onClick(View view) {
        Intent intent=new Intent(Physics.this,PhysicsAnswers.class);
        switch (view.getId()) {
            case R.id.btnForce:
                variables.setPhysicsType("Force");
                intent.putExtra("type",variables.getPhysicsType());
                startActivity(intent);
                break;
            case R.id.btnDensity:
                variables.setPhysicsType("Density");
                intent.putExtra("type",variables.getPhysicsType());
                startActivity(intent);
                break;
            case R.id.btnPower:
                variables.setPhysicsType("Power");
                intent.putExtra("type",variables.getPhysicsType());
                startActivity(intent);
                break;
            case R.id.btnWeight:
                variables.setPhysicsType("Weight");
                intent.putExtra("type",variables.getPhysicsType());
                startActivity(intent);
                break;
            case R.id.btnPressure:
                variables.setPhysicsType("Pressure");
                intent.putExtra("type",variables.getPhysicsType());
                startActivity(intent);
                break;
        }
    }
}