package com.shivam.oop7.enums;

// Main class
public class Basic {

    // Enum declaration implementing the interface `A`
    enum Week implements A {

        /*
         These are called enum constants.
         - Each enum constant represents a singleton instance of the `Week` enum.
         - Enum constants are implicitly public, static, and final.
         - Since they are final, you cannot create child enums from this.
         - The type of these constants is `Week`.
        */
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        /*
         Enum constructors:
         - Enum constructors are always private or package-private.
         - You cannot make them public or protected, as we do not want to create
           additional instances of the enum constants.
         - The constructor is called exactly once for each enum constant at the time of class loading.
        */
        Week() {
            System.out.println("Constructor called for " + this);
        }

        // Overriding the method from the interface `A`
        @Override
        public void hello() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        // Declaring a variable of the enum type `Week`
        Week week;

        // Assigning an enum constant to the variable
        week = Week.Monday;

        // Printing the name of the enum constant
        System.out.println(week);

        // Calling the overridden method `hello` from the `Week` enum
        week.hello();

        // Printing the ordinal value of the enum constant
        // - The ordinal represents the position of the constant in the enum declaration, starting from 0.
        System.out.println(week.ordinal());

        // Iterating over all enum constants using `values()` method
        // - The `values()` method returns an array of all enum constants.
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
