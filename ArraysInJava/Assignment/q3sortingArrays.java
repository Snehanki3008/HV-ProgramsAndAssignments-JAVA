import java.util.Arrays;

public class q3sortingArrays {
    public static void main(String[] args) {
        int a[] = { 23, 21, 44, 32, 12 }; // declare and initialize the array
        Arrays.sort(a); // used to sort the array in ascending/increasing order
        for (int i = 0; i < a.length; i++) { // it will print the array after arranging in ascending/increasing array
            System.out.print(a[i] + " ");
        }
        System.out.println(); // it will give a line break in output
        for (int i = a.length - 1; i >= 0; i--) { // it will print in decreasing/descending order

            System.out.print(a[i] + " ");
        } // we can store it in another array or in same array in reverse order and then
          // print it
    }
}
