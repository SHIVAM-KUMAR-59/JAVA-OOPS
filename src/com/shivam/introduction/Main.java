package com.shivam.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Store 5 roll no
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // Data of 5 Students: {rollNo, name, marks}
        int[] rollNo = new int[3];
        String[] name = new String[3];
        float[] marks = new float[3];

        // Using the Student class we made
        Student[] students = new Student[5];

        Student one; // Declaring a reference variable to an object of type Student

        //  System.out.println(Arrays.toString(students)); // Will give null because we have not initialised it yet, we have just declared it

        one = new Student(); // Dynamically allocated the memory at run time and returns a reference variable to it
        System.out.println(one.name + " with roll number " + one.rollNo + " got " + one.marks); // Will print the default values
        one.rollNo = 10;
        one.name = "Shivam";
        one.marks = 98;
        System.out.println(one); // Will print a random value
        System.out.println(one.name + " with roll number " + one.rollNo + " got " + one.marks); // Will print the assigned values
    }
}

// Create a class, here, every single student or object created from this class has rollNo, names and marks
class Student {
    int rollNo;
    String name;
    float marks;
}