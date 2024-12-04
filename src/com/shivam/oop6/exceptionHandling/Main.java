package com.shivam.oop6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5; // Dividend
        int b = 0; // Divisor

        // First try-catch block to handle ArithmeticException during division
        try {
            int c = a / b; // This will throw ArithmeticException as b is 0
        } catch (ArithmeticException e) {
            // Catch block to handle the exception and print the exception message
            System.out.println(e.getMessage());
        } finally {
            // Finally block will always be executed, regardless of whether an exception occurs
            System.out.println("This will always be executed");
        }

        // Second try-catch block, demonstrating throwing and handling a custom exception
        try {
            divide(a, b); // Calls the divide method, which throws an exception if b == 0
        } catch (ArithmeticException e) {
            // Catch block to handle the exception thrown by the divide method
            System.out.println(e.getMessage());
        } finally {
            // Finally block ensures cleanup or final execution
            System.out.println("This will always be executed");
        }

        // Try block for registering a user with age 15 (invalid case)
        try {
            registerUser(15); // Attempt to register a user with age 15
        } catch (MyException e) {
            // Catch block handles the custom exception thrown for invalid age
            System.out.println("Registration Failed: " + e.getMessage());
        }

        // Try block for registering a user with age 20 (valid case)
        try {
            registerUser(20); // Attempt to register a user with age 20
            System.out.println("Registration Successful!");
        } catch (MyException e) {
            // Catch block will execute only if an exception is thrown
            System.out.println("Registration Failed: " + e.getMessage());
        }
    }

    /**
     * Method to perform division with exception handling.
     * Throws an ArithmeticException if the divisor is 0.
     *
     * @param a Dividend
     * @param b Divisor
     * @return Result of the division
     * @throws ArithmeticException if b is 0
     */
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Throwing an exception with a custom error message
            throw new ArithmeticException("Please do not divide by 0");
        }
        return a / b; // Returns the result of division if no exception occurs
    }

    /**
     * Method to register a user. Throws an exception if the user's age is less than 18.
     *
     * @param age Age of the user
     * @throws MyException if the user's age is below 18
     */
    static void registerUser(int age) throws MyException {
        if (age < 18) {
            // Throwing a custom exception for invalid age
            throw new MyException("Age must be 18 or older to register.");
        }
        // If the age is valid, print a success message
        System.out.println("User registered successfully with age: " + age);
    }
}
