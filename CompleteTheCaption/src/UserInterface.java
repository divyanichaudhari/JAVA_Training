import java.util.Scanner;
 
public class UserInterface {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the first and second strings from the user
        System.out.println("Enter the first string");
        String firstString = scanner.nextLine();
        
        System.out.println("Enter the second string");
        String secondString = scanner.nextLine();
        
        // Check and process the strings
        processStrings(firstString, secondString);
    }
 
    private static void processStrings(String firstString, String secondString) {
        // Check if both strings are of the same length
        if (firstString.length() != secondString.length()) {
            System.out.println("Length of the strings " + firstString + " and " + secondString + " does not match");
            return;
        }
 
        // Check for invalid symbols
        boolean firstInvalid = containsInvalidSymbols(firstString);
        boolean secondInvalid = containsInvalidSymbols(secondString);
 
        if (firstInvalid && secondInvalid) {
            System.out.println(firstString + " and " + secondString + " contains invalid symbols");
            return;
        } else if (firstInvalid) {
            System.out.println(firstString + " contains invalid symbols");
            return;
        } else if (secondInvalid) {
            System.out.println(secondString + " contains invalid symbols");
            return;
        }
 
        // Replace '!' in the first string with corresponding characters from the second string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) == '!') {
                result.append(secondString.charAt(i));
            } else {
                result.append(firstString.charAt(i));
            }
        }
 
        // Print the result
        System.out.println(result.toString());
    }
 
    // Method to check if a string contains invalid symbols
    private static boolean containsInvalidSymbols(String str) {
        return str.matches(".*[^a-zA-Z! ].*");
    }
}
