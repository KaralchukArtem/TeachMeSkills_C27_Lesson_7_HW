package com.teachmeskills.lesson7.task1.position;

import com.teachmeskills.lesson7.task1.interfacePos.GetInfo;

public class Worker implements GetInfo {

    String position = "Worker";
    public int positionID = 3;

    @Override
    public void getInfo() {
        System.out.println("Position - " + position);
    }


}
