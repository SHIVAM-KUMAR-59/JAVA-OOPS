package com.shivam.oop6.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            arr.add(i);
        }

        // arr.forEach((item) -> System.out.println(item * 2 + " "));

        Consumer<Integer> table = (item) -> System.out.println(item * 2 + " ");
        arr.forEach(table);

        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, diff));
        System.out.println(myCalc.operate(5, 3, product));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}
