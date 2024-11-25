import java.util.Scanner;

public class UserInterface {

	private static final int ROOM_RATE = 500;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.nextLine();

        int numberOfRooms = getValidNumberOfRooms(sc);

        System.out.println("Enter the phone number");
        String phoneNumber = sc.nextLine();

        int totalAmount = numberOfRooms * ROOM_RATE;

        System.out.printf("Pay Rs. %d for booking\n", totalAmount);
        System.out.println("Your booking has been confirmed");

        sc.close();
    }

    private static int getValidNumberOfRooms(Scanner sc) {
        int numberOfRooms;
        while (true) {
            System.out.println("Enter the number of rooms you needed");
            numberOfRooms = sc.nextInt();
            if (numberOfRooms > 0) {
                break;
            } else {
                System.out.println("Please enter a valid number");
            }
        }
        return numberOfRooms;
    }
}