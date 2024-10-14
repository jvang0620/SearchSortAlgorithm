package src.sort_algorithms;

import src.algorithmsInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Bubble Sort algorithm.
 * Bubble Sort is a simple comparison-based sorting algorithm that repeatedly
 * steps through the list, compares adjacent elements, and swaps them if they
 * are in the wrong order. This process is repeated for each element in the list
 * until the entire list is sorted.
 *
 * Time Complexity:
 * - Best Case: O(n) (when the array is already sorted)
 * - Average Case: O(n^2)
 * - Worst Case: O(n^2)
 * Space Complexity: O(1) - Constant space complexity.
 *
 */
public class BubbleSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Outer loop iterates over each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop iterates over the unsorted part of the array
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
