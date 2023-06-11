import java.util.Arrays;

public class referencemethod {
    public static void main(String[] args) {

        String[] arraynames = { "snehanki", "pooja", "seema", "sneha" };
        // Using filter method we filtered array elements that have more then 6 letters and save it to new array
        Arrays.stream(arraynames).filter(i -> i.length() > 3).forEach(System.out::println);



        // Using map method we mapped array elements to upper case
        Arrays.stream(arraynames).map(String::toUpperCase).forEach(System.out::println);

        // alternative method 
        String[] stringArray = {"adsf", "fvdf", "fvsd", "sfdvs", "dsf"};
        String[] stringArrayWithStream = (String[]) Arrays.stream(stringArray).filter(i -> i.length() > 3).toArray();
        System.out.println(Arrays.toString(stringArrayWithStream));
        Arrays.stream(stringArray).map(i -> String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1,i.length())).forEach(System.out::println);

        // another method
        String[] names = { "John", "Alice", "Bob", "Sarah", "Mark" };

        String[] filteredNames = Arrays.stream(names)
                .filter(n -> n.length() > 3)
                .map(String::toUpperCase)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(filteredNames));

    }
}
