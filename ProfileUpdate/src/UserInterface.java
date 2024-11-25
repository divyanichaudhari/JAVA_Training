import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for name
        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        // Input for PAN number
        System.out.println("Enter your PAN number");
        String pan = sc.nextLine();
        
        // Validate PAN number
        if (!isValidPanNumber(pan)) {
            System.out.println(pan + " is an invalid PAN Number");
            return;
        }
        
        // Input for E-mail ID
        System.out.println("Enter your E-mail ID");
        String email = sc.nextLine();
        
        // Validate E-mail ID
        if (!isValidEmail(email)) {
            System.out.println("Invalid E-mail ID");
            return;
        }
        
        // Profile update successful
        System.out.println("Profile of " + name + " updated successfully");
    }
    
    // Method to validate PAN number
    private static boolean isValidPanNumber(String pan) {
        String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
        return pan.matches(panRegex);
    }
    
    // Method to validate E-mail ID
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-z]{5,10}@digitec\\.com$";
        return email.matches(emailRegex);
    }
}
