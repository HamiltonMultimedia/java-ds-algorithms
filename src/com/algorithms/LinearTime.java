package com.algorithms;

public class LinearTime {
    public static void log(int[] numbers) {
        // O(n) = Linear Time
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void log2(int[] numbers) {
        // Example with 2 loops
        // O(2n) = Linear Time
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void log3(int[] numbers, String[] names) {
        // Example with 2 loops of different types
        // O(n + m) = Linear Time
        for (int number : numbers) {
            System.out.println(number);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
