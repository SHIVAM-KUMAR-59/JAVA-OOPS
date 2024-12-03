package com.shivam.oop5.interfaces.nested;

public class A {
    // Nested Interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

