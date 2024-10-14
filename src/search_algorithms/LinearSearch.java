package src.search_algorithms;

import src.algorithmsInterface.SearchingAlgorithmInterface;

public class LinearSearch implements SearchingAlgorithmInterface {
    // LinearSearch
    // Time Complexity: O(n) - Linear time complexity as it traverses the array
    // sequentially.

    @Override
    public int search(int[] array, int target) {
        // Traverse the array sequentially
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is equal to the target
            if (array[i] == target) {
                return i; // Return index where the target is found
            }
        }
        return -1; // Target not found
    }
}
