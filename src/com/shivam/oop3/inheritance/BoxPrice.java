package com.shivam.oop3.inheritance;

// BoxPrice is a subclass of BoxWeight, extending the functionality with cost
public class BoxPrice extends BoxWeight {
    // Additional property to store the cost of the box
    double cost;

    // Default constructor for BoxPrice
    BoxPrice() {
        super(); // Calls the default constructor of the BoxWeight class
        this.cost = -1; // Initializes cost to -1 to indicate an uninitialized state
    }

    // Copy constructor for BoxPrice
    BoxPrice(BoxPrice other) {
        super(other);
        // Calls the copy constructor of the BoxWeight class to copy inherited properties

        this.cost = other.cost;
        // Copies the cost value from the passed BoxPrice object
    }

    // Parameterized constructor to initialize all dimensions, weight, and cost
    public BoxPrice(double length, double height, double width, double weight, double cost) {
        super(length, height, width, weight);
        // Calls the parameterized constructor of the BoxWeight class to initialize dimensions and weight

        this.cost = cost;
        // Sets the cost property specific to the BoxPrice subclass
    }

    // Parameterized constructor for creating a BoxPrice object using a side length (cube), weight, and cost
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        // Calls the parameterized constructor of the BoxWeight class to initialize a cube with a given side and weight

        this.cost = cost;
        // Sets the cost property specific to the BoxPrice subclass
    }
}
