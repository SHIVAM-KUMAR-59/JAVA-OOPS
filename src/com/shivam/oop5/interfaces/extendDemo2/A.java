package com.shivam.oop5.interfaces.extendDemo2;

public interface A {

    // static void method(); This will giver error because since static methods cannot be inherited, it needs to have a body

    static void method(){
        System.out.println("Static method in class A");
    }

    default void fun(){
        System.out.println("Default function in class A");
    }
}
