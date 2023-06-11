import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrank1 {

    public static void main(String[] args) {
         
        Scanner s = new Scanner (System.in);
        try{
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            
            
            
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        
    }
}