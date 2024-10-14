package src.search_algorithms;

import java.util.Arrays;

import src.algorithmsInterface.SearchingAlgorithmInterface;

public class FibonacciSearch implements SearchingAlgorithmInterface {
    // Time Complexity: O(log n) - Logarithmic time complexity, similar to binary
    // search.

    @Override
    public int search(int[] array, int target) {
        Arrays.sort(array); // Ensure array is sorted
        int fibMm2 = 0; // (m-2)'th Fibonacci No.
        int fibMm1 = 1; // (m-1)'th Fibonacci No.
        int fibM = fibMm2 + fibMm1; // m'th Fibonacci

        int n = array.length;
        int offset = -1;

        while (fibM < n) {
            fibMm2 = fibMm1;
            fibMm1 = fibM;
            fibM = fibMm2 + fibMm1;
        }

        while (fibM > 1) {
            int i = Math.min(offset + fibMm2, n - 1);

            if (array[i] < target) {
                fibM = fibMm1;
                fibMm1 = fibMm2;
                fibMm2 = fibM - fibMm1;
                offset = i;
            } else if (array[i] > target) {
                fibM = fibMm2;
                fibMm1 = fibMm1 - fibMm2;
                fibMm2 = fibM - fibMm1;
            } else {
                return i;
            }
        }

        if (fibMm1 == 1 && array[offset + 1] == target) {
            return offset + 1;
        }
        return -1;
    }
}
