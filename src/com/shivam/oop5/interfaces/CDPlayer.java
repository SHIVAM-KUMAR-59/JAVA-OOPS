package com.shivam.oop5.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("CD Player Start");
    }

    @Override
    public void stop() {
        System.out.println("CD Player Stop");
    }
}
