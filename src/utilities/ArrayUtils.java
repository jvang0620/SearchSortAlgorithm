package src.utilities;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    /**
     * Method to generate a random array of integers
     * 
     * @param size
     * @param min
     * @param max
     * @return the generated array
     */
    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        System.out.println("\nGenerated Array: " + Arrays.toString(array));

        return array;
    }
}
