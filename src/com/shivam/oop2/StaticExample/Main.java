package com.shivam.oop2.StaticExample;

public class Main {
    public static void main(String[] args) {

        Human shivam = new Human(20, "Shivam", 120000, false);
        Human pihu = new Human(20, "Pihu", 130000, false);

        System.out.println(shivam.population);
        System.out.println(pihu.population);
    }
}
