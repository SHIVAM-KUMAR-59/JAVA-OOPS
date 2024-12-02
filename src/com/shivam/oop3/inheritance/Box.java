package com.shivam.oop3.inheritance;

public class Box {
    double length, height, width;

    Box() {
        this.height = this.length = this.width = -1;
    }

    // Create a Cube
    Box (double side){
        this.height = this.length = this.width = side;
    }

    // Create a Cuboid
    Box (double length, double height, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    // Copy Constructor
    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    // Function to display the box
    public void displayInfo(){
        System.out.println("Displaying the box");
    }
}
