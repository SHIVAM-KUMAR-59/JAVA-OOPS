package com.shivam.oop2.Singleton;

public class Singleton {
    // Instance variable for the Singleton class
    private int num = 0;

    // Private constructor ensures that no other class can directly instantiate this class.
    private Singleton() {
        // Constructor is intentionally empty to prevent instantiation from outside.
    }

    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Public static method to provide access to the Singleton instance
    public static Singleton getInstance() {
        // Check if the instance is null (i.e., not created yet)
        if (instance == null) {
            // Create a new instance of the Singleton class
            instance = new Singleton();
        }
        // Return the single instance of the class
        return instance;
    }
}
