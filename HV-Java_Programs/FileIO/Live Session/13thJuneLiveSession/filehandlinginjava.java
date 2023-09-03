import java.io.File;

public class filehandlinginjava {
    public static void main(String[] args) {
        // Creating File Object
        try {
            String fname = "filehandling.txt";
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("File created : " + f1.getName());

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}
