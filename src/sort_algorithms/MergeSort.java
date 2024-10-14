package src.sort_algorithms;

import src.helperInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Merge Sort algorithm.
 * Merge Sort is a divide-and-conquer sorting algorithm that works by
 * recursively dividing the array into two halves, sorting each half, and then
 * merging the sorted halves back together.
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n log n)
 * Space Complexity: O(n) - Extra space is required for temporary arrays.
 *
 */
public class MergeSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        // Entry point for the sorting process
        mergeSort(array, 0, array.length - 1);
    }

    /**
     * Recursive method for performing the Merge Sort algorithm on a sub-array.
     *
     * @param array The array to be sorted
     * @param left  The left index of the sub-array
     * @param right The right index of the sub-array
     */
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    /**
     * This merge method efficiently merges two sorted subarrays (leftArray and
     * rightArray) into a single sorted array (array).
     *
     * @param array The array to be merged
     * @param left  The left index of the merged sub-array
     * @param mid   The middle index of the merged sub-array
     * @param right The right index of the merged sub-array
     */
    private void merge(int[] array, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the data of the two subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array

        // Initial indices of the two subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = left;

        // Merge elements from leftArray and rightArray
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                // If element of leftArray is less than or equal to the element of rightArray
                // Copy the element of leftArray to the original array
                array[k] = leftArray[i];
                i++;
            } else {
                // If element of rightArray is less than the element of leftArray
                // Copy the element of rightArray to the original array
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if there are any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if there are any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
