import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CakeOrder Ck = new CakeOrder();

        System.out.println("Enter number of cake orders to be added");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the cake order details (Order Id: CakeCost)");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");

            // Check if input is valid
            if (parts.length == 2) {
                try {
                    String orderId = parts[0].trim();
                    double cakeCost = Double.parseDouble(parts[1].trim());
                    Ck.addOrderDetails(orderId, cakeCost);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid cake cost. Please enter a valid number.");
                }
            } else {
                System.out.println("Invalid input format. Please use 'OrderId:CakeCost'.");
            }
        }

        System.out.println("Enter the cost to search the cake orders");
        double search = sc.nextDouble();

        Map<String, Double> filteredMap = Ck.findOrdersAboveSpecifiedCost(search);

        if (filteredMap.isEmpty()) {
            System.out.println("No cake orders found");
        } else {
            System.out.println("Cake Orders above the specified cost");
            for (Map.Entry<String, Double> entry : filteredMap.entrySet()) {
                System.out.print("Order ID:  " + entry.getKey() );
                System.out.println("Cake Cost:  " + entry.getValue());
            }
        }

        sc.close();
    }
}
