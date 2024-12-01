package com.shivam.oop2.StaticExample;

public class Main {
    public static void main(String[] args) {

        // Creating instances of the Human class with different attributes
        Human shivam = new Human(20, "Shivam", 120000, false);
        Human pihu = new Human(20, "Pihu", 130000, false);
        Human mauli = new Human(20, "Mauli", 120000, true);

        // Accessing the static member 'population' using different instances
        // All instances will share the same value for static variable 'population'
        System.out.println(shivam.population);
        System.out.println(pihu.population);
        System.out.println(mauli.population);

        fun();

    }

    // Static method
    static void fun() {
        // greeting();
        // This will give an error because 'greeting()' is a non-static method,
        // and non-static methods belong to an instance of the class, not the class itself.

        /*
        * You cannot access non-static stuff without referencing their instances in a static context,
        * hence here we can use the 'greeting' method by referencing it by the 'Main' class
        */
        Main obj = new Main();
        obj.greeting();
    }

    // Non-static method
    void greeting() {
        System.out.println("Hello World");

        // Calling a static method from a non-static context
        // This is allowed because static methods are class-level members and accessible globally.
        fun();
    }

}
