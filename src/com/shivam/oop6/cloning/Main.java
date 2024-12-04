package com.shivam.oop6.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human one = new Human(34, "First");
        // Human twin = new Human(one);

        Human twin = (Human)(one.clone());
        System.out.println(twin.age + " " + twin.name);
    }


}
