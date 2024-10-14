package src.search_algorithms;

import src.helperInterface.SearchingAlgorithmInterface;
import java.util.Arrays;

public class ExponentialSearch implements SearchingAlgorithmInterface {
    // Time Complexity: O(log n) - Logarithmic time complexity, similar to binary
    // search.

    @Override
    public int search(int[] array, int target) {
        Arrays.sort(array); // Ensure array is sorted for binary search

        if (array[0] == target)
            return 0;

        int bound = 1;
        while (bound < array.length && array[bound] <= target) {
            bound *= 2;
        }

        return Arrays.binarySearch(array, bound / 2, Math.min(bound, array.length), target);
    }
}
