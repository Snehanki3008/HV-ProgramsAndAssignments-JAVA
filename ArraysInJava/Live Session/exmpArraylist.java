import java.util.ArrayList;

public class exmpArraylist {
    public static void main(String[] args) {
        // syntax
        ArrayList<String> al1 = new ArrayList<String>();
        
        // adding values using method named ADD()
        al1.add("A");
        al1.add("B");

        // removing the value
        al1.remove("A");
       
        // to modify the value
        al1.set(0,"C");

        System.out.println(al1);
    }
    
}
