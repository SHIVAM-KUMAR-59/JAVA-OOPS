package com.shivam.oop3.polymorphism;

public class Circle extends Shapes{

    @Override // This is called annotations, this is used to check whether a method is overridden or not
    void area(){
        System.out.println("This function calculates the area of circle");
    }

    // @Override Here this will give error because this method is not overridden because there is no method
    // with the same name, parameter and return type in the parent class or super class
    void diameter(){
        System.out.println("This function calculates the diameter os circle");
    }
}
