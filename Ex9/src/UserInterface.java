import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserRegistrationSystem URS = new UserRegistrationSystem();
		
		try {
		System.out.println("Enter your username");
		String username = sc.nextLine();
		
		System.out.println("Enter your password");
		String password = sc.nextLine();
		
		System.out.println("Enter your email");
		String email = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		boolean age1 = URS.validateAge(age);
		boolean pass = URS.validatePassword(password);
		boolean user = URS.validateUsername(username);
		boolean email33 = URS.validateEmail(email);
		
		if(age1 && pass && user && email33) {
			System.out.println("Registration Successfull");
		}
		
		}catch(InvalidDataException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
