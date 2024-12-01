package com.shivam.oop2.Singleton;

public class Main {
    public static void main(String[] args) {
        // Attempting to create an object using the constructor will result in a compile-time error
        // because the constructor in the Singleton class is private.
        // Uncommenting the line below will cause an error:
        // Singleton obj = new Singleton();

        // Correct way to get the Singleton instance is by using the getInstance() method.
        // The getInstance() method ensures that only one instance of the Singleton class is created.
        Singleton obj1 = Singleton.getInstance();

        // Calling getInstance() again returns the same instance of the Singleton class.
        // Here, obj1, obj2, and obj3 will all reference the same instance.
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // You can verify that all the references (obj1, obj2, obj3) point to the same object
        // by checking their hash codes or using == operator.
    }
}
