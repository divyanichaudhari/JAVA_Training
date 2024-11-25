import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

    // Method to calculate the expiry date based on manufacturing date and months of validity
    public static String calculateExpiryDate(String manufacturingDateStr, int monthsToAdd) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Ensure strict parsing
        
        try {
            // Parse the manufacturing date
            Date manufacturingDate = sdf.parse(manufacturingDateStr);
            
            // Use Calendar to add months
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(manufacturingDate);
            calendar.add(Calendar.MONTH, monthsToAdd);
            
            // Get the expiry date
            Date expiryDate = calendar.getTime();
            
            // Format the expiry date as a string
            return sdf.format(expiryDate);
        } catch (ParseException e) {
            // Return a message if the date is invalid
            return manufacturingDateStr + " is not a valid date";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the manufacturing date
        System.out.println("Enter the Manufacturing Date");
        String manufacturingDate = sc.nextLine().trim();
        
        // Check if the date format is correct before proceeding
        if (!isValidDate(manufacturingDate)) {
            System.out.println(manufacturingDate + " is not a valid date");
            sc.close();
            return;
        }
        
        // Prompt user for the number of months
        System.out.println("Enter the Month");
        int months;
        try {
            months = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number of months.");
            sc.close();
            return;
        }
        
        // Calculate the expiry date
        String result = calculateExpiryDate(manufacturingDate, months);
        
        // Display the result
        if (result.endsWith("is not a valid date")) {
            System.out.println(result);
        } else {
            System.out.println(result + " is the expiry date");
        }

        sc.close();
    }

    // Method to check if the date string is valid
    private static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Strict parsing

        try {
            Date date = sdf.parse(dateStr);
            // Check if the date is valid
            return dateStr.equals(sdf.format(date));
        } catch (ParseException e) {
            return false;
        }
    }
}
