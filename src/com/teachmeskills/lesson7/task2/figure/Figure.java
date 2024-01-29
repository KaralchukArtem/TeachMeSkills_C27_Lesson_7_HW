package com.teachmeskills.lesson7.task2.figure;

public abstract class Figure {

    double length;

    public Figure(double length) {
        this.length = length;
    }

    public abstract double calculationOfArea();

    public abstract double calculationOfPyrimeter();
    public abstract String getName();

}
