import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class UserInterface {
	public static void main(String [] args)
	{	
		    Scanner sc = new Scanner(System.in);
			CartonUtility c = new CartonUtility();
			List<Carton> cartonlist = new ArrayList<>();
			System.out.println("Enter the number of cartons");
			int noOfCartons = sc.nextInt();
			sc.nextLine();
			if(noOfCartons<=0)
			{
				System.out.println("Invalid");
				return;
			}
			System.out.println("Enter carton details");
			for(int i=0;i<noOfCartons; i++)
			{
				String details[]= sc.nextLine().split("/");
				if(details.length != 3)
				{
					System.out.println("Input records are entered in the format: productName/ quantity/ productCost.");
					return;
				}
				String quantityName = details[0];
				int quantityNo = Integer.parseInt(details[1]);
				double quantityCost = Double.parseDouble(details[2]);
				if(quantityNo<=0)
				{
					System.out.println("Quantity number should be a valid number");
					return;
				}
				cartonlist.add(new Carton(quantityName,quantityNo, quantityCost));
				}

			c.setCartonList(cartonlist);
			Carton highest = c.findMax(c.convertToStream());
			if(highest !=null)
			{
				System.out.println(highest.getProductName()+ " had the highest quantity with "+ highest.getQuantity() +" nos");
			}
	}
 
	
}