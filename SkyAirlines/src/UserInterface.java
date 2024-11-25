import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Enter name");
	    String Name = sc.nextLine();
	    
	    System.out.println("Enter Source");
	    String Source = sc.nextLine();
	    
	    System.out.println("Enter Destination");
	    String Destination = sc.nextLine();
	    
	     System.out.println("Dear " + Name + ", welcome onboard with service from " + Source +  " to " + Destination + ". Thankyou for choosing Sky Airlines. Enjoy your flight.\n");
	    } 
	    
	    
	} 


