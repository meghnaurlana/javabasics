package com.Oop;

public class Encapsulation {
    private int radius;
    private int diameter;

    public Encapsulation(){
        
    }
    public Encapsulation(int radius,int diameter) {
        this.radius = radius;
        this.diameter =diameter;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double Area() {
        return 3.14 * radius;
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Area=" + Area() +
                '}';
    }
}
