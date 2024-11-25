import java.util.Scanner;
public class UserInterface {
	
	// Method to check if the number is between 1 and 10
    private static boolean isValidElement(int number) {
        return number > 0 && number <= 10;
    }
 
    // Method to calculate the sum of an array
    private static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
 
    // Method to calculate the product of an array
    private static int productArray(int[] array) {
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		// Input size of the array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
 
        // Validate the size of the array
        if (size <= 0 || size > 10) {
            System.out.println("Please enter a valid number");
            return;
        }
 
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number");
            return;
        }
 
        // Initialize and input elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            if (!isValidElement(element)) {
                System.out.println("Please enter valid elements in the array");
                return;
            }
            array[i] = element;
        }
 
        // Edge case: size of 1
        if (size == 1) {
            System.out.println("The sum of the values is 0");
            System.out.println("The product of the values is 0");
            return;
        }
 
        // Determine the middle index
        int middleIndex = size / 2;
        int middleElement = array[middleIndex];
 
        // Variables for sum and product
        int sum = 0;
        int product = 1;
 
        if (middleElement % 2 == 0) {
            // Middle element is even
            for (int i = 0; i < middleIndex; i++) {
                sum += array[i];
            }
            for (int i = middleIndex + 1; i < size; i++) {
                product *= array[i];
            }
        } else {
            // Middle element is odd
            for (int i = 0; i < middleIndex; i++) {
                product *= array[i];
            }
            for (int i = middleIndex + 1; i < size; i++) {
                sum += array[i];
            }
        }
 
        // Print results
        System.out.println("The sum of the values is " + sum);
        System.out.println("The product of the values is " + product);
 
        sc.close();
    }	
}