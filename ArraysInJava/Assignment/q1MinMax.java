import java.util.Scanner;

public class q1MinMax {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[] arrNum = { 31, 42, 25, 21, 56, 61, 13, 45, 76, 55 };

        int min = arrNum[0];
        int max = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < min) {
                min = arrNum[i];
            }
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
        }
        System.out.println("The element with the Minimum value: " + min);
        System.out.println("The element with the Maximum value: " + max);

        // avegrage of all array elements
        int sum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            sum = sum + arrNum[i];
        }
        System.out.println("The avegrage of all array elements: " + (sum / arrNum.length));

        // Total number of array elements
        int count = arrNum.length;
        System.out.println("The total number of array elements: " + count);
        sc1.close();
    }

}
