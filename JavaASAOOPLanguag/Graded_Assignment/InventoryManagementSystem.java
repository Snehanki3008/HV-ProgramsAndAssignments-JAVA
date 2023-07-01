import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private String specification;
    private double cost;
    private int count;

    public Product(String name, String specification, double cost, int count) {
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public class InventoryManagementSystem {
    private List<Product> products;

    public InventoryManagementSystem() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProductList() {
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println();
    }

    public void displayProductCount(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                System.out.println("Product Count: " + product.getCount());
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void displayProductDetails(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                System.out.println("Product Specification: " + product.getSpecification());
                System.out.println("Product Cost: " + product.getCost());
                System.out.println("Product Count: " + product.getCount());
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void editProduct(String productName, String specification, double cost) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setSpecification(specification);
                product.setCost(cost);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void updateInventory(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                int newCount = product.getCount() + quantity;
                if (newCount >= 0) {
                    product.setCount(newCount);
                    System.out.println("Inventory updated successfully!");
                } else {
                    System.out.println("Invalid quantity!");
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Adding sample products
        Product product1 = new Product("Laptop", "Intel Core i5, 8GB RAM, 256GB SSD", 999.99, 10);
        Product product2 = new Product("Smartphone", "6.2-inch Display, 64GB Storage, 4000mAh Battery", 499.99, 20);
        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Inventory Management System ===");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    inventorySystem.displayProductList();
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    String productCountName = scanner.nextLine();
                    inventorySystem.displayProductCount(productCountName);
                    break;
                case 3:
                    System.out.print("Enter product name: ");
                    String productDetailsName = scanner.nextLine();
                    inventorySystem.displayProductDetails(productDetailsName);
                    break;
                case 4:
                    System.out.print("Enter product name: ");
                    String editProductName = scanner.nextLine();
                    System.out.print("Enter new specification: ");
                    String newSpecification = scanner.nextLine();
                    System.out.print("Enter new cost: ");
                    double newCost = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    inventorySystem.editProduct(editProductName, newSpecification, newCost);
                    break;
                case 5:
                    System.out.print("Enter product name: ");
                    String updateProductName = scanner.nextLine();
                    System.out.print("Enter quantity to add/delete: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    inventorySystem.updateInventory(updateProductName, quantity);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Inventory Management System... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
