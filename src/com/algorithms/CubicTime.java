package com.algorithms;

public class CubicTime {

    public static void log(int[] numbers) {
        // O(n^3) = Cubic Time
        for (int first : numbers) {
            for (int second : numbers) {
                for (int third : numbers) {
                    System.out.println(first + ", " + second);
                }
            }
        }
    }
}
