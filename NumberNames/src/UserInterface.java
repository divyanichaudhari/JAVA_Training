import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        String number = sc.nextLine();
        
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            if (digit >= 0 && digit <= 9) {
                result.append(numberWords[digit]).append(" ");
            }
        }
        
        System.out.println(result.toString().trim());
        
        sc.close();
    }
}
