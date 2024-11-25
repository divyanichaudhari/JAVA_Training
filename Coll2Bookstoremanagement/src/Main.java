import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerInfo P = new PlayerInfo();

        System.out.println("Enter the number of players:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        System.out.println("Enter the player and rating (format: PlayerName:Rating):");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] details = input.split(":");
            
            // Check if the input has both player name and rating
            if (details.length != 2) {
                System.out.println("Invalid input format. Please use 'PlayerName:Rating'");
                i--; // Decrement i to ask for input again
                continue;
            }

            String playerName = details[0].trim();
            float rating = Float.parseFloat(details[1].trim());
            P.addPlayerRating(playerName, rating);
        }

        System.out.println("Enter the player name to search:");
        String search = sc.nextLine();
        float rating1 = P.findPlayerRating(search);

        if (rating1 != -1) {
            System.out.println("Rating of " + search + " is: " + rating1);
        } else {
            System.out.println(search + " not found.");
        }

        List<String> topPlayers = P.findTopFivePlayers();
        System.out.println("The top five players are:");
        for (String playerName : topPlayers) {
            System.out.println(playerName);
        }

        sc.close();
    }
}
