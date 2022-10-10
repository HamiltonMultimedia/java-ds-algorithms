package com.algorithms;

public class LogarithmicTime {
    // O(log n) = Logarithmic Time implemented with a recursive Binary Search algorithm.
    // Public Function for a clean aesthetic.
    public int recursiveBinaryS(int[] array, int target) {
        return recursiveBinaryS(array, target, 0, array.length - 1);
    }
    // Private Function that does all the dirty work. LOL :P
    private int recursiveBinaryS(int [] array, int target, int left, int right) {
        // This line checks if the right partition is empty.
        if (right < left)
            // If yes then we return -1 to indicate that the query can't be located.
            return -1;
        // This line finds the middle of the array.
        int middle = (left + right) /2;
        // This line returns the location of the query for if it's found.
        if (array[middle] == target)
            return middle;
        // This line searches in middle for the query.
        if (target < array[middle])
            // This line calls the function recursively and searches in the left partition.
            return recursiveBinaryS(array, target, left, middle - 1);
        // This line calls the function recursively and searches in the right partition.
        return recursiveBinaryS(array, target, middle + 1, right);
    }
}
