package Collectionpractice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        System.out.println("Enter number of products to add:");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine();  
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter product ID:");
            int id = scanner.nextInt();
            scanner.nextLine();  
            System.out.println("Enter product name:");
            String name = scanner.nextLine();

            System.out.println("Enter product price:");
            double price = scanner.nextDouble();
            scanner.nextLine();  
            manager.addProduct(id, new Product(name, price)); 
        }

        System.out.println("All Products:");
        manager.displayAllProducts();

        System.out.println("Enter a product ID to retrieve:");
        int searchId = scanner.nextInt();
        Product product = manager.getProduct(searchId);
        if (product != null) {
            System.out.println("Retrieved Product with ID " + searchId + ": " + product);
        } else {
            System.out.println("No product found with ID " + searchId);
        }

        scanner.close();
    }
}
