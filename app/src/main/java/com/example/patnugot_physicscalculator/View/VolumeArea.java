package com.example.patnugot_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.patnugot_physicscalculator.Model.Variables;
import com.example.patnugot_physicscalculator.R;

public class VolumeArea extends AppCompatActivity {

    Variables variables= new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_area);

        Button btnPyramid= findViewById(R.id.prism);
        Button btnCylinder=findViewById(R.id.cylinder);
        Button btnCone=findViewById(R.id.cone);
        Button btnSphere=findViewById(R.id.sphere);
        Button btnCuboid=findViewById(R.id.cuboid);

        btnPyramid.setOnClickListener(this::onClick);
        btnCylinder.setOnClickListener(this::onClick);
        btnCone.setOnClickListener(this::onClick);
        btnSphere.setOnClickListener(this::onClick);
        btnCuboid.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Intent intent=new Intent(VolumeArea.this,VolumeAreaAnswers.class);
        switch (view.getId()) {
            case R.id.prism:
                variables.setShapeType("Pyramid");
                intent.putExtra("shape",variables.getShapeType());
                startActivity(intent);
                break;
            case R.id.cylinder:
                variables.setShapeType("Cylinder");
                intent.putExtra("shape",variables.getShapeType());
                startActivity(intent);
                break;
            case R.id.cone:
                variables.setShapeType("Cone");
                intent.putExtra("shape",variables.getShapeType());
                startActivity(intent);
                break;
            case R.id.sphere:
                variables.setShapeType("Sphere");
                intent.putExtra("shape",variables.getShapeType());
                startActivity(intent);
                break;
            case R.id.cuboid:
                variables.setShapeType("Cuboid");
                intent.putExtra("shape",variables.getShapeType());
                startActivity(intent);
                break;
        }
    }
}