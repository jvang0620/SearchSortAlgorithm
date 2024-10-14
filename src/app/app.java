package src.app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import src.helperInterface.SortingAlgorithmInterface;
import src.sort_algorithms.BubbleSort;
import src.sort_algorithms.HeapSort;
import src.sort_algorithms.InsertionSort;
import src.sort_algorithms.MergeSort;
import src.sort_algorithms.QuickSort;
import src.sort_algorithms.SelectionSort;
import src.sort_algorithms.ShellSort;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true; // Variable to keep the program running

        while (keepRunning) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = generateRandomArray(size);

            /* COMMENT OR UNCOMMENT to view or not view original array */
            // System.out.println("Original Array: " + Arrays.toString(array));

            System.out.println("Choose a sorting algorithm:");
            System.out.println("0. Exit");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Insertion Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Shell Sort");

            int choice = scanner.nextInt();

            if (choice == 0) {
                // Exit the program
                System.out.println("Exiting the program...");
                keepRunning = false;
                break;
            }

            SortingAlgorithmInterface sortingAlgorithm = getSortingAlgorithm(choice);

            // Capture start time before sorting
            long startTime = System.currentTimeMillis();

            // Perform sorting
            sortingAlgorithm.sort(array);

            // Capture end time after sorting
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            /* COMMENT OR UNCOMMENT to view or not view Sorted array */
            System.out.println("Sorted Array: " + Arrays.toString(array));

            System.out.println("Execution Time: " + executionTime + " milliseconds");

            // Ask if the user wants to perform another sort or exit
            System.out.println("\nDo you want to sort another array? (yes/no)");
            String response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                keepRunning = false;
                System.out.println("Exiting the program...");
            }
        }

        scanner.close();
    }

    // Generate a random array of size elements with values between 1 and 200
    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200) + 1; // Generates a random number between 1 and 200
        }

        /* COMMENT OR UNCOMMENT to view or not view Generated array */
        System.out.println("Generated Array: " + Arrays.toString(array));

        return array;
    }

    private static SortingAlgorithmInterface getSortingAlgorithm(int choice) {
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
                throw new IllegalArgumentException("Invalid choice.");
        }
    }
}
