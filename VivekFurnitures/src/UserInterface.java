import java.util.Scanner;

public class UserInterface 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name");
		String customerName=sc.nextLine();
		
		System.out.println("Enter Phone Number");
		long phoneNumber=Long.parseLong(sc.nextLine());
		
		System.out.println("Enter address");
		String address=sc.nextLine();
		
		CustomerDetails c=new CustomerDetails(customerName,phoneNumber,address);
		
		System.out.println("Enter Bero Type");
		String beroType=sc.nextLine();
		
		if(beroType.equals("Steel Bero"))
		{
		    handleSteelBero(sc);
		}else if(beroType.equals("Wooden Bero"))
		{
	    	handleWoodenBero(sc);
		}
		else
		{
		    System.out.println(beroType+" is an invalid bero type");
		}
	}
	 private static void handleSteelBero(Scanner sc)
		{
		    System.out.println("Enter Bero Colour");
		    String colour=sc.nextLine();
		    
		    
		    System.out.println("Enter Bero Height");
		    int height=Integer.parseInt(sc.nextLine());
		    
		    SteelBero steel=new SteelBero("SteelBero",colour,height);
		    steel.calculatePrice();
		    
		    Discount discountCalculator=new Discount();
		    double discount=discountCalculator.calculateDiscount(steel);
		    double totalPrice=steel.getPrice()-discount;
		    System.out.printf("Amount needs to be paid %.2f",totalPrice);
		}
	   private static void handleWoodenBero(Scanner sc)
		{
	    	System.out.println("Enter Bero Colour");
		    String colour=sc.nextLine();
		    System.out.println("Enter Wood type");
		    String woodType=sc.nextLine();
		   
		    if(woodType.equalsIgnoreCase("Ply Wood") || woodType.equalsIgnoreCase("Teak Wood") || woodType.equalsIgnoreCase("Engineered Wood"))
		    {
		    WoodenBero wood=new WoodenBero("WoodenBero",colour,woodType);
		    wood.calculatePrice();
		    
		    Discount discountCalculator=new Discount();
		    double discount=discountCalculator.calculateDiscount(wood);
		    double totalPrice=wood.getPrice()-discount;
		    System.out.printf("Amount needs to be paid %.2f",totalPrice);    
		}
		else
		{
		    System.out.println("Invalid woodType provided");
		}
	}
}

