package com.teachmeskills.lesson7.task1.position;

import com.teachmeskills.lesson7.task1.interfacePos.GetInfo;

public class Director implements GetInfo {

    String position = "Director";
    public int positionID = 2;


    @Override
    public void getInfo() {
        System.out.println("Position - " + position);
    }
}
