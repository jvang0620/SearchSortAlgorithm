package src.utilities;

import src.algorithmsInterface.SearchingAlgorithmInterface;
import src.search_algorithms.*;

public class SearchingUtils {

    /**
     * Contains the searching algorithm selector method.
     * 
     * @param choice
     * @return SearchingAlgorithmInterface
     */
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
}
