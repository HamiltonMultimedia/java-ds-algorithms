package com.algorithms;

public class Demo {
    private int[] items;
    private int count;

    public Demo(int length) {
        if (length <= 0)
            throw new IllegalStateException();

        items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }
}
