package com.algorithms;

public class QuadraticTime {
    // Algorithm used to print all combinations of items in an array.
    public static void log(int[] numbers) {
        // O(n^2) = Quadratic Time
        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second);
            }
        }

    }

    public static void log2(int[] numbers) {
        // Example with extra loop
        // O(n + n^2) = Quadratic Time
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second);
            }
        }

    }
}
