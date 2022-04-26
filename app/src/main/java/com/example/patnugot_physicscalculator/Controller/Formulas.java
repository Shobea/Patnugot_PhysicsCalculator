package com.example.patnugot_physicscalculator.Controller;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.patnugot_physicscalculator.Model.Variables;

public class Formulas{

    Variables variables=new Variables();

    public void PhysicsFormula(double a, double b, String type){
        switch (type) {
            case "Force":
                variables.setPhysicsType(type);
                variables.setMass(a);
                variables.setAcceleration(b);
                variables.setAnswer(variables.getMass() * variables.getAcceleration());
                break;
            case "Density":
                variables.setPhysicsType(type);
                variables.setMass(a);
                variables.setVolume(b);
                variables.setAnswer(variables.getMass() / variables.getVolume());
                break;
            case "Power":
                variables.setPhysicsType(type);
                variables.setWork(a);
                variables.setTime(b);
                variables.setAnswer(variables.getWork() / variables.getTime());
                break;
            case "Weight":
                variables.setPhysicsType(type);
                variables.setMass(a);
                variables.setGravity(9.8);
                variables.setAnswer(variables.getMass() * variables.getGravity());
                break;
            case "Pressure":
                variables.setForce(a);
                variables.setArea(b);
                variables.setAnswer(variables.getForce() / variables.getArea());
                break;
        }
    }
    public void PhysicsResults(TextView a){
        a.setVisibility(View.VISIBLE);
        a.setText(String.valueOf(variables.getAnswer()));
    }
    public void PhysicsDisplay(String type, TextView a, TextView b, TextView c, TextView d, EditText e){
        variables.setPhysicsType(type);
        switch (type) {
            case "Density":
                a.setText(variables.getPhysicsType());
                b.setText("d = M / V");
                c.setText("Mass: ");
                d.setText("Volume: ");
                break;
            case "Power":
                a.setText(variables.getPhysicsType());
                b.setText("P = W / t");
                c.setText("Work: ");
                d.setText("Time: ");
                break;
            case "Weight":
                a.setText(variables.getPhysicsType());
                b.setText("W = mg");
                c.setText("Mass:");
                d.setText("Gravity: ");
                e.setText("9.8");
                e.setKeyListener(null);
                break;
            case "Pressure":
                a.setText(variables.getPhysicsType());
                b.setText("P = F / A");
                c.setText("Force:");
                d.setText("Area:");
                break;
        }
    }
    public void VolumeAreaDisplay(String shape, TextView a,TextView b, TextView c, TextView d, EditText e, EditText f){
        variables.setShapeType(shape);
        switch(shape) {
            case "Cylinder":
            case "Cone":
                a.setText(variables.getShapeType());
                b.setText("Height: ");
                c.setText("Radius: ");
                f.setKeyListener(null);
                f.setText("1");
                f.setVisibility(View.INVISIBLE);
                d.setVisibility(View.INVISIBLE);
                break;
            case "Cuboid":
                a.setText(variables.getShapeType());
                b.setText("Length: ");
                c.setText("Width: ");
                d.setText("Height: ");
                break;
            case "Sphere":
                a.setText(variables.getShapeType());
                b.setText("Radius: ");
                c.setVisibility(View.INVISIBLE);
                d.setVisibility(View.INVISIBLE);
                e.setVisibility(View.INVISIBLE);
                f.setVisibility(View.INVISIBLE);
                e.setText("1");
                f.setText("1");
                e.setKeyListener(null);
                f.setKeyListener(null);
        }
    }
    public void VolumeFormula(double a, double b, double c, String shape){
        switch (shape){
            case  "Pyramid":
                double ans=(a*b*c)/3;
                variables.setVolume(ans);
                break;
            case "Cylinder":
                ans= Math.PI*Math.pow(b,2)*a;
                variables.setVolume(ans);
                break;
            case "Cone":
                ans=Math.PI*(a/3)*(b*b);
                variables.setVolume(ans);
                break;
            case "Sphere":
                ans=Math.PI*(a*a*a)*4/3d;
                variables.setVolume(ans);
                break;
            case "Cuboid":
                ans=a*b*c;
                variables.setVolume(ans);
                break;
        }
    }
    public void AreaFormula(double a, double b, double c, String shape){
        switch (shape){
            case "Pyramid":
                double ans=(a*b)+(a*Math.sqrt(Math.pow(b/2,2)+Math.pow(c,2)))+b*Math.sqrt(Math.pow(a/2,2)+Math.pow(c,2));
                variables.setArea(ans);
                break;
            case "Cylinder":
                ans=(2*Math.PI*b*a)+(2*Math.PI*Math.pow(b,2));
                variables.setArea(ans);
                break;
            case "Cone":
                ans=Math.PI*b*(b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
                variables.setArea(ans);
                break;
            case "Sphere":
                ans=4*Math.PI*Math.pow(a,2);
                variables.setArea(ans);
                break;
            case "Cuboid":
                ans=(2*a*b)+(2*a*c)+(2*b*c);
                variables.setArea(ans);
        }
    }
    public void VolumeFormulaDisplay(TextView a,TextView b,TextView c, TextView d){
        a.setVisibility(View.VISIBLE);
        a.setText(String.valueOf(variables.getVolume()));
        b.setVisibility(View.VISIBLE);
        b.setText(String.valueOf(variables.getArea()));
        c.setVisibility(View.VISIBLE);
        d.setVisibility(View.VISIBLE);
    }
    }

