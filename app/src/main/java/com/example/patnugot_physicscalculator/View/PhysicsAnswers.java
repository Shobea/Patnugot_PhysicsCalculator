package com.example.patnugot_physicscalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.patnugot_physicscalculator.Controller.Formulas;
import com.example.patnugot_physicscalculator.R;

public class PhysicsAnswers extends AppCompatActivity {

    Formulas formulas=new Formulas();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_answers);

        Button btnCalculate = findViewById(R.id.calculate);

        TextView txtType = findViewById(R.id.type);
        TextView txtFormula = findViewById(R.id.formula);
        TextView txtVariable = findViewById(R.id.var1);
        TextView txtVariable2 = findViewById(R.id.var2);
        TextView answer=findViewById(R.id.answer);

        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);

        Intent intent=getIntent();
        String type=intent.getStringExtra("type");

        formulas.PhysicsDisplay(type, txtType, txtFormula, txtVariable,txtVariable2,input2);

        btnCalculate.setOnClickListener(view -> {

            double num1=Double.parseDouble(input1.getText().toString());
            double num2=Double.parseDouble(input2.getText().toString());

            formulas.PhysicsFormula(num1,num2,type);
            formulas.PhysicsResults(answer);
        });
    }
}