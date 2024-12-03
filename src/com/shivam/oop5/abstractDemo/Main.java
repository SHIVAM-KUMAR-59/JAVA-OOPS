package com.shivam.oop5.abstractDemo;

public class Main {
    public static void main(String[] args) {

        // The following line would result in a compilation error because abstract classes cannot be instantiated directly:
        // Parent dad = new Parent();

        // Creating an instance of the `Son` class
        Son son = new Son(30);
        son.career(); // Calls the overridden `career` method in the `Son` class
        son.partner(); // Calls the overridden `partner` method in the `Son` class

        // Creating an instance of the `Daughter` class
        Daughter daughter = new Daughter(28);
        daughter.career(); // Calls the overridden `career` method in the `Daughter` class
        daughter.partner(); // Calls the overridden `partner` method in the `Daughter` class

        // Calling the static `Greeting` method from the abstract class `Parent`
        Parent.Greeting();

        // Demonstrating polymorphism:
        // Using an abstract class reference (`Parent`) to refer to an instance of the concrete subclass (`Son`)
        Parent child = new Son(25); // This is allowed
        child.normal(); // Calls the `normal` method defined in the `Parent` class
        child.partner(); // Calls the overridden `partner` method in the `Son` class
        child.career(); // Calls the overridden `career` method in the `Son` class
    }
}
