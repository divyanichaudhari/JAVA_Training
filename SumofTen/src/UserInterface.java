import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String userInput = sc.nextLine();

        if (isValidNumber(userInput)) {
            int number = Integer.parseInt(userInput);
            reversedAndExpand(number);
        } else {
            System.out.println(userInput + " is not a valid number");
        }
    }

    // Method to check if the input string is a valid integer
    public static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to handle the addition of ten numbers and the output
    public static void reversedAndExpand(int number) {
        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += number + i;
            }
            System.out.println("The sum of ten numbers is " + sum);
        }
    }
}
