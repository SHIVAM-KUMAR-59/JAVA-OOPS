package com.shivam.oop3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shapes square1 = new Square();
        // Method Overloading thus prints This function calculates the area of square
        square1.area();
    }
}
