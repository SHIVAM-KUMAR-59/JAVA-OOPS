package com.shivam.oop3.inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a default box (dimensions set to -1)
        Box box = new Box();

        // object.length will give error because length is declared as private and since is not accessible here
        System.out.println("Uninitialized box: " + /*box.length*/ " " + box.height + " " + box.width);

        // Create a cube (all dimensions set to the same value, e.g., 4)
        Box cube = new Box(4);
        System.out.println("Cube: " + /*cube.length*/ " " + cube.height + " " + cube.width);

        // Create a copy of the cube using the copy constructor
        Box copy = new Box(cube);
        System.out.println("Copy of Cube: " + /*copy.length*/ " " + copy.height + " " + copy.width);

        // Create a cuboid with specific dimensions (e.g., length=4, height=2, width=3)
        Box cuboid = new Box(4, 2, 3);
        System.out.println("Cuboid: " + /*cuboid.length*/ " " + cuboid.height + " " + cuboid.width);

        // Create a box with weight using the subclass BoxWeight
        // This tests inheritance, where BoxWeight inherits properties from Box
        BoxWeight box1 = new BoxWeight();
        System.out.println("Uninitialized box with weight: " + /*box1.length*/ " " + box1.height + " " + box1.width + " " + box1.weight);

        Box fun = new BoxWeight(2, 3, 4, 8);
        System.out.println(fun.width);
        /* System.out.println(fun.weight);
        This will give error because it is the type of reference variable and not the type of object
        that determines what members can be accessed.
        Here, fun is a reference type of Box, but it is referencing to BoxWeight, thus we can only access the variables
        that can be accessed by Box and not the variables present in BoxWeight
        */

        /*
        BoxWeight fun1 = new Box(3, 2, 1);
        This will give error because you are trying to reference a child to it's parent
         */

        // Creating a new object from a class which extends Box and BoxWeight class (Multiple Inheritance)
        BoxPrice price = new BoxPrice(5, 8, 200);
        System.out.println("Box with price: " + /*price.length*/ " " + price.height + " " + price.width + " " + price.weight);

        // Creating a new object from a class which extends Box and BoxWeight class now since both BoxColor and BoxPrice
        // are inheriting from BoxWeight, this is called Hierarchical Inheritance
        BoxColor color = new BoxColor(4, 10, 2, 3, "Blue");
        System.out.println("Box with color: " + /*color.length*/ " " + color.height + " " + color.width + " " + color.weight);

    }
}
