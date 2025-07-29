package com.wipro.automobile.fourwheeler;

import com.wipro.automobile.Vehicle;

public class Ford extends Vehicle {

    public int speed() {
        return 150; 
    }

    public int tempControl() {
        System.out.println("AC is ON and temperature is controlled.");
        return 22; 
    }

    @Override
    public void getModelName() {
        System.out.println("Ford EcoSport");
    }

    @Override
    public void getRegistrationNumber() {
        System.out.println("TG10CD5678");
    }

    @Override
    public void getOwnerName() {
        System.out.println("Vinay BhAAii");
    }
}
