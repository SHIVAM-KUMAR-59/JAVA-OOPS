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

        // ------- Before Constructor -------
        // System.out.println(one.name + " with roll number " + one.rollNo + " got " + one.marks); // Will print the default values
        // one.rollNo = 10;
        // one.name = "Shivam";
        // one.marks = 98;
        // System.out.println(one); // Will print a random value
        // System.out.println(one.name + " with roll number " + one.rollNo + " got " + one.marks); // Will print the assigned values

        // ------- After Constructor --------
        Student two = new Student(12, "Pihu", 75);
        System.out.println(two.name + " with roll number " + two.rollNo + " got " + two.marks);

        two.greeting(); // Will print Pihu
        two.changeName("Mauli");
        two.greeting(); // Will print Mauli

        // New student created using the overloaded constructor
        Student random = new Student(two);
        System.out.println(random.name + " with roll number " + random.rollNo + " got " + random.marks); // Will print two's values
    }
}

// Create a class, here, every single student or object created from this class has rollNo, names and marks
class Student {
    int rollNo;
    String name;
    float marks;

    // Empty Constructor
    Student (){
        System.out.println("Hello");
    }

    // Function to greet
    void greeting(){
        System.out.println("Hello " + this.name);
    }

    // Function to change name
    void changeName(String newName){
        this.name = newName;
    }

    // An overloaded constructor with a different parameter than others
    Student (Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rollNo = other.rollNo;
    }

    // Parameterized Constructor
    Student (int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
