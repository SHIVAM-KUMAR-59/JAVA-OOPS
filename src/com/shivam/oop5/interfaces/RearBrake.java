package com.shivam.oop5.interfaces;

public class RearBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("Rear Brakes Called");
    }
}
