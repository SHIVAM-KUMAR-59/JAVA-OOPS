package com.shivam.oop1;

public class WrapperExamples {
    public static void main(String[] args) {

        // Primitive data types
        int a = 10;
        int b = 20;

        // Wrapper classes for primitive types (Integer is the wrapper class for int)
        Integer num1 = 10; // Wrapper Class for int
        Integer num2 = 20;

        // Calling the swap method for primitive data types
        swap(a,b); // Will not swap because it's passed by value (Java passes arguments by value, not by reference)
        System.out.println("Primitives swap: " + a + ' ' + b); // Original values are printed because primitives are passed by value

        // Calling the swap method for Wrapper classes (Objects)
        swap(num1, num2); // Swap method for Wrapper Classes
        System.out.println("Wrappers swap: " + num1 + ' ' + num2); // Swap doesn't actually change because it's passed by value too (Wrapper objects are immutable)

        // Example of final keyword with primitive type
        final int bonus = 2; // 'final' keyword makes the variable unchangeable
        // bonus = 10; // Uncommenting this line will give an error because final variables can't be reassigned.

        // Example of final keyword with object reference
        final A one = new A("one");
        one.name = "Other name"; // This is allowed: final makes the reference unchangeable, but the object it points to can still be modified.
        // one = new A("new Object"); // This would give an error because the reference 'one' cannot point to a new object after it's initialized.

        // Creating a large number of objects to observe garbage collection
        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name"); // Creating new objects, which will eventually be garbage collected.
        }
    }

    // Swap method for primitive data types
    // Note: Java passes arguments by value, so this will not swap the values outside the method
    static void swap(int a, int b) {
        int temp = a; // Temporary variable to hold the value of 'a'
        a = b; // Set 'a' to the value of 'b'
        b = temp; // Set 'b' to the value of 'a' (which was held in temp)
    }

    // Swap method for Wrapper Classes
    // Same principle applies: Wrapper classes are immutable and passed by value, so the swap won't reflect outside
    static void swap(Integer a, Integer b) {
        Integer temp = a; // Temporary variable to hold the value of 'a'
        a = b; // Set 'a' to the value of 'b'
        b = temp; // Set 'b' to the value of 'a' (which was held in temp)
    }

    // Example class to demonstrate the 'final' keyword with object references
    static class A {
        // 'final' variable, must be initialized either at the time of declaration or in the constructor
        final int num = 10; // This is correct because the final variable is initialized when declared

        String name; // Instance variable to hold the name of the object

        // Constructor that takes a String to initialize the 'name' field
        public A(String name) {
            System.out.println("Object Created"); // Printing when an object is created
            this.name = name; // Assigning the name to the instance variable
        }

        // Override the finalize method to print a message when the object is garbage collected
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed"); // This will be printed when the object is about to be destroyed (garbage collected)
        }
    }
}
