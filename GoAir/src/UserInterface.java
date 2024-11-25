import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of entries:");

        int numberOfEntries;
        try {
            numberOfEntries = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid entry details");
            return;
        }

        for (int i = 1; i <= numberOfEntries; i++) {
            System.out.println("Enter entry " + i + " details:");
            String entryDetails = scanner.nextLine();
            
            String[] details = entryDetails.split(":");
            if (details.length < 3) {
                System.out.println("Invalid entry details");
                continue;
            }

            String employeeId = details[0].trim();
            String entryType = details[1].trim(); // This is captured but not used in validation
            int duration;

            try {
                duration = Integer.parseInt(details[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry details");
                continue;
            }

            try {
                EntryUtility.validateEmployeeId(employeeId);
                EntryUtility.validateDuration(duration);
                System.out.println("Valid entry details");
            } catch (InvalidEntryException e) {
                System.out.println("Invalid entry details");
            }
        }

        scanner.close();
    }
}
