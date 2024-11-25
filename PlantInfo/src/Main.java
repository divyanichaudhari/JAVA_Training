import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlantInfo pi = new PlantInfo();
        System.out.println("Enter the number of plant details to be added:");
        int plantNo = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the plant details (Plant Name: Rating):");
        for (int i = 0; i < plantNo; i++) {
            String[] input = sc.nextLine().split(":");
            String plantName = input[0].trim();
            float rating = Float.parseFloat(input[1].trim());
            pi.addPlantDetails(plantName, rating);
        }

        System.out.println("Enter the name of the plant to search:");
        String search = sc.nextLine().trim();
        
        float rating = pi.findPlantName(search);
        if (rating != -1) {
            System.out.println("Rating: " + rating);
        } else {
            System.out.println("It is not available.");
        }

        // Find plants with the highest rating
        List<String> highestRating = pi.findHighestPlantRating();
        if (highestRating.isEmpty()) {
            System.out.println("No plants with the highest rating found.");
        } else {
            System.out.println("Names of the plants with the highest rating:");
            for (String plantName : highestRating) {
                System.out.println(plantName);
            }
        }

        sc.close(); 
    }
}
