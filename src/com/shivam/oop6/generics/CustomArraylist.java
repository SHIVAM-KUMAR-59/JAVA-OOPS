package com.shivam.oop6.generics;

import java.util.Arrays;

public class CustomArraylist {

    // Internal array to store the elements
    private int[] data;
    // Default initial capacity of the array
    private static int DEFAULT_SIZE = 10;
    // The current number of elements in the array
    private int size = 0;

    // Constructor to initialize the array with the default size
    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    // Method to check if the array is full
    private boolean isFull() {
        return size == data.length;
    }

    // Method to resize the array when it's full
    private void resize() {
        // Create a new array with double the current size
        int[] temp = new int[data.length * 2];

        // Copy the current items into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        // Replace the old array with the new one
        data = temp;
    }

    // Method to add a new element to the array
    public void add(int num) {
        // Resize if the array is full
        if (this.isFull()) {
            resize();
        }
        // Add the element and increment the size
        data[size++] = num;
    }

    // Method to remove the last element from the array
    public int remove() {
        // Decrement the size and return the removed element
        int removed = data[--size];
        return removed;
    }

    // Method to get an element at a specific index
    public int get(int index) {
        return data[index];
    }

    // Method to get the current size of the array (number of elements)
    public int size() {
        return size;
    }

    // Method to update the value at a specific index
    public void set(int index, int value) {
        data[index] = value;
    }

    // Override the toString method to display the array contents
    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    // Main method to test the CustomArraylist functionality
    public static void main(String[] args) {
        CustomArraylist customList = new CustomArraylist();

        // Add some elements to the list
        customList.add(20);
        customList.add(10);
        System.out.println(customList);

        // Add more elements to exceed the default size and trigger resizing
        for (int i = 2; i < 15; i++) {
            customList.add(2 * i);
        }

        // Display the final list
        System.out.println(customList);
    }
}
