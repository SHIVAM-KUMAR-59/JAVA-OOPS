package com.shivam.oop3.inheritance;

// Subclass BoxWeight extends the parent class Box
public class BoxWeight extends Box {
    // Additional property to store the weight of the box
    double weight;

    // Default constructor for BoxWeight
    public BoxWeight() {
        super(); // Calls the default constructor of the parent class (Box)
        this.weight = -1; // Initialize weight to -1 to indicate an uninitialized state
    }

    // Parameterized constructor for BoxWeight
    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);
        // Calls the parent class constructor with length, height, and width
        // Initializes the dimensions using the parent class constructor

        this.weight = weight;
        // Sets the weight property specific to the BoxWeight subclass
    }
}
