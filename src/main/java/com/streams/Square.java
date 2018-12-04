package com.streams;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a * a;
    }
}
