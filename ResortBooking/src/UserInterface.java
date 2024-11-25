import java.util.Scanner;

class Booking {
    private String customerName;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfDays;

    private static final int ADULT_COST_PER_DAY = 1000;
    private static final int CHILD_COST_PER_DAY = 650;

    // Constructor
    public Booking(String customerName, int numberOfAdults, int numberOfChildren, int numberOfDays) {
        this.customerName = customerName;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.numberOfDays = numberOfDays;
    }

    // Validate inputs
    public boolean validateInputs() {
        if (numberOfAdults < 0) {
            System.out.println("Invalid input for number of adults");
            return false;
        }
        if (numberOfChildren < 0) {
            System.out.println("Invalid input for number of children");
            return false;
        }
        if (numberOfDays <= 0) {
            System.out.println("Invalid input for number of days");
            return false;
        }
        return true;
    }

    // Calculate total cost
    public int calculateTotalCost() {
        return (numberOfAdults * ADULT_COST_PER_DAY + numberOfChildren * CHILD_COST_PER_DAY) * numberOfDays;
    }

    // Print confirmation
    public void printConfirmation() {
        System.out.println(customerName + " your booking is confirmed and the total cost is " + calculateTotalCost());
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter the customer details (format: name:numberOfAdults:numberOfChildren:numberOfDays)");
        String input = scanner.nextLine();
        
        // Split input string
        String[] parts = input.split(":");
        
        // Check if input is correctly formatted
        if (parts.length != 4) {
            System.out.println("Invalid input format");
            return;
        }

        try {
            // Parse input
            String customerName = parts[0];
            int numberOfAdults = Integer.parseInt(parts[1]);
            int numberOfChildren = Integer.parseInt(parts[2]);
            int numberOfDays = Integer.parseInt(parts[3]);

            // Create Booking instance
            Booking booking = new Booking(customerName, numberOfAdults, numberOfChildren, numberOfDays);

            // Validate and print confirmation
            if (booking.validateInputs()) {
                booking.printConfirmation();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            scanner.close();
        }
    }
}
