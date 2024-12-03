package com.shivam.oop5.abstractDemo;

public class Main {
    public static void main(String[] args) {

        // Parent dad = new Parent(); This will give error because abstract classes cannot be instantiated

        Son son = new Son(30);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(28);
        daughter.career();
        daughter.partner();
    }
}
