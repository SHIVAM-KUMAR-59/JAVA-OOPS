package com.shivam.oop5.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void career() {
        System.out.println("Implementing abstract method for career, I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("Implementing abstract method for partner. I love Ironman");
    }
}
