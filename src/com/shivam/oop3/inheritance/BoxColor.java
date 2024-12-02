package com.shivam.oop3.inheritance;

// BoxColor extends BoxWeight and adds an additional property to store color
public class BoxColor extends BoxWeight {
    // Property to store the color of the box
    String color;

    // Constructor to initialize only the color
    public BoxColor(String color) {
        this.color = color; // Sets the color property
    }

    // Parameterized constructor to initialize all dimensions, weight, and color
    public BoxColor(double length, double height, double width, double weight, String color) {
        super(length, height, width, weight);
        // Calls the parameterized constructor of the BoxWeight class to initialize dimensions and weight

        this.color = color;
        // Sets the color property specific to the BoxColor subclass
    }

    // Parameterized constructor to create a cube with a given side, weight, and color
    public BoxColor(double side, double weight, String color) {
        super(side, weight);
        // Calls the parameterized constructor of the BoxWeight class to initialize a cube

        this.color = color;
        // Sets the color property specific to the BoxColor subclass
    }

    // Constructor to create a BoxColor object using an existing BoxWeight object and a color
    public BoxColor(BoxWeight other, String color) {
        super(other);
        // Calls the copy constructor of the BoxWeight class to copy the dimensions and weight

        this.color = color;
        // Sets the color property specific to the BoxColor subclass
    }
}
