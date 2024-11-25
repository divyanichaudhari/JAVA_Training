import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products products = new Products();
        int choice;

        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            System.out.print("Enter your choice\n");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the product\n");
                    String product = sc.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    if (products.getProductList().isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList(); 
                        for (String item : products.getProductList()) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}
