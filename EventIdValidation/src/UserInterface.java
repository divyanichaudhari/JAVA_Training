import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for name
        System.out.println("Enter your name");
        String name = sc.nextLine();

        // Input for ID
        System.out.println("Enter your ID");
        String id = sc.nextLine();

        // Validate and process ID
        if (!isValidID(id)) {
            System.out.println(id + " is an Invalid ID");
        } else {
            // Extract seat number and time
            String seatNumber = id.substring(3, 6);
            String timeString = id.substring(6, 8);
            String timeZone = id.substring(8);

            // Convert timeString to integer
            int time = Integer.parseInt(timeString);

            // Print the result
            System.out.println("Hi " + name + " your seat number is " + seatNumber +
                               " and the event starts at " + time + timeZone);
        }
    }

    // Method to validate ID
    private static boolean isValidID(String id) {
        // Check if ID has exactly 10 characters
        if (id.length() != 10) {
            return false;
        }

        // Check if ID starts with "SPC"
        if (!id.startsWith("SPC")) {
            return false;
        }

        // Check if the next 3 characters are digits
        String seatNumber = id.substring(3, 6);
        if (!seatNumber.matches("\\d{3}")) {
            return false;
        }

        // Extract and validate time and time zone
        String timePart = id.substring(6);
        if (timePart.length() != 4) {
            return false;
        }

        String timeString = timePart.substring(0, 2);
        String timeZone = timePart.substring(2);

        // Check if timeString is a valid number between 01 and 12
        int time;
        try {
            time = Integer.parseInt(timeString);
        } catch (NumberFormatException e) {
            return false;
        }
        if (time < 1 || time > 12) {
            return false;
        }

        // Check if timeZone is either "AM" or "PM"
        if (!timeZone.equals("AM") && !timeZone.equals("PM")) {
            return false;
        }

        return true;
    }
}
