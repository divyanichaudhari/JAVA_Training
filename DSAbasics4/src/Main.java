
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Marks1");
		int marks1 = scanner.nextInt();
		
		System.out.print("Enter the Marks2");
		int marks2 = scanner.nextInt();
		
		System.out.print("Enter the Marks3");
		int marks3 = scanner.nextInt();
		
        String result = determineResult(marks1, marks2, marks3);
        System.out.println("Result:" + result);
        
        scanner.close();
		
	}

	private static String determineResult(int marks1, int marks2, int marks3) {
		return null;
	}

}
