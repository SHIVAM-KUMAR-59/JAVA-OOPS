package com.shivam.oop4.access;

// Class A demonstrates encapsulation and provides constructors, fields, and methods to interact with its data.
public class A {

    // Private field, accessible only within this class.
    private int num;

    // Public field, accessible from anywhere.
    public String name;

    // Default (package-private) field, accessible within the same package.
    int[] arr;

    /**
     * Constructor for the A class.
     * Initializes the 'num' and 'name' fields and creates an array of size 'num'.
     *
     * @param num  The size of the array and the initial value for the 'num' field.
     * @param name The initial value for the 'name' field.
     */
    public A(int num, String name) {
        this.num = num; // Assigns the parameter value to the private field 'num'.
        this.name = name; // Assigns the parameter value to the public field 'name'.
        this.arr = new int[num]; // Initializes the array with the size specified by 'num'.
    }

    /**
     * Getter method for the private field 'num'.
     * Allows controlled access to the 'num' field from outside the class.
     *
     * @return The value of the 'num' field.
     */
    public int getNum() {
        return num;
    }

    /**
     * Setter method for the private field 'num'.
     * Allows controlled modification of the 'num' field from outside the class.
     *
     * @param num The new value to be set for the 'num' field.
     */
    public void setNum(int num) {
        this.num = num; // Updates the private field 'num' with the provided value.
    }
}
