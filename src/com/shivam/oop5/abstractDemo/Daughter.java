package com.shivam.oop5.abstractDemo;

// Subclass `Daughter` extends the abstract class `Parent`
// It provides concrete implementations for the abstract methods declared in the `Parent` class.
public class Daughter extends Parent {

    // Constructor for the subclass `Daughter`
    // Calls the constructor of the abstract superclass `Parent` using `super(age)`
    public Daughter(int age) {
        super(age); // Passes the `age` parameter to the constructor of `Parent`
        // The `age` field is already initialized by the superclass constructor,
        // so explicitly assigning `this.age = age` is not necessary.
    }

    // Overriding the abstract method `career` from the `Parent` class
    @Override
    void career() {
        // Providing a specific implementation for the abstract method
        System.out.println("Implementing abstract method for career, I am going to be a coder");
    }

    // Overriding the abstract method `partner` from the `Parent` class
    @Override
    void partner() {
        // Providing a specific implementation for the abstract method
        System.out.println("Implementing abstract method for partner. I love Ironman");
    }
}
