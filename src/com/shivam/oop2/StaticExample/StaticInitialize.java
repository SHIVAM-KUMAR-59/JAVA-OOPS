package com.shivam.oop2.StaticExample;

// This is a demo to show initialization of static variables
public class StaticInitialize {
    static int a = 4;
    static int b;

    // Will only run once when the first object is created, i.e, when the class is called for the first time
    static{
        System.out.println("Hello from static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialize obj = new StaticInitialize();
        System.out.println(StaticInitialize.a );
        System.out.println(StaticInitialize.b );

        StaticInitialize.b += 3;

        StaticInitialize newObj = new StaticInitialize();
        System.out.println(StaticInitialize.b);
    }
}
