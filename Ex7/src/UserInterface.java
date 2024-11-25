import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessUtil fitnessUtil = new FitnessUtil();

        try {
            System.out.println("Enter the exercise routine:");
            String activityData = scanner.nextLine();

            System.out.println("Enter the user weight in Kg:");
            int userWeightInKg = scanner.nextInt();

            String validationMessage = fitnessUtil.validateFitnessActivity(activityData, userWeightInKg);
            System.out.println(validationMessage);

            int caloriesBurned = fitnessUtil.calculateCalories(activityData, userWeightInKg);
            System.out.println("Total calories burned: " + caloriesBurned);

        } catch (InvalidFitnessActivityException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thanks for using the Fitness tracker.");
        }

        scanner.close();
    }
}
