package com.example.patnugot_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.patnugot_physicscalculator.R;
import com.example.patnugot_physicscalculator.View.Physics;
import com.example.patnugot_physicscalculator.View.VolumeArea;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Button physics=findViewById(R.id.btnPhysics);
        Button volume=findViewById(R.id.btnVolume);

        physics.setOnClickListener((view -> startActivity(new Intent(this, Physics.class))));
        volume.setOnClickListener((view -> startActivity(new Intent(this, VolumeArea.class))));
    }
}