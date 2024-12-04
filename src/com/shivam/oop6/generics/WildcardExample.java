package com.shivam.oop6.generics;

import java.util.Arrays;

public class WildcardExample<T extends Number> { // Generic class that works with types extending Number (e.g., Integer, Float)

    private Object[] data; // Internal array to store elements of type T
    private static int DEFAULT_SIZE = 10; // Default size of the array when initialized
    private int size = 0; // Keeps track of the number of elements in the array

    /*
    Constructor to initialize the internal array.
    Uses Object[] because Java does not allow creating arrays of generic types directly.
    */
    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    /*
    Checks if the internal array is full.
    Returns true if the current size equals the array's length.
    */
    private boolean isFull() {
        return size == data.length;
    }

    /*
    Doubles the size of the internal array when it becomes full.
    Creates a new array, copies all elements from the old array to the new array, and replaces the old array.
    */
    private void resize() {
        Object[] temp = new Object[data.length * 2]; // Create a new array with double the size

        // Copy elements from the old array to the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = (T) (data[i]); // Cast to generic type T
        }

        data = temp; // Replace the old array with the new array
    }

    /*
    Adds a new element to the list.
    Resizes the array if it is full, then adds the element to the next available position.
    */
    public void add(T num) {
        if (this.isFull()) {
            resize(); // Resize the array when full
        }
        data[size++] = num; // Add the element and increment the size
    }

    /*
    Removes and returns the last element in the list.
    Decrements the size counter and returns the last element as type T.
    */
    public T remove() {
        T removed = (T) (data[--size]); // Retrieve and remove the last element
        return removed;
    }

    /*
    Retrieves the element at the specified index.
    Returns the element as type T.
    */
    public T get(int index) {
        return (T) (data[index]);
    }

    /*
    Returns the number of elements currently in the list.
    */
    public int size() {
        return size;
    }

    /*
    Updates the value at a specific index in the list.
    Note: The value is cast to Object and may cause issues if the type is not compatible.
    */
    public void set(int index, int value) {
        data[index] = value;
    }

    /*
    Overrides the toString() method to provide a string representation of the list.
    Displays the internal data array and the current size.
    */
    @Override
    public String toString() {
        return "WildcardExample{" +
                "data=" + Arrays.toString(data) + // Converts the array to a string for readability
                ", size=" + size +
                '}';
    }

    /*
    Main method to demonstrate the functionality of the WildcardExample class.
    */
    public static void main(String[] args) {
        // Create an instance of WildcardExample for Integer type
        WildcardExample<Integer> customList = new WildcardExample<>();

        // Add some elements
        customList.add(20);
        customList.add(10);
        System.out.println(customList); // Display the list

        // Add more elements to test resizing
        for (int i = 2; i < 15; i++) {
            customList.add(2 * i); // Add multiples of 2
        }

        /*
        customList.add("string");
        This will cause a compile-time error because the type is restricted to subclasses of Number.
        Strings are not allowed in this list.
        */

        // Display the list after adding more elements
        System.out.println(customList);
    }
}
