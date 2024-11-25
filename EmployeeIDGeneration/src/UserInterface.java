import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the training ID
        System.out.println("Enter the training id");
        String trainingId = scanner.nextLine();
        
        // Validate the training ID length
        if (trainingId.length() != 9) {
            System.out.println(trainingId + " is an invalid training id");
            scanner.close();
            return;
        }
        
        // Extract parts of the training ID
        String year = trainingId.substring(0, 4);
        String teamCode = trainingId.substring(4, 6);
        String rollNumber = trainingId.substring(6);
        
        // Validate the year
        if (!year.equals("2021")) {
            System.out.println(year + " is an invalid year");
            scanner.close();
            return;
        }
        
        // Validate the team code
        String teamAbbreviation;
        switch (teamCode) {
            case "01":
                teamAbbreviation = "LP";
                break;
            case "02":
                teamAbbreviation = "TA";
                break;
            case "03":
                teamAbbreviation = "CT";
                break;
            case "04":
                teamAbbreviation = "PT";
                break;
            case "05":
                teamAbbreviation = "TT";
                break;
            default:
                System.out.println(teamCode + " is an invalid team code");
                scanner.close();
                return;
        }
        
        // Validate the roll number
        try {
            int rollNum = Integer.parseInt(rollNumber);
            if (rollNum < 1 || rollNum > 999) {
                System.out.println(rollNumber + " is an invalid roll number");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println(rollNumber + " is an invalid roll number");
            scanner.close();
            return;
        }
        
        // Generate the employee ID
        String employeeId = "SIET" + teamAbbreviation + String.format("%03d", Integer.parseInt(rollNumber));
        
        // Print the employee ID
        System.out.println("Employee Id: " + employeeId);
        
        // Close the scanner
        scanner.close();
    }
}
