import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class UserInterface {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        FruitBasketUtility fruitBasketUtility = new FruitBasketUtility();
        
        //Fill the code here
         while (true) {
                System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
 
                switch (option) {
                    case 1:
                        System.out.println("Enter the fruit name");
                        String fruitName = scanner.nextLine();
                        System.out.println("Enter weight in Kgs");
                        int weightInKgs = scanner.nextInt();
                        System.out.println("Enter price per Kg");
                        int pricePerKg = scanner.nextInt();
                        FruitBasket fruitBasket = new FruitBasket(fruitName, weightInKgs, pricePerKg);
                        fruitBasketUtility.addToBasket(fruitBasket);
                        break;
 
                    case 2:
                        List<FruitBasket> fruitBasketList = fruitBasketUtility.getFruitBasketList();
                        if (fruitBasketList.isEmpty()) {
                            System.out.println("Your basket is empty. Please add fruits.");
                        } else {
                            Stream<FruitBasket> fruitBasketStream = fruitBasketList.stream();
                            int totalBill = fruitBasketUtility.calculateBill(fruitBasketStream);
                            System.out.println("The estimated bill amount is Rs " + totalBill);
                        }
                        break;
 
                    case 3:
                        System.out.println("Thank you for using the application.");
                        scanner.close();
                        return;
 
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
         }
    }
}