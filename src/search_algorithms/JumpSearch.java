package src.search_algorithms;

import src.helperInterface.SearchingAlgorithmInterface;
import java.util.Arrays;

public class JumpSearch implements SearchingAlgorithmInterface {
    // Time Complexity: O(√n) - Square root of the array size, making it more
    // efficient than linear search.

    @Override
    public int search(int[] array, int target) {
        Arrays.sort(array); // Ensure array is sorted

        int length = array.length;
        int step = (int) Math.floor(Math.sqrt(length));
        int prev = 0;

        while (array[Math.min(step, length) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(length));
            if (prev >= length)
                return -1;
        }

        while (array[prev] < target) {
            prev++;
            if (prev == Math.min(step, length))
                return -1;
        }

        if (array[prev] == target)
            return prev;

        return -1;
    }
}
