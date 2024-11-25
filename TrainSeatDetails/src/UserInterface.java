import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String bookingId = sc.nextLine();
		
		if(bookingId.length()==10) {
		
		// Fill the code here
			
			StringBuilder Sb = new StringBuilder(bookingId);
			Sb.trimToSize();
			StringBuilder S = Sb.append(Sb);
			
			if(bookingId.matches("^[A-Z]{5}+\\d{2}.+[A-Z]{1}")) {
				
				if(bookingId.matches("^[A-Z]{5}+\\d{2}/[1-10].+[A-Z]{1}")) {
					
				}else {
					System.out.println("Invalid Seat Number");
				}
			}else {
				System.out.println("Invalid Count");
			}
			
		}else {
			System.out.println("Invalid Input");
		}
			sc.close();
	}

}
