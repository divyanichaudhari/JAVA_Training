import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Product> products = new HashSet<>();

        System.out.println("Enter the number of products you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product (name:price):");
            String details = sc.nextLine();
            String[] parts = details.split(":");

            if (parts.length == 2) {
                String productName = parts[0];
                float price;
                try {
                    price = Float.parseFloat(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price format. Please enter a valid number.");
                    continue; 
                }

                Product product = new Product(productName, price); 

                if (products.contains(product)) {
                    System.out.println("The product already exists: " + product.getProduct());
                } else {
                    products.add(product);
                    System.out.println("Product added: " + product.getProduct() + ":" + product.getPrice());
                }
            } else {
                System.out.println("Invalid input format. Please use 'name:price'.");
            }
        }

        sc.close();
    }
}
