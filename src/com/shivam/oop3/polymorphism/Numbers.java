package com.shivam.oop3.polymorphism;

// This class demonstrates Compile-Time Polymorphism through Method Overloading
public class Numbers {

    // Method to calculate the sum of two integers
    int sum(int a, int b) {
        return a + b; // Adds two integers and returns the result
    }

    // Overloaded method to calculate the sum of three integers
    int sum(int a, int b, int c) {
        return a + b + c; // Adds three integers and returns the result
    }

    public static void main(String[] args) {
        Numbers number = new Numbers(); // Create an instance of the Numbers class

        // Call the sum method with two arguments
        int result1 = number.sum(10, 12); // Calls the first sum method
        System.out.println("Sum of 10 and 12: " + result1); // Output: Sum of 10 and 12: 22

        // Call the sum method with three arguments
        int result2 = number.sum(10, 12, 14); // Calls the overloaded sum method
        System.out.println("Sum of 10, 12, and 14: " + result2); // Output: Sum of 10, 12, and 14: 36
    }
}
