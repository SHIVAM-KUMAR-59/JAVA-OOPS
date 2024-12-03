package com.shivam.oop5.interfaces;

public class FrontBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("Front Brake Called");
    }
}
