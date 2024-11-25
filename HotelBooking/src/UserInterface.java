import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		int numberOfRooms;
		  System.out.println("Enter the number of rooms you needed");
		while(true){
		    numberOfRooms=sc.nextInt();
		    if(numberOfRooms<=0){
		        System.out.println("Please enter a valid number");
		    }else{
		        break;
		    }
		   }
		    System.out.println("Enter the phone number");
		    String phoneNumber=sc.next();
		    
		    int bookingAmount=numberOfRooms * 500;
		    
		    System.out.println("Pay Rs. "+ bookingAmount +" for booking");
		    System.out.println("Your booking has been confirmed");
		}
	}
	
 