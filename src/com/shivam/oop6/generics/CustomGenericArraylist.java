package com.shivam.oop6.generics;

import java.util.Arrays;

public class CustomGenericArraylist<T> {

    // Internal data array to store elements (uses Object for generic type support)
    private Object[] data;

    // Default size of the array when initialized
    private static int DEFAULT_SIZE = 10;

    // Keeps track of the number of elements in the list
    private int size = 0;

    /*
    Constructor to initialize the array with the default size.
    We use Object[] because Java does not allow creating arrays of a generic type directly.
    */
    public CustomGenericArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    /*
    Checks if the internal array is full.
    Returns true if the current size is equal to the length of the data array.
    */
    private boolean isFull() {
        return size == data.length;
    }

    /*
    Doubles the size of the internal array when it's full.
    Creates a new array, copies all elements from the old array to the new array, and replaces the old array.
    */
    private void resize() {
        Object[] temp = new Object[data.length * 2]; // New array with double the size

        // Copying elements from the old array to the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = (T) (data[i]);
        }

        // Replace the old array with the new array
        data = temp;
    }

    /*
    Adds a new element to the list.
    Resizes the array if it's full, then adds the element at the next available position.
    */
    public void add(T num) {
        if (this.isFull()) {
            resize(); // Double the array size if needed
        }
        data[size++] = num; // Add the element and increment the size
    }

    /*
    Removes and returns the last element in the list.
    Decreases the size counter and returns the last element.
    */
    public T remove() {
        T removed = (T) (data[--size]); // Retrieve the last element and decrement the size
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
    Returns the number of elements in the list.
    */
    public int size() {
        return size;
    }

    /*
    Updates the value at a specific index in the list.
    This method can be used to change an element after it has been added.
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
        return "CustomGenericArraylist{" +
                "data=" + Arrays.toString(data) + // Convert the array to a string
                ", size=" + size +
                '}';
    }

    /*
    Main method to demonstrate the functionality of the CustomGenericArraylist class.
    */
    public static void main(String[] args) {
        // Create a CustomGenericArraylist for integers
        CustomGenericArraylist<Integer> customList = new CustomGenericArraylist<>();

        // Add some elements
        customList.add(20);
        customList.add(10);
        System.out.println(customList); // Display the list

        // Add more elements to test resizing
        for (int i = 2; i < 15; i++) {
            customList.add(2 * i);
        }

        // Display the list after adding more elements
        System.out.println(customList);
    }
}
