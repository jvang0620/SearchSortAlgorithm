<!-- About the Program -->

# Sorting Algorithms Java Program

This Java program allows users to generate and sort an array of randomly generated integers using various sorting algorithms. Users can specify the array size and select their desired sorting method. The program then sorts the array and calculates the execution time of the selected algorithm in milliseconds.

<!-- The Main Class -->

## Main Class (`app`):

- Prompts the user to input the size of the array.
- Generates an array of random integers with values between 1 and 200.
- Allows the user to choose a sorting algorithm from a menu.
- Executes the chosen sorting algorithm to sort the array.
- Displays both the original and sorted arrays.
- Calculates and displays the execution time for sorting the array.
- The program continues running until the user selects to exit.

<!-- Sorting Algorithm Interface -->

### Sorting Algorithm Interface (`SortingAlgorithmInterface`):

The interface defines a common method (`sort`) that each sorting algorithm implements. This modular structure makes it easy to add or modify sorting algorithms. The user selects an algorithm at runtime, and the program dynamically applies the selected algorithm to sort the array.

<!-- All the sorting classes -->

## Sorting Algorithm Classes:

Each of the following classes implements a different sorting algorithm:

- **BubbleSort**: Implements the bubble sort algorithm.
- **MergeSort**: Implements the merge sort algorithm.
- **QuickSort**: Implements the quick sort algorithm.
- **SelectionSort**: Implements the selection sort algorithm.
- **InsertionSort**: Implements the insertion sort algorithm.
- **HeapSort**: Implements the heap sort algorithm.
- **ShellSort**: Implements the shell sort algorithm.

<!-- How to get started -->

## Getting Started

To run the Sorting Algorithms Java Program on your local machine, follow the steps below:

1. Clone the repository to your local machine:

   - HTTPS:
     ```bash
     git clone https://github.com/jvang0620/Sorting-Algorithms-Java-Program.git
     ```
   - SSH:
     ```bash
     git clone git@github.com:jvang0620/Sorting-Algorithms-Java-Program.git
     ```

2. In the terminal, navigate to the project directory and compile the program:

   ```bash
   javac src/app/app.java
   ```

3. Run the program:

   ```bash
   java src/app/app
   ```

4. The program will prompt you to input the array size and select a sorting algorithm. After sorting the array, it will display the sorted result and execution time. You can continue sorting new arrays or exit the program.

<!-- Developed using this technology -->

## Developed Using:

[![Java](https://img.shields.io/badge/Java-8%2B-blue.svg?style=for-the-badge)](https://www.oracle.com/java/technologies/javase-downloads.html)
# SearchSortAlgorithm
