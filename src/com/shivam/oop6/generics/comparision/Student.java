package com.shivam.oop6.generics.comparision;

public class Student implements Comparable<Student> {
    // Instance variables to store roll number and marks of the student
    int roll;
    float marks;

    // Constructor to initialize the Student object with roll number and marks
    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    // Overriding the toString() method to provide a custom string representation of the Student object
    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll + // Display the roll number
                ", marks=" + marks + // Display the marks
                '}';
    }

    // Implementing the compareTo() method from the Comparable interface
    @Override
    public int compareTo(Student old) {
        // Calculate the difference between the marks of the current object and the given object
        int diff = (int)(this.marks - old.marks);

        /*
        Explanation of the comparison result:
        - If diff == 0: Both students have equal marks.
        - If diff < 0: The "old" student has more marks.
        - If diff > 0: The current student (this) has more marks.
        */
        return diff;
    }
}
