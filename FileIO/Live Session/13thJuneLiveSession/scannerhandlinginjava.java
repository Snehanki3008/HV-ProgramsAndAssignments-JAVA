import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerhandlinginjava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("filehandling.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
               
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
