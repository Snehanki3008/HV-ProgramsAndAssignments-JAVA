import java.util.Arrays;

public class mapinjava {
    public static void main(String[] args) {
        // map : map (key, value) -> (key, value)
        int[] arrnum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] squr = Arrays.stream(arrnum).map(i -> i * i).toArray();
        System.out.println(Arrays.toString(squr));
    }
    
}
