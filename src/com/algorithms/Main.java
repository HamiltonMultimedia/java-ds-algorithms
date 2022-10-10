package com.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
        int[] numbers = { 7, 3, 1, 5, 2 };
        var sorter = new QuickSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
//
//    public static void main(String[] names) {
//        int[] numbers = { 1, 3, 5, 6, 7 };
//        var search = new LogarithmicTime();
//        var index = search.recursiveBinaryS(numbers, 1);
//        System.out.println("Search query is located at index: " + index);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        // numbers.removeAt(4);
//        // System.out.println(numbers.indexOf(10)); When used with the return statement.
//        numbers.indexOf(30);
//        numbers.print();
//        // System.out.println("Hello world from algorithms!");
//        numbers.updateAt(3,50);
//        numbers.print();
//    }
//}
