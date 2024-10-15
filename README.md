# Sorting and Searching Algorithms Program

This Java program allows users to generate an array of randomly generated integers and perform various sorting or searching operations on it. The user can choose between sorting the array using different algorithms or searching for a specific element in the array. The program also calculates and displays the execution time for each operation.

## Main Class (`app`):

- Prompts the user to input the size of the array.
- Generates an array of random integers.
- Allows the user to choose between sorting the array or searching for an element.
- Executes the chosen sorting or searching algorithm.
- Displays the sorted array or the index of the searched element.
- Calculates and displays the execution time for sorting or searching.
- The program continues running until the user chooses to exit.

### Sorting Algorithm Interface (`SortingAlgorithmInterface`):

Defines a common method (`sort`) that each sorting algorithm implements. This modular structure allows for easy addition or modification of sorting algorithms. The user selects an algorithm at runtime, and the program dynamically applies the selected algorithm to sort the array.

### Searching Algorithm Interface (`SearchingAlgorithmInterface`):

Defines a common method (`search`) for searching algorithms, which returns the index of the target element or `-1` if not found. The user selects a search algorithm at runtime, and the program applies the algorithm to find the target element in the array.

## Sorting Algorithm Classes:

Each class implements a different sorting algorithm:

- **BubbleSort**: Implements the bubble sort algorithm.
- **MergeSort**: Implements the merge sort algorithm.
- **QuickSort**: Implements the quick sort algorithm.
- **SelectionSort**: Implements the selection sort algorithm.
- **InsertionSort**: Implements the insertion sort algorithm.
- **HeapSort**: Implements the heap sort algorithm.
- **ShellSort**: Implements the shell sort algorithm.

## Searching Algorithm Classes:

Each class implements a different searching algorithm:

- **LinearSearch**: Implements the linear search algorithm.
- **BinarySearch**: Implements the binary search algorithm.
- **ExponentialSearch**: Implements the exponential search algorithm.
- **FibonacciSearch**: Implements the Fibonacci search algorithm.
- **HashSearch**: Implements the hashing search algorithm.
- **InterpolationSearch**: Implements the interpolation search algorithm.
- **JumpSearch**: Implements the jump search algorithm.
- **TernarySearch**: Implements the ternary search algorithm.

## Getting Started

To run the Sorting and Searching Algorithms Java Program on your local machine, follow these steps:

1. Clone the repository to your local machine:

   - HTTPS:
     ```bash
     git clone https://github.com/jvang0620/Sorting-Searching-Algorithms-Java-Program.git
     ```
   - SSH:
     ```bash
     git clone git@github.com:jvang0620/Sorting-Searching-Algorithms-Java-Program.git
     ```

2. In the terminal, navigate to the project directory and compile the program:

   ```bash
   javac src/app/app.java

   ```

3. Run the program:

   ```bash
   java src/app/app
   ```

4. The program will prompt you to input the array size and select either a sorting or searching algorithm. After performing the chosen operation, it will display the result and execution time. You can continue performing operations on new arrays or exit the program.

## Developed Using:

[![Java](https://img.shields.io/badge/Java-8%2B-blue.svg?style=for-the-badge)](https://www.oracle.com/java/technologies/javase-downloads.html)
