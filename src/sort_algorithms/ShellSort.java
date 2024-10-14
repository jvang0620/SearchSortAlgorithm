package src.sort_algorithms;

import src.helperInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Shell Sort algorithm.
 * Shell Sort is an in-place comparison-based sorting algorithm that uses a
 * sequence of increment values (gaps) to sort elements that are far apart,
 * gradually reducing the gap between elements until the entire array is sorted.
 *
 * Time Complexity:
 * - Best Case: O(n log n) (depends on the chosen gap sequence)
 * - Average Case: O(n^1.5) (depends on the chosen gap sequence)
 * - Worst Case: O(n^2) (depends on the chosen gap sequence)
 * Space Complexity: O(1) - Constant space complexity.
 *
 */
public class ShellSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Start with a large gap and gradually reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for elements at a specific gap
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                // Shift elements until the correct position for temp is found
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Place temp at its correct position
                array[j] = temp;
            }
        }
    }
}
