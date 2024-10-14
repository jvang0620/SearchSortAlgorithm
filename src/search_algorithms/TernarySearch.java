package src.search_algorithms;

import src.helperInterface.SearchingAlgorithmInterface;
import java.util.Arrays;

public class TernarySearch implements SearchingAlgorithmInterface {
    // Time Complexity: O(log3 n) - Logarithmic time complexity, dividing the search
    // space into three parts.

    @Override
    public int search(int[] array, int target) {
        Arrays.sort(array); // Ensure array is sorted
        return ternarySearch(array, target, 0, array.length - 1);
    }

    private int ternarySearch(int[] array, int target, int left, int right) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (array[mid1] == target)
                return mid1;
            if (array[mid2] == target)
                return mid2;

            if (target < array[mid1])
                return ternarySearch(array, target, left, mid1 - 1);
            else if (target > array[mid2])
                return ternarySearch(array, target, mid2 + 1, right);
            else
                return ternarySearch(array, target, mid1 + 1, mid2 - 1);
        }

        return -1;
    }
}
