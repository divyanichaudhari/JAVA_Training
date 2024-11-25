import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class UserInterface {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HotelBooking HB = new HotelBooking();
			try {
			
			System.out.println("Enter name");
			String Name = sc.nextLine();
			
			System.out.println("Enter Age");
			int Age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter email");
			String email = sc.nextLine();
			
			System.out.println("Enter Creadit card number");
			String creditno = sc.nextLine();
			
			HB.validateUserDetails(Age, email, creditno);
			
			System.out.println("Select room Type");
			String type = sc.nextLine();
			
			System.out.println("Enter chcekIn date");
			String checkindate1 = sc.nextLine();
			
			System.out.println("Enter checkout date");
			String checkOutDate1 = sc.nextLine();
			
			
			
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	            LocalDate checkInDate = LocalDate.parse(checkindate1, formatter);
	            LocalDate checkOutDate = LocalDate.parse(checkOutDate1, formatter);
	            
				  HB.validateBookingDetails(Name, type, checkInDate , checkOutDate);
				  
		            int numNights = (int) (checkOutDate.toEpochDay() - checkInDate.toEpochDay());
				  
				  Double TCost = HB.calculateBookingCost(type, numNights, false);
				  
				  System.out.println(TCost);
				  
	}catch(InvalidBookingDetailsException e) {
		System.out.println(e.getMessage());
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}finally {
		sc.close();
	}

}
}
