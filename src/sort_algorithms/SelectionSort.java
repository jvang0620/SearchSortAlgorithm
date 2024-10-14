package src.sort_algorithms;

import src.algorithmsInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Selection Sort algorithm.
 * Selection Sort works by dividing the array into two parts:
 * 1. Sorted part at the beginning.
 * 2. Unsorted part at the end.
 * In each iteration, it finds the minimum element in the unsorted part
 * and swaps it with the first element of the unsorted part, effectively
 * extending the sorted part.
 *
 * Time Complexity: O(n^2) - Quadratic time complexity.
 * Space Complexity: O(1) - Constant space complexity as it only requires
 * a constant amount of additional memory.
 *
 */
public class SelectionSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Traverse through the entire array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
