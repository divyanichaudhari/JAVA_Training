import java.util.Scanner;
 
public class UserInterface {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt user for the details
        System.out.println("Enter the details");
        String details = scanner.nextLine();
        // Split the input string by colon (:)
        String[] fields = details.split(":");
        // Validate the input length
        if (fields.length != 5) {
            System.out.println("Invalid input format");
            scanner.close();
            return;
        }
        // Extract and validate participant details
        String participantName = fields[0];
        int age;
        int bigFish;
        int mediumFish;
        int smallFish;
        try {
            age = Integer.parseInt(fields[1]);
            bigFish = Integer.parseInt(fields[2]);
            mediumFish = Integer.parseInt(fields[3]);
            smallFish = Integer.parseInt(fields[4]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            scanner.close();
            return;
        }
        // Validate age
        if (age < 18) {
            System.out.println(age + " is an invalid age");
            scanner.close();
            return;
        }
        // Validate fish counts
        if (bigFish < 0) {
            System.out.println(bigFish + " is an invalid input");
            scanner.close();
            return;
        }
        if (mediumFish < 0) {
            System.out.println(mediumFish + " is an invalid input");
            scanner.close();
            return;
        }
        if (smallFish < 0) {
            System.out.println(smallFish + " is an invalid input");
            scanner.close();
            return;
        }
        // Calculate points
        int points = (bigFish * 10) + (mediumFish * 6) + (smallFish * 3);
        // Print the result
        System.out.println(participantName + " scored " + points + " points");
        // Close the scanner
        scanner.close();
    }
}