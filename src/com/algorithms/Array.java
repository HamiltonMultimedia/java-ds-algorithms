package com.algorithms;

public class Array {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.indexOf(40);
        numbers.updateAt(3, 50);
        numbers.indexOf(40);
    }
    private int[] items;
    private int count;
    private int num;

    public Array(int length) {
        items = new int [length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; ++i)
                newItems[i] = items[i];

            // Set "items" to this new array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }

    public void updateAt(int index, int num) {
        // Function takes 2 int arguments
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        //Change array element at it's index
        items[index] = num;
        System.out.println("Numbers array is updated at index " + index);
        System.out.println("With a value of " + num);
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        // [10, 20, 30, 40] will become [10, 30, 40]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count ; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        // If we find the item, return the index
        // Otherwise, return -1
        // O(1) Best case
        // O(n) Worst case
        for (int i = 0; i < count; i++) {
            if (items[i] == item) 
                // return i;
                System.out.println("The index is " + i + " for item: " + item);
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; ++i)
            System.out.println(items[i]);
    }
}
