package com.shivam.oop2.packages.a;

// Importing a static method from another package
import static com.shivam.oop2.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        // Printing a message from the current class
        System.out.println("Hello from package 'a'");

        // Calling the static method 'message()' from the imported package 'b'
        message();
    }
}
