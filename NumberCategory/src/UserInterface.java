
public class UserInterface{
 
	public static NumberCategory checkAmicable() {
 
        return (number1, number2) -> {
 
            return sumOfDivisors(number1) == number2 && sumOfDivisors(number2) == number1;
 
        };
 
    }
 
    public static NumberCategory checkPalindrome() {
 
        return (number1, number2) -> {
 
            int product = number1 * number2;
 
            return isPalindrome(product);
 
        };
 
    }
 
    private static int sumOfDivisors(int number) {
 
        int sum = 0;
 
        for (int i = 1; i <= number / 2; i++) {
 
            if (number % i == 0) {
 
                sum += i;
 
            }
 
        }
 
        return sum;
 
    }
 
    private static boolean isPalindrome(int number) {
 
        String str = Integer.toString(number);
 
        String reversedStr = new StringBuilder(str).reverse().toString();
 
        return str.equals(reversedStr);
 
    }
 
    public static void main(String[] args) {
 
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
      //  System.out.println("Enter the first number:");
 
        int number1 = scanner.nextInt();
 
     //   System.out.println("Enter the second number:");
 
        int number2 = scanner.nextInt();
 
        // Check for amicable numbers
 
        NumberCategory amicableChecker = checkAmicable();
 
        boolean areAmicable = amicableChecker.checkNumberCategory(number1, number2);
 
        // Check for palindrome product
 
        NumberCategory palindromeChecker = checkPalindrome();
 
        boolean isPalindromeProduct = palindromeChecker.checkNumberCategory(number1, number2);
 
        // Display results
 
        if (areAmicable) {
 
            System.out.println(number1 + " and " + number2 + " are amicable numbers");
 
        } else {
 
            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
 
        }
 
        if (isPalindromeProduct) {
 
            System.out.println("Their Product " + (number1 * number2) + " do produces a Palindrome");
 
        } else {
 
            System.out.println("Their Product " + (number1 * number2) + " does not produce a Palindrome");
 
        }
 
        scanner.close();
    }

 
}