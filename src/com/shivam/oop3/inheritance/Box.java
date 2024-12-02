package com.shivam.oop3.inheritance;

public class Box {
    double length, height, width; // Dimensions of the box

    // Default constructor: Creates a box with default dimensions (-1 for all sides)
    Box() {
        this.height = this.length = this.width = -1; // Default value indicating no dimensions set
    }

    // Parameterized constructor: Creates a cube with equal sides
    Box(double side) {
        this.height = this.length = this.width = side; // All dimensions are set to the same value
    }

    // Parameterized constructor: Creates a cuboid with specified dimensions
    Box(double length, double height, double width) {
        this.height = height; // Set the height
        this.length = length; // Set the length
        this.width = width;   // Set the width
    }

    // Copy constructor: Creates a new box by copying the dimensions of an existing box
    Box(Box old) {
        this.height = old.height; // Copy height
        this.length = old.length; // Copy length
        this.width = old.width;   // Copy width
    }

    // Method to display information about the box
    public void displayInfo() {
        System.out.println("Displaying the box");
    }
}
