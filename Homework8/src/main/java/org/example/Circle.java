package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public String toString(){
        return "Circle: radius=" + radius;
    }
}
