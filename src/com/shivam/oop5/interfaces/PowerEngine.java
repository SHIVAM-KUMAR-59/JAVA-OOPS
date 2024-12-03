package com.shivam.oop5.interfaces;

// The PowerEngine class implements the Engine interface
public class PowerEngine implements Engine {

    // Implementing the start method from the Engine interface
    @Override
    public void start() {
        System.out.println(" Power Engine Start");  // Prints a message when the Power engine starts
    }

    // Implementing the stop method from the Engine interface
    @Override
    public void stop() {
        System.out.println("Power Engine Stop");  // Prints a message when the Power engine stops
    }

    // Implementing the accelerate method from the Engine interface
    @Override
    public void accelerate() {
        System.out.println("Power Engine Accelerate");  // Prints a message when the Power engine accelerates
    }
}
