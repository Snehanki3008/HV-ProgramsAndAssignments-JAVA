import java.util.Arrays;

public class filterinjava {
    public static void main(String[] args) {
        int[] arrnum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // using stream method

        int[] even = Arrays.stream(arrnum).filter(i -> i % 2 == 0).toArray();
        System.out.println(Arrays.toString(even));

        // USING foreach method
        Arrays.stream(arrnum).filter(i -> i % 2 == 0).forEach(System.out::println);

    }

}