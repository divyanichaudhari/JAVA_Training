import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the size of first array");
	        int size1 = sc.nextInt();
	        
	        if (size1 <= 0) {
	            System.out.println(size1 + " is an invalid array size");
	            return;
	        }
	        
	        // Input elements for first array
	        System.out.println("Enter the array elements");
	        int[] array1 = new int[size1];
	        for (int i = 0; i < size1; i++) {
	            array1[i] = sc.nextInt();
	            if (array1[i] < 0) {
	                System.out.println(array1[i] + " is an invalid input");
	                return;
	            }
	        }
	        
	        System.out.println("Enter the size of second array");
	        int size2 = sc.nextInt();
	        
	        if (size2 <= 0) {
	            System.out.println(size2 + " is an invalid array size");
	            return;
	        } else if (size2 != size1) {
	            System.out.println("Both array size is different");
	            return;
	        }
	        
	        // Input elements for second array
	        System.out.println("Enter the array elements");
	        int[] array2 = new int[size2];
	        for (int i = 0; i < size2; i++) {
	            array2[i] = sc.nextInt();
	            if (array2[i] < 0) {
	                System.out.println(array2[i] + " is an invalid input");
	                return;
	            }
	        }
	        
	        int[] array3 = new int[size1];
	        for (int i = 0; i < size1; i++) {
	            array3[i] = array1[i] + array2[i];
	        }
	        
	        int sumLastDigits = 0;
	        for (int num : array3) {
	            sumLastDigits += num % 10;
	        }
	        
	        if (isPrime(sumLastDigits)) {
	            System.out.println(sumLastDigits + " is a prime number");
	        } else {
	            System.out.println(sumLastDigits + " is not a prime number");
	        }
	    }
	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        if (num <= 3) return true;
	        if (num % 2 == 0 || num % 3 == 0) return false;
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) return false;
	        }
	        return true;
	    }
	}

	