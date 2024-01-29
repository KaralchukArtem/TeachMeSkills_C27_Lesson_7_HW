package com.teachmeskills.lesson7.task1;

import com.teachmeskills.lesson7.task1.position.Accountant;
import com.teachmeskills.lesson7.task1.position.Director;
import com.teachmeskills.lesson7.task1.position.Worker;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        System.out.println("Введите код должности от 1 до 3");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                accountant.getInfo();
                break;
            case 2:
                director.getInfo();
                break;
            case 3:
                worker.getInfo();
                break;
        }

    }

}
