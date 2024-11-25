
public class Main {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers in the range of 100 to 999:");

        // Loop through the range of 100 to 999
        for (int number = 100; number <= 999; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }
    
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = 3; // Since we're dealing with 3-digit numbers
        int sum = 0;
        
        // Calculate the sum of the cubes of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}
