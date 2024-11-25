import java.util.Scanner;

public class UserInterface {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the customer name");
		String name=sc.nextLine();
		
		System.out.println("Enter the phone number");
		String phoneNumber=sc.nextLine();
		
		System.out.println("Enter the street name");
		String sname=sc.nextLine();
		
		System.out.println("Enter the bill amount");
		double billAmount=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter the distance");
		int distance=Integer.parseInt(sc.nextLine());
		
		CustomerDetails d=new CustomerDetails(name,phoneNumber,sname,billAmount,distance);
		
		    System.out.println("Customer name "+d.getCustomerName());
		    System.out.println("Phone number "+d.getPhoneNumber());
		    System.out.println("Street name "+d.getStreetName());
		    
		    double bonusPoints=d.calculateBonusPoints();
		    System.out.println("Bonus points "+bonusPoints);
		    
		    double deliveryCharge=d.deliveryCharge();
		    System.out.println("Delivery Charge "+deliveryCharge);
		
	}
}
