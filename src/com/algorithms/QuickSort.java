package com.algorithms;

public class QuickSort {
    // Public method to make the code cleaner and set the method's initial values
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    // Sets the Start & End boundaries of the array using the partition method below
    private void sort(int[] array, int start, int end) {
        if (start >= end)
            return;

        var boundary = partition(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }
    // Sets the pivot and partitions the array to define the boundaries using comparisons
    private int partition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundary = start - 1;
        for (var i = start; i <= end; i++)
            if (array[i] <= pivot) {
                swap(array, i, ++boundary);
            }
        return boundary;

    }
    // Swaps the array index position (a supporting function)
    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
