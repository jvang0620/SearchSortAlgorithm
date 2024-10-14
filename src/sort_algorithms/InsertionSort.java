package src.sort_algorithms;

import src.helperInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Insertion Sort algorithm.
 * Insertion Sort is a simple sorting algorithm that builds the final sorted
 * array
 * one element at a time. It is much less efficient on large lists than more
 * advanced
 * algorithms such as quicksort, heapsort, or merge sort.
 *
 * Time Complexity:
 * - Best Case: O(n) - When the array is already sorted.
 * - Average Case: O(n^2) - When elements are in random order.
 * - Worst Case: O(n^2) - When elements are in reverse order.
 * Space Complexity: O(1) - Constant space complexity.
 *
 * @param array The array to be sorted.
 */
public class InsertionSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Start iterating from the second element (index 1) to the end of the array
        for (int i = 1; i < n; ++i) {
            // Store the current element in a variable called key
            int key = array[i];

            // Initialize a variable j to the previous index of the current element
            int j = i - 1;

            // Move elements of the array that are greater than key to one position ahead
            // of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            // Place the key at its correct position in the sorted array
            array[j + 1] = key;
        }
    }
}
