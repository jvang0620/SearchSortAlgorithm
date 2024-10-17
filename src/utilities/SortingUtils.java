package src.utilities;

import src.algorithmsInterface.SortingAlgorithmInterface;
import src.sort_algorithms.*;

public class SortingUtils {
    // Method to get the sorting algorithm based on the user's choice
    public static SortingAlgorithmInterface getSortingAlgorithm(int choice) {
        switch (choice) {
            case 1:
                return new BubbleSort();
            case 2:
                return new MergeSort();
            case 3:
                return new QuickSort();
            case 4:
                return new SelectionSort();
            case 5:
                return new InsertionSort();
            case 6:
                return new HeapSort();
            case 7:
                return new ShellSort();
            default:
                return new QuickSort(); // Default sorting
        }
    }
}
