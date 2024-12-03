package com.shivam.oop5.interfaces.extendDemo;

public class Main implements B{

    // Since Main implements B and B extends A, we need to define both the methods in A and B
    @Override
    public void greet() {
        System.out.println("Greet Function");
    }

    @Override
    public void fun() {
        System.out.println("Fun Function");
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Calling the functions
        main.fun();
        main.greet();
    }
}
