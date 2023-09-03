import java.util.Scanner;

public class Q7Pattern {
    public static void main(String[] args) {
        try (Scanner s1 = new Scanner(System.in)) {
            for (int i = 4; i>=1; i--){
                for ( int j = 1; j<=i; j++){
                    System.out.print("*");
    
                }
                System.out.print("\n");
                
            }
            for (int i = 1; i<=4; i++){
                for ( int j = 1; j<=i; j++){
                    System.out.print("*");
    
                }
                System.out.print("\n");
                
            }
        }
    }
}
