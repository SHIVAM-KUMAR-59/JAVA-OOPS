package com.shivam.oop3.inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a default box (dimensions set to -1)
        Box box = new Box();
        System.out.println("Uninitialized box: " + box.length + " " + box.height + " " + box.width);

        // Create a cube (all dimensions set to the same value, e.g., 4)
        Box cube = new Box(4);
        System.out.println("Cube: " + cube.length + " " + cube.height + " " + cube.width);

        // Create a copy of the cube using the copy constructor
        Box copy = new Box(cube);
        System.out.println("Copy of Cube: " + copy.length + " " + copy.height + " " + copy.width);

        // Create a cuboid with specific dimensions (e.g., length=4, height=2, width=3)
        Box cuboid = new Box(4, 2, 3);
        System.out.println("Cuboid: " + cuboid.length + " " + cuboid.height + " " + cuboid.width);

        // Create a box with weight using the subclass BoxWeight
        // This tests inheritance, where BoxWeight inherits properties from Box
        BoxWeight box1 = new BoxWeight();
        System.out.println("Uninitialized box with weight: "
                + box1.length + " " + box1.height + " " + box1.width + " " + box1.weight);
    }
}
