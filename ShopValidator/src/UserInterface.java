import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GadgetValidatorUtil validator = new GadgetValidatorUtil();
        
        System.out.println("Enter the number of gadget entries");
        int numberOfEntries = Integer.parseInt(scanner.nextLine());
        
        for (int i = 1; i <= numberOfEntries; i++) {
            System.out.println("Enter gadget " + i + " details");
            String input = scanner.nextLine();
            String[] gadgetDetails = input.split(":");

            if (gadgetDetails.length != 3) {
                System.out.println("Invalid input format");
                continue;
            }

            String gadgetID = gadgetDetails[0];
            String gadgetType = gadgetDetails[1];
            int warrantyPeriod;

            try {
                warrantyPeriod = Integer.parseInt(gadgetDetails[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid warranty period");
                continue;
            }

            try {
                validator.validateGadgetID(gadgetID);
                validator.validateWarrantyPeriod(warrantyPeriod);
                System.out.println("Warranty accepted, stock updated");
            } catch (InvalidGadgetException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
