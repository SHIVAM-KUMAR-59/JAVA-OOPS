package com.shivam.oop5.interfaces.basics;

public class Main {
    public static void main(String[] args) {

        // Creating an object of Car class and calling its methods
        Car car = new Car();
        car.start();       // Calls the start method from the Engine interface
        car.accelerate();  // Calls the accelerate method from the Engine interface
        car.brake();       // Calls the brake method from the Engine interface
        car.stop();        // Calls the stop method from the Engine interface

        // Creating a reference of Engine interface and assigning it to a Car object
        Engine car1 = new Car();
        // car.a; // This will give an error because the variable `a` is not accessible through the Engine interface

        // Creating a reference of Media interface and assigning it to a Car object
        Media carMedia = new Car();
        carMedia.start(); // Calls the start method defined in the Media interface
        carMedia.stop();  // Calls the stop method defined in the Media interface

        // Creating an object of OptimizedCar class and calling its methods
        OptimizedCar newCar = new OptimizedCar();
        newCar.start();       // Calls the start method from the Engine interface
        newCar.startMusic();  // Starts music, a feature added in the OptimizedCar class
        newCar.accelerate();  // Calls the accelerate method from the Engine interface
        newCar.frontBrake();  // Applies the front brake, a method in the OptimizedCar class
        newCar.rearBrake();   // Applies the rear brake, a method in the OptimizedCar class
        newCar.stop();        // Calls the stop method from the Engine interface
        newCar.stopMusic();   // Stops music, a feature added in the OptimizedCar class

        // Upgrading the engine and testing the car functionality again
        newCar.upgradeEngine(); // Upgrades the engine in the OptimizedCar class
        newCar.start();         // Calls the start method after engine upgrade
    }
}
