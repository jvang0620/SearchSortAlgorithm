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
            int[] array = getArrayInput(scanner);

            int operationChoice = getOperationChoice(scanner);
            if (operationChoice == 0) {
                System.out.println("Exiting the program...");
                keepRunning = false;
            } else if (operationChoice == 1) {
                performSorting(scanner, array);
            } else if (operationChoice == 2) {
                performSearching(scanner, array);
            }
        }

        scanner.close();
    }

    // Method to get the array size and range input from the user
    public static int[] getArrayInput(Scanner scanner) {
        System.out.print("\nEnter the size of the array: ");
        int size = scanner.nextInt();

        System.out.print("Enter the minimum value for the array: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value for the array: ");
        int max = scanner.nextInt();

        return generateRandomArray(size, min, max);
    }

    // Method to ask for the user's choice of operation (sort or search)
    public static int getOperationChoice(Scanner scanner) {
        System.out.println("\nDo you want to sort or search the array?\n");
        System.out.println("1. Sort the array");
        System.out.println("2. Search in the array");
        System.out.println("0. Exit");
        return scanner.nextInt();
    }

    // Method to handle sorting operations
    public static void performSorting(Scanner scanner, int[] array) {
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
    }

    // Method to handle searching operations
    public static void performSearching(Scanner scanner, int[] array) {
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

        System.out.print("\nEnter the target element to search for: ");
        int target = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        int[] indices = findOccurrences(array, target);
        if (indices.length > 0) {
            System.out.println("\nElement " + target + " found at indices: " + Arrays.toString(indices) + "\n");
            System.out.println("Element " + target + " was found " + indices.length + " time(s) in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }

        searchingAlgorithm.search(array, target);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Execution Time: " + executionTime + " milliseconds");
    }

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

    // Method to get the searching algorithm based on the user's choice
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

    // Find all occurrences of the target element and return an array of indices
    public static int[] findOccurrences(int[] array, int target) {
        int[] tempIndices = new int[array.length]; // Temporary storage for indices
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                tempIndices[count] = i;
                count++;
            }
        }

        return Arrays.copyOf(tempIndices, count); // Return the found indices
    }

    // Generate a random array of size elements with values between min and max
    static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min; // Generate random number between min and max
        }

        System.out.println("\nGenerated Array: " + Arrays.toString(array));
        return array;
    }
}
