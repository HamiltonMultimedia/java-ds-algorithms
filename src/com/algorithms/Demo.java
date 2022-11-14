package com.algorithms;

public class Demo {
    private int[] items;
    private int count;

    public Demo(int length) {
        if (length <= 0)
            throw new IllegalStateException();

        items = new int[length];
    }
}