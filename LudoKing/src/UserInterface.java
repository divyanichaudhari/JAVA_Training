import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alex points");
        int alexPoints = sc.nextInt();
        if (!isValidPoint(alexPoints)) {
            System.out.println(alexPoints + " is an invalid number");
            sc.close();
            return;
        }

        System.out.println("Enter Nikil points");
        int nikilPoints = sc.nextInt();
        if (!isValidPoint(nikilPoints)) {
            System.out.println(nikilPoints + " is an invalid number");
            sc.close();
            return;
        }

        System.out.println("Enter Sam points");
        int samPoints = sc.nextInt();
        if (!isValidPoint(samPoints)) {
            System.out.println(samPoints + " is an invalid number");
            sc.close();
            return;
        }

        if (alexPoints == nikilPoints || nikilPoints == samPoints) {
            System.out.println("The game is a tie");
        } else if (alexPoints >= nikilPoints && alexPoints >= samPoints) {
            System.out.printf("Alex scored %d points and won the game\n", alexPoints);
        } else if (nikilPoints >= alexPoints && nikilPoints >= samPoints) {
            System.out.printf("Nikil scored %d points and won the game\n", nikilPoints);
        } else {
            System.out.printf("Sam scored %d points and won the game\n", samPoints);
        }

        sc.close();
    }

    private static boolean isValidPoint(int points) {
        return points >= 0 && points <= 50;
    }
}
