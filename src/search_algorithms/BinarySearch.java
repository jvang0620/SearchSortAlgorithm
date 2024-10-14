package src.search_algorithms;

import java.util.Arrays;

import src.algorithmsInterface.SearchingAlgorithmInterface;

public class BinarySearch implements SearchingAlgorithmInterface {
    // Binary Search
    // Time Complexity: O(log n) - Logarithmic time complexity as it divides the
    // search space in half at each step.

    @Override
    public int search(int[] array, int target) {
        Arrays.sort(array); // Ensure the array is sorted before binary search
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Return index if target is found
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
