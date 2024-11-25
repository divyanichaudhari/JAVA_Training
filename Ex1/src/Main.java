

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shopping_system ss=new Shopping_system();
		try
		{
			System.out.println("Enter the quantity");
			int quant=sc.nextInt();
			System.out.println("Enter the price");
			float price=sc.nextFloat();
			System.out.println("Order date");
			String od=sc.nextLine();
			sc.nextLine();
			System.out.println("Delivary date");
			String dd=sc.nextLine();
			
			//validate 
			boolean b=ss.InvalidOrderDetails(quant, price, od, dd);
			if(b)
			{
				System.out.println(ss.getreturnstatus());
			}
			
		}
		catch(InvalidOrderDetailsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}