package com.shivam.oop5.abstractDemo;

// final abstract classes are not allowed because abstract class have inherited class but final classes are not inherited by anyone
// thus there is a contradiction
// final public abstract class Parent is not allowed

public abstract class Parent {

    int age;
    final int VALUE;


    public Parent(int age) {
        this.age = age;
        VALUE = 3342; // Random
    }

    // abstract public Parent(); Abstract Constructors are not allowed

    // abstract static void methodName(); Abstract static methods are not allowed

    // Static method in abstract classes are allowed
    static void Greeting(){
        System.out.println("Hello from static method in Parent class");
    }

    // Normal methods are allowed as well
    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();
}
