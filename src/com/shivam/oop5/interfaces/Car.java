package com.shivam.oop5.interfaces;

public class Car implements Engine, Brake, Media{

    int a = 30;

    @Override
    public void brake() {
        System.out.println("Brake function");
    }

    @Override
    public void start() {
        System.out.println("Start Engine Function");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine Function");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate Engine Function");
    }
}
