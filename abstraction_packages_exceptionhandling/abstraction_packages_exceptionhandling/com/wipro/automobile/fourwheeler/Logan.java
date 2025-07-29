package com.wipro.automobile.fourwheeler;

import com.wipro.automobile.Vehicle;

public class Logan extends Vehicle {

    public int speed() {
        return 120; 
    }

    public int gps() {
        System.out.println("GPS activated.");
        return 1;  
    }

    @Override
    public void getModelName() {
        System.out.println("Logan car");
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("TG01AB1234");
    }

    @Override
    public void getOwnerName() {
        System.out.println("Smaran");
    }
}
