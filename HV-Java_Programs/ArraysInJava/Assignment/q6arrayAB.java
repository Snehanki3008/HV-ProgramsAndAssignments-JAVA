import java.util.HashMap;
import java.util.Map;

public class q6arrayAB {
    public static void main(String[] args) {
        // how many elements from Array A are present in the other Array B. and Print their frequencies.
        int[]  arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int[]  arrSubSet = {1, 2, 3, 5, 9};
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each element in arrSuperSet
        for (int element : arrSuperSet) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Calculate the frequencies of elements from arrSubSet
        for (int element : arrSubSet) {
            int frequency = frequencyMap.getOrDefault(element, 0);
            System.out.println("Frequency of " + element + ": " + frequency);
        }
    }

}
