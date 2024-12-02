package com.shivam.oop3.polymorphism;

// Main class demonstrating Run-Time Polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating instances of different shape classes
        Shapes shape = new Shapes(); // Parent class instance
        Circle circle = new Circle(); // Subclass Circle instance
        Square square = new Square(); // Subclass Square instance

        // Invoking the area method using respective class instances
        shape.area(); // Calls the area method in the Shapes class
        circle.area(); // Calls the overridden area method in the Circle class
        square.area(); // Calls the overridden area method in the Square class

        // Demonstrating dynamic polymorphism or method overriding
        Shapes square1 = new Square(); // Parent class reference to a Square object
        square1.area(); // Calls the overridden area method in the Square class
    }
}
