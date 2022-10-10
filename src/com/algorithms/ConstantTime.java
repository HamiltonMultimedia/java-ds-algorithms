package com.algorithms;

public class ConstantTime {
    public void log(int[] numbers) {
        // O(1) = Constant Time
        System.out.println(numbers[0]);
    }

    public void log2(int[] numbers) {
        // O(2) = Constant Time
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }
}
