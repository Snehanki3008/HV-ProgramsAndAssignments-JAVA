public class q5Shiftingones {
    public static void main(String[] args) {
        // Move all the ones at the end of an Array
        int[] arrNum = { 3, 1, 4, 1, 2, 1, 8, 3, 2, 1 };
        int[] arrShifted = new int[arrNum.length];
        int n = arrNum.length;
        int j = n - 1;
        // Move all the ones at the end of an Array
        for (int i = n - 1; i >= 0; i--) {
            if (arrNum[i] == 1) {
                arrShifted[j] = arrNum[i];
                j--;
            }
        }
        // Print the Array
        System.out.println("Array after moving ones to the end: ");
        for (int i = 0; i < arrShifted.length; i++) {
            System.out.print(arrShifted[i] + " ");
        }
    }
}
