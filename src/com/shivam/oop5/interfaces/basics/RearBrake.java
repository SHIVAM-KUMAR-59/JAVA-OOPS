package com.shivam.oop5.interfaces.basics;

public class RearBrake implements Brake {
    @Override
    public void brake() {
        System.out.println("Rear Brakes Called");
    }
}
