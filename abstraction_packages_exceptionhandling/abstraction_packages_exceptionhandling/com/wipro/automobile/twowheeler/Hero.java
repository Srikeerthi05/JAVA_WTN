package com.wipro.automobile.twowheeler;

import com.wipro.automobile.Vehicle;

public class Hero extends Vehicle {

    @Override
    public void getModelName() {
        System.out.println("Hero karezmaa zrx");
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("TS09EZ1234");
    }

    @Override
    public void getOwnerName() {
        System.out.println("Smaran bhaii");
    }

    public void getSpeed() {
        System.out.println("Top Speed: 90 km/h");
    }
}
