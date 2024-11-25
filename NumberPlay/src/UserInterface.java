import java.util.Scanner;

public class UserInterface {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        
        if (isValidNumber(number)) {
            int result = solvePuzzle(number);
            System.out.println(result);
        } else {
            System.out.println("Invalid number");
        }
    }

    private static int solvePuzzle(int number) {
        if (number > 50) {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            return firstDigit - secondDigit;
        } else {
            int reversedNumber = (number % 10) * 10 + (number / 10);
            int firstDigit = reversedNumber / 10;
            int secondDigit = reversedNumber % 10;
            return firstDigit - secondDigit;
        }
    }

    private static boolean isValidNumber(int number) {
        return number >= 10 && number <= 99;
    }
}
