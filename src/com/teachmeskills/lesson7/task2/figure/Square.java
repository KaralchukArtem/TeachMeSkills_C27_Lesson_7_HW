package com.teachmeskills.lesson7.task2.figure;

public class Square extends Figure {

    public String name = "Square";

    double result;

    public Square(double length) {
        super(length);
    }

    @Override
    public double calculationOfArea() {
        result = Math.pow(length, 2);
        return result;
    }

    @Override
    public double calculationOfPyrimeter() {
        result = 4 * length;
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
