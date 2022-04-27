package com.example.patnugot_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.patnugot_physicscalculator.Controller.Formulas;
import com.example.patnugot_physicscalculator.R;

public class VolumeAreaAnswers extends AppCompatActivity {

    Formulas formulas=new Formulas();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_volume_area_answers);

        Button btnCalculate2 = findViewById(R.id.calculate2);

        TextView txtShape = findViewById(R.id.shape);
        TextView txtVar1 = findViewById(R.id.variable1);
        TextView txtVar2 = findViewById(R.id.variable2);
        TextView txtVar3 = findViewById(R.id.variable3);
        TextView displayArea=findViewById(R.id.textView15);
        TextView displayVolume=findViewById(R.id.textView3);

        TextView area = findViewById(R.id.areaAns);
        TextView volume= findViewById(R.id.volumeAns);

        EditText input1 = findViewById(R.id.inp1);
        EditText input2 = findViewById(R.id.inp2);
        EditText input3= findViewById(R.id.inp3);

        Intent intent=getIntent();
        String shape=intent.getStringExtra("shape");

        formulas.VolumeAreaDisplay(shape, txtShape,txtVar1,txtVar2,txtVar3,input2,input3);

        btnCalculate2.setOnClickListener(view -> {

            double num1=Double.parseDouble(input1.getText().toString());
            double num2=Double.parseDouble(input2.getText().toString());
            double num3=Double.parseDouble(input3.getText().toString());

            formulas.VolumeFormula(num1,num2,num3,shape);
            formulas.AreaFormula(num1,num2,num3,shape);
            formulas.VolumeFormulaDisplay(volume,area,displayArea,displayVolume);

    });
    }
}