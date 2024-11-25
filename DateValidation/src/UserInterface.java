import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
 
public class UserInterface {
 
    private static final String DATE_FORMAT = "dd/MM/yyyy";
 
    // Method to check if the date is valid
    private static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setLenient(false);  // To strictly parse dates
 
        try {
            // Parse the date
            sdf.parse(dateStr);
            return true;  // If parse is successful, date is valid
        } catch (ParseException e) {
            return false; // If parse fails, date is invalid
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Get the date from the user
        System.out.println("Enter the date");
        String dateStr = scanner.nextLine().trim();
 
        // Check if the date is valid
        if (isValidDate(dateStr)) {
            System.out.println(dateStr + " is a valid date");
        } else {
            System.out.println(dateStr + " is not a valid date");
        }
 
        // Close the scanner
        scanner.close();
    }
}