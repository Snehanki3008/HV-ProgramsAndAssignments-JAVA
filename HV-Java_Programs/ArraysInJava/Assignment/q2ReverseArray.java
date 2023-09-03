import java.util.Scanner;

public class q2ReverseArray {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        // print all the array elements in reverse order.
        int[] arrNum = { 31, 42, 25, 21, 56, 61, 13, 45, 76, 55 };
        int n = arrNum.length;
        int j = n - 1;
        int temp;
        System.out.println("The reversed array is: ");
        for (int i = 0; i < n; i++) {
            temp = arrNum[i];
            arrNum[i] = arrNum[j];
            arrNum[j] = temp;
            j--;
            System.out.print(arrNum[i] + " ");
            sc1.close();
        }
    }
}
