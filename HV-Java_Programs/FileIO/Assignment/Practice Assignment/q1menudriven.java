import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q1menudriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            System.out.print("Please enter the Menu: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createFolder(scanner);
                    break;
                case "2":
                    createTextFile(scanner);
                    break;
                case "3":
                    writeToFile(scanner);
                    break;
                case "4":
                    appendToFile(scanner);
                    break;
                case "5":
                    renameFile(scanner);
                    break;
                case "6":
                    deleteFile(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Press 'Y' to go back to the Main File-Operations Menu: ");
            choice = scanner.nextLine();
            System.out.println();
        } while (choice.equalsIgnoreCase("Y"));
    }

    private static void displayMenu() {
        System.out.println("Menu based app - File Operations in Java\n");
        System.out.println("1. Create a new folder");
        System.out.println("2. Create a new text file");
        System.out.println("3. Write into a text file");
        System.out.println("4. Append data to a text file");
        System.out.println("5. Rename a file");
        System.out.println("6. Delete a file");
    }

    private static void createFolder(Scanner scanner) {
        System.out.print("Please enter the Folder-name to be Created: ");
        String folderName = scanner.nextLine();

        System.out.print("Please enter the Path where you wish to save a new folder: ");
        String path = scanner.nextLine();

        File folder = new File(path, folderName);
        boolean success = folder.mkdir();

        if (success) {
            System.out.println("Folder is created successfully!");
        } else {
            System.out.println("Failed to create the folder.");
        }
    }

    private static void createTextFile(Scanner scanner) {
        System.out.print("Please enter the path: ");
        String path = scanner.nextLine();

        System.out.print("Please enter the File-Name: ");
        String fileName = scanner.nextLine();

        File file = new File(path, fileName);

        try {
            boolean success = file.createNewFile();

            if (success) {
                System.out.println("Text file is created successfully!");
            } else {
                System.out.println("Failed to create the text file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    private static void writeToFile(Scanner scanner) {
        System.out.print("Please enter the path: ");
        String path = scanner.nextLine();

        System.out.print("Please enter the File-Name: ");
        String fileName = scanner.nextLine();

        System.out.print("Please enter the file-content-data: ");
        String content = scanner.nextLine();

        File file = new File(path, fileName);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Data is written to the file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private static void appendToFile(Scanner scanner) {
        System.out.print("Please enter the path: ");
        String path = scanner.nextLine();

        System.out.print("Please enter the File-Name: ");
        String fileName = scanner.nextLine();

        System.out.print("Please enter the file-content-data to append: ");
        String content = scanner.nextLine();

        File file = new File(path, fileName);

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(content);
            System.out.println("Data is appended to the file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }

    private static void renameFile(Scanner scanner) {
        System.out.print("Please enter the path: ");
        String path = scanner.nextLine();

        System.out.print("Please enter the File-Name: ");
        String fileName = scanner.nextLine();

        System.out.print("Please enter new File-Name: ");
        String newFileName = scanner.nextLine();

        File file = new File(path, fileName);
        File newFile = new File(path, newFileName);

        boolean success = file.renameTo(newFile);

        if (success) {
            System.out.println("File is renamed successfully!");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Please enter the path: ");
        String path = scanner.nextLine();

        System.out.print("Please enter the File-Name: ");
        String fileName = scanner.nextLine();

        File file = new File(path, fileName);

        boolean success = file.delete();

        if (success) {
            System.out.println("File is deleted successfully!");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
