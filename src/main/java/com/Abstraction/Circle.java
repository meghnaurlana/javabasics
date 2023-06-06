package com.Abstraction;

public class Circle extends Shape {
    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 3.14 * radius * radius;
    }


    @Override
    public double circumference() {

        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", area=" + area() +
                ", circumference=" + circumference() +
                '}';
    }
}
