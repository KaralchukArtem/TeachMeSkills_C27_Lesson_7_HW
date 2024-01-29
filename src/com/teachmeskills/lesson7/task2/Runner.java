package com.teachmeskills.lesson7.task2;

import com.teachmeskills.lesson7.task2.figure.*;

public class Runner {

    public static void main(String[] args) {

        double sum = 0;

        Triangle triangle = new Triangle(5.13, 5.86);
        Rectangle rectangle = new Rectangle(6.12, 8.4);
        Circle circle = new Circle(10);
        Square square = new Square(12.52);
        Rhombus rhombus = new Rhombus(4, 7.5);

        Figure[] figures = {triangle, rectangle, circle, square, rhombus};

        System.out.println("Area :");
        for (Figure figure : figures) {
            System.out.println(figure.getName() + " " + figure.calculationOfArea());
        }
        System.out.println("\nPyrimeter :");
        for (Figure figure : figures) {
            System.out.println(figure.getName() + " " + figure.calculationOfPyrimeter());
        }

        System.out.print("\n");
        for (Figure figure : figures) {
            sum += figure.calculationOfPyrimeter();
        }
        System.out.println("Sum - " + sum);


    }

}
