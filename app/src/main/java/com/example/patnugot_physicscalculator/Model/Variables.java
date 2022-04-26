package com.example.patnugot_physicscalculator.Model;

public class Variables {
    private double force, mass, acceleration, volume, work, time, gravity, area, answer; //Physics
    private String physicsType, shapeType;

    //Physics Getters

    public String getPhysicsType() { return physicsType; }
    public double getForce() { return force; }
    public double getMass() { return mass; }
    public double getAcceleration() { return acceleration; }
    public double getVolume() { return volume; }
    public double getWork() { return work; }
    public double getTime() { return time; }
    public double getGravity() { return gravity; }
    public double getArea() { return area; }
    public double getAnswer() { return answer; }
    public String getShapeType() { return shapeType; }


    //Setters

    public void setPhysicsType(String physicsType) { this.physicsType = physicsType; }
    public void setForce(double force) { this.force = force; }
    public void setMass(double mass) { this.mass = mass; }
    public void setAcceleration(double acceleration) { this.acceleration = acceleration; }
    public void setVolume(double volume) { this.volume = volume; }
    public void setWork(double work) { this.work = work; }
    public void setTime(double time) { this.time = time; }
    public void setGravity(double gravity) { this.gravity = gravity; }
    public void setArea(double area) { this.area = area; }
    public void setAnswer(double answer) { this.answer = answer; }
    public void setShapeType(String shapeType) { this.shapeType = shapeType; }

}
