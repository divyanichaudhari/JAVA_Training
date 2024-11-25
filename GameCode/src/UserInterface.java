import java.util.Scanner;

public class UserInterface {

    // Method to validate the profile code
    private static void validateProfileCode(String code) {
        // Check if the code has exactly 8 characters
        if (code.length() != 8) {
            System.out.printf("%s does not have the specified length. Expected 8 characters.\n", code);
            return;
        }
        
        // Check if the code starts with the special character '#'
        if (code.charAt(0) != '#') {
            System.out.printf("%s does not start with a valid special character '#'.\n", code);
            return;
        }
        
        // Extract the parts of the code
        String middlePart = code.substring(1, 5); // Next 4 characters
        String lastPart = code.substring(5);      // Last 3 characters
        
        // Validate the middle part: should be uppercase alphabets
        if (!middlePart.matches("[A-Z]{4}")) {
            System.out.printf("%s is an invalid middle part. It should be exactly 4 uppercase alphabetic characters.\n", middlePart);
            return;
        }
        
        // Validate the last part: should be digits
        if (!lastPart.matches("\\d{3}")) {
            System.out.printf("%s is an invalid last part. It should be exactly 3 digits.\n", lastPart);
            return;
        }
        
        // If all conditions are met
        System.out.printf("%s is a valid profile code whose last 3 digits are %s\n", code, lastPart);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your profile code:");
        String code = sc.nextLine();
        validateProfileCode(code);
        sc.close();
    }
}
