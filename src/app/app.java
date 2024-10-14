package src.app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import src.sort_algorithms.*;
import src.algorithmsInterface.SearchingAlgorithmInterface;
import src.algorithmsInterface.SortingAlgorithmInterface;
import src.search_algorithms.*;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("\nEnter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = generateRandomArray(size);

            System.out.println("\nDo you want to sort or search the array?");
            System.out.println("1. Sort the array");
            System.out.println("2. Search in the array");
            System.out.println("0. Exit");

            int operationChoice = scanner.nextInt();

            if (operationChoice == 0) {
                System.out.println("Exiting the program...");
                keepRunning = false;
                break;
            }

            if (operationChoice == 1) {
                System.out.println("\nChoose a sorting algorithm:");
                System.out.println("1. Bubble Sort");
                System.out.println("2. Merge Sort");
                System.out.println("3. Quick Sort");
                System.out.println("4. Selection Sort");
                System.out.println("5. Insertion Sort");
                System.out.println("6. Heap Sort");
                System.out.println("7. Shell Sort");

                int choice = scanner.nextInt();
                SortingAlgorithmInterface sortingAlgorithm = getSortingAlgorithm(choice);

                long startTime = System.currentTimeMillis();
                sortingAlgorithm.sort(array);
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;

                System.out.println("Sorted Array: " + Arrays.toString(array));
                System.out.println("Execution Time: " + executionTime + " milliseconds");

            } else if (operationChoice == 2) {
                System.out.println("\nChoose a searching algorithm:");
                System.out.println("1. Linear Search");
                System.out.println("2. Binary Search");
                System.out.println("3. Exponential Search");
                System.out.println("4. Fibonacci Search");
                System.out.println("5. Hashing Search");
                System.out.println("6. Interpolation Search");
                System.out.println("7. Jump Search");
                System.out.println("8. Ternary Search");

                int choice = scanner.nextInt();
                SearchingAlgorithmInterface searchingAlgorithm = getSearchingAlgorithm(choice);

                System.out.print("Enter the target element to search for: ");
                int target = scanner.nextInt();

                long startTime = System.currentTimeMillis();
                int resultIndex = searchingAlgorithm.search(array, target);
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;

                if (resultIndex != -1) {
                    System.out.println("Element found at index: " + resultIndex);
                } else {
                    System.out.println("Element not found in the array.");
                }

                System.out.println("Execution Time: " + executionTime + " milliseconds");
            }
        }

        scanner.close();
    }

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

    public static SearchingAlgorithmInterface getSearchingAlgorithm(int choice) {
        switch (choice) {
            case 1:
                return new LinearSearch();
            case 2:
                return new BinarySearch();
            case 3:
                return new ExponentialSearch();
            case 4:
                return new FibonacciSearch();
            case 5:
                return new HashSearch();
            case 6:
                return new InterpolationSearch();
            case 7:
                return new JumpSearch();
            case 8:
                return new TernarySearch();
            default:
                return new BinarySearch(); // Default searching
        }
    }

    // Generate a random array of size elements with values between 1 and 200
    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size) + 1; // Generates a random number between 1 and 200
        }

        System.out.println("\nGenerated Array: " + Arrays.toString(array));

        return array;
    }
}
