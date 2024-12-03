package com.shivam.oop5.interfaces.basics;

// The ElectricEngine class implements the Engine interface
public class ElectricEngine implements Engine {

    // Implementing the start method from the Engine interface
    @Override
    public void start() {
        System.out.println("Electric Engine Start");  // Prints a message when the electric engine starts
    }

    // Implementing the stop method from the Engine interface
    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");  // Prints a message when the electric engine stops
    }

    // Implementing the accelerate method from the Engine interface
    @Override
    public void accelerate() {
        System.out.println("Electric Engine Accelerate");  // Prints a message when the electric engine accelerates
    }
}
