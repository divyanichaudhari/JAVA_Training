import java.util.ArrayList;
import java.util.Scanner;

class Team {
    private String name;
    private float totalTime;

    public Team(String name, float totalTime) {
        this.name = name;
        this.totalTime = totalTime;
    }

    public String getName() {
        return name;
    }

    public float getTotalTime() {
        return totalTime;
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of teams
        System.out.println("Enter the number of teams");
        int numberOfTeams;
        try {
            numberOfTeams = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            scanner.close();
            return;
        }

        if (numberOfTeams < 2) {
            System.out.println(numberOfTeams + " is an invalid input");
            scanner.close();
            return;
        }

        ArrayList<Team> teams = new ArrayList<>();

        // Input team details
        System.out.println("Enter the details");
        for (int i = 0; i < numberOfTeams; i++) {
            String[] details = scanner.nextLine().split(":");
            
            if (details.length != 5) {
                System.out.println("Invalid input format");
                scanner.close();
                return;
            }
            
            String teamName = details[0];
            float totalTime = 0;
            
            for (int j = 1; j < details.length; j++) {
                try {
                    float time = Float.parseFloat(details[j]);
                    if (time < 1) {
                        System.out.println("Invalid number");
                        scanner.close();
                        return;
                    }
                    totalTime += time;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format");
                    scanner.close();
                    return;
                }
            }

            teams.add(new Team(teamName, totalTime));
        }

        // Determine the winning team
        Team winningTeam = null;
        for (Team team : teams) {
            if (winningTeam == null || team.getTotalTime() < winningTeam.getTotalTime()) {
                winningTeam = team;
            }
        }

        if (winningTeam != null) {
            System.out.printf("%s team wins the race in %.2f minutes\n", winningTeam.getName(), winningTeam.getTotalTime());
        }

        // Close the scanner
        scanner.close();
    }
}

