package com.shivam.oop2.StaticExample;

public class Human {
    // Instance variables (specific to each object)
    int age;        // Age of the human
    String name;    // Name of the human
    int salary;     // Salary of the human
    boolean married; // Marital status of the human

    // Static variable (shared among all objects of the class)
    static long population; // Total population of humans, shared across all instances

    static void message(){
        System.out.println("Hello World");
        /*
        * We cannot use 'this' keyword in static methods because it represents an object but static is not dependent on object
        */
        // System.out.println(this.age); Therefore this is wrong and will give errors.
    }

    // Constructor to initialize a new Human object
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;          // Assigning age to the instance variable
        this.name = name;        // Assigning name to the instance variable
        this.salary = salary;    // Assigning salary to the instance variable
        this.married = married;  // Assigning marital status to the instance variable

        // Incrementing the static population variable for each new Human object created
        Human.population += 1;

        Human.message();
    }
}
