import java.util.Scanner;

public class UserInterface {

    // Method to validate the password
    private static boolean isValidPassword(String password) {
        // Check length of the password
        if (password.length() < 6 || password.length() > 12) {
            return false;
        }
        
        // Flags to check the presence of required characters
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        
        // Special characters allowed
        String specialChars = "@$*#";
        
        // Count of different character types
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int specialCharCount = 0;
        int digitCount = 0;
        
        // Iterate over each character of the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
                lowercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (specialChars.indexOf(c) != -1) {
                hasSpecialChar = true;
                specialCharCount++;
            } else {
                return false; // Invalid character
            }
        }
        
        // Check if all conditions are met
        return hasUppercase && hasLowercase && hasSpecialChar;
    }
    
    // Method to print the password analysis
    private static void printPasswordAnalysis(String password) {
        if (isValidPassword(password)) {
            int lowercaseCount = 0;
            int uppercaseCount = 0;
            int specialCharCount = 0;
            int digitCount = 0;
            
            // Count different types of characters
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lowercaseCount++;
                } else if (Character.isUpperCase(c)) {
                    uppercaseCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                } else {
                    specialCharCount++;
                }
            }
            
            System.out.printf("The generated password %s is valid and has %d lowercase alphabet %d uppercase alphabet %d special character %d digit\n",
                              password, lowercaseCount, uppercaseCount, specialCharCount, digitCount);
        } else {
            System.out.printf("%s is an invalid password\n", password);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your password");
        String password = sc.nextLine();
        printPasswordAnalysis(password);
        sc.close();
    }
}
