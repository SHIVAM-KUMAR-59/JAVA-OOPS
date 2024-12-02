package com.shivam.oop3.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Uninitialized box: " + box.length + " " + box.height + " " + box.width);

        Box cube = new Box(4);
        System.out.println("Cube: " + cube.length + " " + cube.height + " " + cube.width);

        Box copy = new Box(cube);
        System.out.println("Copy of Cube: " + copy.length + " " + copy.height + " " + copy.width);

        Box cuboid = new Box(4, 2, 3);
        System.out.println("Cuboid: " + cuboid.length + " " + cuboid.height + " " + cuboid.width);

        BoxWeight box1 = new BoxWeight();
        System.out.println("Uninitialized box: " + box1.length + " " + box1.height + " " + box1.width + " " + box1.weight);
    }
}
