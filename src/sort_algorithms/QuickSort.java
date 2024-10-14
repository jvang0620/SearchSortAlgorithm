package src.sort_algorithms;

import src.helperInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Quick Sort algorithm.
 * Quick Sort is a divide-and-conquer sorting algorithm that works by selecting
 * a pivot element and partitioning the other elements into two sub-arrays
 * according to whether they are less than or greater than the pivot.
 * The process is then recursively applied to the sub-arrays.
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n^2) (rare, if a bad pivot selection strategy is used)
 * Space Complexity: O(log n) - Recursive call stack.
 *
 */
public class QuickSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Recursive method for performing the Quick Sort algorithm on a sub-array.
     *
     * @param array The array to be sorted
     * @param low   The lower index of the sub-array
     * @param high  The higher index of the sub-array
     */
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Select a pivot and partition the array
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays on both sides of the pivot
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    /**
     * This method is responsible for selecting a pivot element and partitioning the
     * array into two halves such that elements smaller than the pivot are on the
     * left, and elements greater than the pivot are on the right.
     *
     * This partition method efficiently partitions the array based on the pivot and
     * returns the index of the pivot element after the partitioning.
     *
     * @param array The array to be partitioned
     * @param low   The lower index of the partition
     * @param high  The higher index of the partition
     * @return The index of the pivot element after partitioning
     */
    private int partition(int[] array, int low, int high) {
        // Choose the pivot (you can choose any element, but for simplicity, we choose
        // the last element)
        int pivot = array[high];

        // Index of the smaller element
        int i = low - 1;

        // Traverse through all elements
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                // Swap array[i] and array[j]
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (put the pivot element in its correct
        // position)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }
}
