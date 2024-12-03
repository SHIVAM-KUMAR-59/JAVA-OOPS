package com.shivam.oop5.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void career() {
        System.out.println("Implementing abstract method for career, I am going to be a doctor" );
    }

    @Override
    void partner() {
        System.out.println("Implementing abstract method for partner. I love Superman" );
    }
}
