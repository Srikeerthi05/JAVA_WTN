package com.wipro.automobile.twowheeler;

import com.wipro.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public void getModelName() {
        System.out.println("Honda CBX  800r");
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("TS08XY5678");
    }

    @Override
    public void getOwnerName() {
        System.out.println("vikas bhaii");
    }

    public void getSpeed() {
        System.out.println("Top Speed: 100 km/h");
    }
}
