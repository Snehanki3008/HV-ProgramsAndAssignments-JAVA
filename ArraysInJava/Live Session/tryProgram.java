import java.util.ArrayList;

public class tryProgram {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        // Updating an element
        numbers.set(1, 25);

        // Removing an element
        numbers.remove(2);

        // Iterating over the ArrayList
        for (int number : numbers) {
            System.out.println(number);
        }

        // Checking the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Clearing the ArrayList
        numbers.clear();
    }
}
