package com.shivam.oop3.inheritance;

// Subclass BoxWeight extends the parent class Box
public class BoxWeight extends Box {
    // Additional property to store the weight of the box
    double weight;

    // Default constructor for BoxWeight
    public BoxWeight() {
        this.weight = -1; // Initialize weight to -1 to indicate an uninitialized state
        // this.length This will give error because it is declared as private and since is not accessible outside the file in which it was declared
    }

    // Parameterized constructor for BoxWeight
    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); // Calls the parent class constructor with length, height, and width Initializes the dimensions using the parent class constructor

        System.out.println("Height to parent Box class: " + super.height);
        this.weight = weight;
        // Sets the weight property specific to the BoxWeight subclass
    }

    // Parameterized constructor for BoxWeight
    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    // Copy Constructor
    public BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }
}
