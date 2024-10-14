package src.search_algorithms;

import src.helperInterface.SearchingAlgorithmInterface;
import java.util.HashMap;

public class HashSearch implements SearchingAlgorithmInterface {
    // Time Complexity: O(n) - Linear time complexity in the worst case, depending
    // on the hash function and collision resolution.

    @Override
    public int search(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i); // Store element and its index
        }

        return hashMap.getOrDefault(target, -1); // Returns index or -1 if not found
    }
}
