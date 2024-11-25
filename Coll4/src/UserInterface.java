import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        athleteDetails a = new athleteDetails();
        
        System.out.println("Enter number of athletes to be added:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.println("Enter the athlete details (TimeTaken:AthleteName):");
        
        for (int i = 0; i < n; i++) {
            String athlete = sc.nextLine();
            
            // Debugging: Print the input received
            System.out.println("Received input: " + athlete);
            
            if (athlete.trim().isEmpty()) {
                System.out.println("Input cannot be empty. Please enter details again.");
                i--; // Decrement to repeat this iteration
                continue;
            }

            String[] parts = athlete.split(":");
            
            if (parts.length != 2) {
                System.out.println("Invalid format. Please enter details in the format TimeTaken:AthleteName.");
                i--; // Decrement to repeat this iteration
                continue; // Skip to the next iteration
            }
            
            String athleteName = parts[1].trim();
            try {
                double timeTaken = Double.parseDouble(parts[0].trim());
                a.addAthleteDetails(timeTaken, athleteName);
            } catch (NumberFormatException e) {
                System.out.println("Invalid time format. Please enter a numeric value for TimeTaken.");
                i--; // Decrement to repeat this iteration
            }
        }
        
        System.out.println("Enter the athlete name to find time taken:");
        String name = sc.nextLine();
        
        double time1 = a.findTimeTaken(name);
        if (time1 == -1) {
            System.out.println("Athlete not found.");
        } else {
            System.out.println("Time taken by " + name + " is " + time1 + " seconds.");
        }
    
        System.out.println("Finding the three best performers...");
        List<String> l2 = a.findThreeBestPerformers();
        
        if (l2.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Three Best Performers:");
            for (var v : l2) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
