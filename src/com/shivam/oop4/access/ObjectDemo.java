package com.shivam.oop4.access;

// A class to demonstrate the usage and overriding of methods from the Object class.
public class ObjectDemo {

    // Default constructor for the ObjectDemo class.
    // Calls the constructor of the superclass (Object class) implicitly.
    public ObjectDemo() {
        super(); // Explicit call to the Object class's constructor (not mandatory as it is implied).
    }

    // Overrides the hashCode method from the Object class.
    // This method returns the hash code value for the object, which is used in hash-based collections like HashMap.
    @Override
    public int hashCode() {
        return super.hashCode(); // Calls the default hashCode implementation from the Object class.
    }

    // Overrides the equals method from the Object class.
    // This method compares the current object with another object for equality.
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Calls the default equals implementation from the Object class.
    }

    // Overrides the clone method from the Object class.
    // This method creates and returns a copy (shallow copy) of the object.
    // Note: This requires the class to implement the Cloneable interface.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls the default clone implementation from the Object class.
    }

    // Overrides the toString method from the Object class.
    // This method returns a string representation of the object.
    @Override
    public String toString() {
        return super.toString(); // Calls the default toString implementation from the Object class.
    }
}
