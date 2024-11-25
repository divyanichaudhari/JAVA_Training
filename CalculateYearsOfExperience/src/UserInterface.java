import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {
    
    // Method to calculate years of experience based on the date of joining
    public static int calculateExperience(String dateOfJoiningStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Parse the input date and current date
            Date dateOfJoining = sdf.parse(dateOfJoiningStr);
            // Define the current date
            Date currentDate = sdf.parse("15/12/2020");
            
            // Calculate the difference in milliseconds
            long differenceInMillis = currentDate.getTime() - dateOfJoining.getTime();
            
            // Convert milliseconds to years
            // 1 year = 365.25 days, 1 day = 24 * 60 * 60 * 1000 milliseconds
            long millisInYear = 365 * 24 * 60 * 60 * 1000L;
            int yearsOfExperience = (int) (differenceInMillis / millisInYear);
            
            return yearsOfExperience;
        } catch (ParseException e) {
            // Handle the exception if date parsing fails
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for the date of joining
        System.out.println("Enter the date of joining (dd/MM/yyyy):");
        String dateOfJoining = sc.nextLine();
        
        // Calculate years of experience
        int experience = calculateExperience(dateOfJoining);
        
        // Display the result
        if (experience >= 0) {
            System.out.printf("%d years of experience%n", experience);
        }
        
        sc.close();
    }
}
