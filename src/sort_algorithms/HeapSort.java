package src.sort_algorithms;

import src.helperInterface.SortingAlgorithmInterface;

/**
 * Implementation of the Heap Sort algorithm.
 * Heap Sort is a comparison-based sorting algorithm that uses a binary heap
 * data structure to build a max-heap (for ascending order) and then repeatedly
 * extracts the maximum element from it.
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n log n)
 * Space Complexity: O(1) - Constant space complexity.
 *
 */
public class HeapSort implements SortingAlgorithmInterface {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Swap the root (maximum element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i; // Assume the root is the largest
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // If the left child is larger than the root
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // If the right child is larger than the current largest
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // If the largest is not the root
        if (largest != i) {
            // Swap the largest element with the root
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
}
