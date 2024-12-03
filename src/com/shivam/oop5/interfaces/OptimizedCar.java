package com.shivam.oop5.interfaces;

// The OptimizedCar class demonstrates dependency injection and composition
public class OptimizedCar {

    // Declaring instance variables for different components of the car
    private Engine engine;  // Engine of the car
    private Media media;    // Media player in the car
    private Brake front;    // Front brake system
    private Brake rear;     // Rear brake system

    // Default constructor to initialize car with default components
    public OptimizedCar(){
        // Initializing the components with specific implementations
        engine = new PowerEngine();  // Using a PowerEngine by default
        media = new CDPlayer();      // Using a CDPlayer as the media device
        front = new FrontBrake();    // Using a FrontBrake for the front brake
        rear = new RearBrake();     // Using a RearBrake for the rear brake
    }

    // Constructor that allows passing a custom Engine
    public OptimizedCar(Engine engine) {
        this.engine = engine;  // Allows setting a custom engine
    }

    // Starts the car's engine by calling the start method on the engine
    public void start(){
        engine.start();
    }

    // Applies the front brakes by calling the brake method on the front brake
    public void frontBrake(){
        front.brake();
    }

    // Applies the rear brakes by calling the brake method on the rear brake
    public void rearBrake(){
        rear.brake();
    }

    // Stops the car's engine by calling the stop method on the engine
    public void stop(){
        engine.stop();
    }

    // Accelerates the car by calling the accelerate method on the engine
    public void accelerate(){
        engine.accelerate();
    }

    // Starts the music system by calling the start method on the media player
    public void startMusic(){
        media.start();
    }

    // Stops the music system by calling the stop method on the media player
    public void stopMusic(){
        media.stop();
    }

    // Upgrades the engine to an ElectricEngine
    public void upgradeEngine(){
        this.engine = new ElectricEngine();  // Replaces the current engine with an ElectricEngine
    }
}
