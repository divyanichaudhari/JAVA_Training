import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length of the room
        System.out.println("Enter the length of the room(in m)");
        double length = sc.nextDouble();

        // Validate length
        if (length <= 0) {
            System.out.println("Invalid length");
            sc.close();
            return;
        }

        // Input breadth of the room
        System.out.println("Enter the breadth of the room(in m)");
        double breadth = sc.nextDouble();

        // Validate breadth
        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            sc.close();
            return;
        }

        // Input plant area in cm²
        System.out.println("Enter the plant area of a single plant(in cm2)");
        double plantAreaCm2 = sc.nextDouble();

        // Validate plant area
        if (plantAreaCm2 <= 0) {
            System.out.println("Invalid plant area");
            sc.close();
            return;
        }

        // Convert plant area from cm² to m²
        double plantAreaM2 = plantAreaCm2 / (100 * 100);

        // Calculate the floor area of the room in m²
        double floorAreaM2 = length * breadth;

        // Calculate the total number of plants
        int totalPlants = (int) (floorAreaM2 / plantAreaM2);

        // Round total plants to the nearest and lowest multiple of 10
        totalPlants = (totalPlants / 10) * 10;

        // Calculate the total oxygen production
        double oxygenProduction = totalPlants * 0.9;

        // Output the results
        System.out.println("Total number of plants is " + totalPlants);
        System.out.printf("Total oxygen production is %.2f litres\n", oxygenProduction);

        // Close the scanner to free resources
        sc.close();
    }
}
