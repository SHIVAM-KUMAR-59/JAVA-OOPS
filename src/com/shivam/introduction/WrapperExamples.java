package com.shivam.introduction;

public class WrapperExamples {
    public static void main(String[] args) {

        // Primitive data types
        int a = 10;
        int b = 20;

        // Wrapper classes for primitive types
        Integer num1 = 10; // Wrapper Class for int
        Integer num2 = 20;

        // Calling the swap method for primitive data types
        swap(a,b); // Will not swap it because it's passed by value (Java passes arguments by value, not by reference)
        System.out.println("Primitives swap: " + a + ' ' + b); // Original Values are printed because primitives are passed by value

        // Calling the swap method for Wrapper classes (Objects)
        swap(num1, num2); // Swap for Wrapper Classes
        System.out.println("Wrappers swap: " + num1 + ' ' + num2); // Swap doesn't actually change because it's passed by value too (Wrapper objects are immutable)

        // Example of final keyword with primitive type
        final int bonus = 2; // 'final' keyword makes the variable unchangeable
        // bonus = 10; // Uncommenting this line will give an error because final variables can't be reassigned.

        // Example of final keyword with object reference
        final A one = new A("one");
        one.name = "Other name"; // This is allowed: final makes the reference unchangeable, but the object it points to can still be modified.
        // one = new A("new Object"); // This would give an error because the reference 'one' cannot point to a new object after it's initialized.

    }

    // Swap method for primitive data types (doesn't actually swap due to pass-by-value)
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    // Swap method for Wrapper Classes (also doesn't swap because Wrapper classes are immutable and passed by value)
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    // Example class to demonstrate the 'final' keyword with object references
    static class A{
        // final variable, must be initialized either at the time of declaration or in the constructor
        final int num = 10; // This is correct because the final variable is initialized when declared

        String name; // Instance variable

        // Constructor that takes a String to initialize the 'name' field
        public A(String name) {
            this.name = name;
        }
    }
}
