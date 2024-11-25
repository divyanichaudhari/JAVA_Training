import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of whole numbers: ");
        int n = sc.nextInt();
        
        int[] evenArray = new int[n];
        int[] oddArray = new int[n];
        
        int even = 0;
        int odd = 0;
        
        System.out.println("Enter the " + n + " whole numbers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            
            if(number%2 ==0) {
            	evenArray[even] = number;
                even++;
            }
            else {
            	oddArray[odd] = number;
            	odd++;
            }
        }
        
        System.out.println("The Size of the Even Array is: " + even);
        System.out.println("The Even number Array is:");
        for (int i = 0; i < even; i++) {
            System.out.println(evenArray[i]);
        }
        
        System.out.println("The Size of the Odd Array is: " + even);
        System.out.println("The Odd number Array is:");
        for (int i = 0; i < odd; i++) {
            System.out.println(oddArray[i]);
        }
        
        sc.close();
	}

}
