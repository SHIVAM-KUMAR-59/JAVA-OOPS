package com.shivam.oop6.generics.comparision;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating multiple Student objects with roll numbers and marks
        Student student1 = new Student(12, 89.76f);
        Student student2 = new Student(5, 99.52f);
        Student student3 = new Student(2, 95.52f);
        Student student4 = new Student(13, 77.52f);
        Student student5 = new Student(6, 96.52f);

        // Adding all students to an array
        Student[] list = {student1, student2, student3, student4, student5};

        // Printing the list of students before sorting
        System.out.println(Arrays.toString(list));

        // Sorting the array using Arrays.sort(). This requires the Student class to implement Comparable.
        Arrays.sort(list);

        // Printing the list of students after sorting
        System.out.println(Arrays.toString(list));

        /*
        The following comparison will give a compile-time error because Java does not know
        how to compare two Student objects by default. To fix this, the Student class
        implements the Comparable interface to define custom comparison logic.

        if(student1 > student2){
            System.out.println("Student 1 has more marks");
        }
        */

        // Comparing two students using the compareTo() method defined in the Student class
        if (student1.compareTo(student2) < 0) {
            System.out.println("Student 2 has more marks");
        } else if (student1.compareTo(student2) > 0) {
            System.out.println("Student 1 has more marks");
        } else {
            System.out.println("Both have equal marks");
        }
    }
}
