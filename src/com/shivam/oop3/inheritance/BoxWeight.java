package com.shivam.oop3.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }


    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); // This calls the parent class constructor with 3 parameters used to initialize values present in parent class
        this.weight = weight;
    }

}
