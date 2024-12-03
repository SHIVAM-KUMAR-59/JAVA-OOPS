package com.shivam.oop5.abstractDemo;

// Subclass `Son` extends the abstract class `Parent`
// Subclasses of abstract classes must provide implementations for all abstract methods defined in the parent class.
public class Son extends Parent {

    // Constructor for the subclass `Son`
    // Calls the constructor of the abstract superclass `Parent` using `super(age)`
    public Son(int age) {
        super(age); // Passes the `age` parameter to the constructor of `Parent`
        // The `age` field is already initialized by the superclass constructor,
        // so explicitly assigning `this.age = age` is not required.
    }

    // Overriding the abstract method `career` from the `Parent` class
    @Override
    void career() {
        // Providing a specific implementation for the abstract method
        System.out.println("Implementing abstract method for career, I am going to be a doctor");
    }

    // Overriding the abstract method `partner` from the `Parent` class
    @Override
    void partner() {
        // Providing a specific implementation for the abstract method
        System.out.println("Implementing abstract method for partner. I love Superman");
    }
}
