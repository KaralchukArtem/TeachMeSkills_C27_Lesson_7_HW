package com.teachmeskills.lesson7.task2.figure;

public class Rhombus extends Figure {

    public String name = "Rhombus";

    double result;
    double height;

    public Rhombus(double height, double length) {
        super(length);
        this.height = height;
    }

    @Override
    public double calculationOfArea() {
        result = height * length;
        return result;
    }

    @Override
    public double calculationOfPyrimeter() {
        result = length * 4;
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
