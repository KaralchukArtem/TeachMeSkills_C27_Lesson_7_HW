package com.teachmeskills.lesson7.task1.position;

import com.teachmeskills.lesson7.task1.interfacePos.GetInfo;

public class Accountant implements GetInfo {

    String position = "Accountant";
    public int positionID = 1;

    @Override
    public void getInfo() {
        System.out.println("Position - " + position);
    }

}
