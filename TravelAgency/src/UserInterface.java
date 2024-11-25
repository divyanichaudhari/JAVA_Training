import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    
    public static void main(String[] args) {
        // Define the available cities
        Set<String> availableCities = new HashSet<>();
        availableCities.add("Chennai");
        availableCities.add("Coimbatore");
        availableCities.add("Erode");
        availableCities.add("Karur");
        availableCities.add("Madurai");
        availableCities.add("Hyderabad");
        availableCities.add("Salem");
        availableCities.add("Bangalore");
        availableCities.add("Delhi");
        availableCities.add("Agra");
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the city name
        System.out.println("Enter the city name");
        String cityName = scanner.nextLine();
        
        // Convert input to lowercase for case-insensitive comparison
        String normalizedCityName = cityName.trim().toLowerCase();
        
        // Check if the city name is in the set of available cities
        boolean isAvailable = availableCities.stream()
            .anyMatch(city -> city.toLowerCase().equals(normalizedCityName));
        
        // Output the result
        if (isAvailable) {
            System.out.println("Bus for " + cityName + " is available");
        } else {
            System.out.println("Bus for " + cityName + " is not available");
        }
        
        // Close the scanner
        scanner.close();
    }
}
