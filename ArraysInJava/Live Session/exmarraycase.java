import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;
public class exmarraycase {
    public static void main(String[] args) {

        String[] arr1 = {"hello", "world" , "java" , "python"};
        List<String> al = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(al);

        // removing using index value
        al.remove(0);
        System.out.println(al);

        //coverting string to array

        // String[] arr = al.toArray();
        arr1 = al.toArray(new String[0]);
        System.out.println(arr1);
        for(String[i] : arr1){
            System.out.println(i);
        }

    }
}
