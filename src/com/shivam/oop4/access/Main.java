package com.shivam.oop4.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Random");
        // System.out.println(obj.num); Error because num is private variable in the class

        // We can use Getters and Setters to get the number
        System.out.println(obj.getNum());

        // `name` variable in the class is public and thus is accessible from anywhere
        System.out.println(obj.name);

        // If no access modifier, then default modifier is used, the variable is is not accessible in a different package
        // but is accessible in same package
    }
}
