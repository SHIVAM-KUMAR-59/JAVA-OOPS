package com.shivam.oop5.abstractDemo;

// Abstract classes in Java can have abstract methods and concrete methods, but there are some restrictions:
// 1. `final abstract` classes are not allowed because:
//    - Abstract classes are meant to be extended.
//    - Final classes cannot be extended, which contradicts the purpose of an abstract class.
//    - Thus, `final public abstract class Parent` is not allowed.

public abstract class Parent {

    // Instance variable
    int age;

    // Final instance variable: must be initialized in the constructor or at declaration
    final int VALUE;

    // Constructor: Abstract classes can have constructors, which are called when their subclasses are instantiated
    public Parent(int age) {
        this.age = age; // Assigning value to the `age` variable
        VALUE = 3342;   // Final variables must be initialized, here it's set to a random value
    }

    // Abstract constructors are not allowed because constructors are never inherited
    // abstract public Parent(); // This is not allowed

    // Abstract static methods are not allowed because static methods belong to the class, not instances
    // abstract static void methodName(); // This is not allowed

    // Static methods in abstract classes are allowed
    static void Greeting() {
        System.out.println("Hello from static method in Parent class");
    }

    // Concrete methods (normal methods) are allowed in abstract classes
    void normal() {
        System.out.println("This is a normal method");
    }

    // Abstract methods: Must be implemented by subclasses
    abstract void career();

    abstract void partner();
}
