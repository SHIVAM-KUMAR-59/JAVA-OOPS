package com.shivam.oop5.interfaces.basics;

public class FrontBrake implements Brake {
    @Override
    public void brake() {
        System.out.println("Front Brake Called");
    }
}
