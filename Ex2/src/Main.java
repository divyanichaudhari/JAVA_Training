import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Library l = new Library();
		
		try {
			System.out.println("Enter the name");
			String name=sc.nextLine();
			System.out.println("Enter the library card number");
			String libraryCard=sc.nextLine();
			System.out.println("Enter the membership type");
			String type=sc.nextLine();
			System.out.println("Enter the password");
			String pass=sc.nextLine();
			
			//validate the details
			String Val = l.validateMembershipDetails(libraryCard, type, pass);
			
			System.out.println(Val);
			
			Double Val2 = l.calculateMembershipFee(type);
			
			System.out.println(Val2);
			
		} catch (InvalidLibraryException e) {
			System.out.println(e.getMessage());
		}
			

	}

}
