import java.util.*;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Car c=new Car();
		boolean flag=true;
		
		while(flag)
		{
		    System.out.println("1.Add car \n2.Search by name \n3.Search by count \n4.Total  \n5.Exit");
		    System.out.println("Enter your choice");
		    int choice=sc.nextInt();
		    
		    switch(choice)
		    {
		        case 1:
		            System.out.println("Enter the car name");
		            sc.nextLine();
		            String carName=sc.nextLine();
		            System.out.println("Enter no of cars sold");
		            int carSold=sc.nextInt();
		            c.addCar(carName,carSold);
		            break;
		            
		        case 2:
		            if(c.getCarMap().size()>0)
		            {
		                System.out.println("Enter the car name");
		                sc.nextLine();
		                String searchName=sc.nextLine();
		            int count=c.carByName(searchName);
		            if(count== -1)
		            {
		                System.out.println("Car not found");
		            }
		            else
		            {
		                System.out.println(count);
		            }
		            }
		             else
		             {
		                System.out.println("The map is empty");
		             }
		              break;
		            case 3:
		                if(c.getCarMap().size()>0)
		            {
		                System.out.println("Enter the count");
		                int searchCount=sc.nextInt();
		                List<String>carByCount=c.carByCount(searchCount);
		              
		            if(carByCount==null)
		            {
		                System.out.println("No cars found");
		            }
		            else
		            {
		                for(String car:carByCount)
		                {
		                System.out.println(car);
		                      }
		                 }
		               
		                   }
		            
		                 else
		                 {
		                      System.out.println("The map is empty");
		                  }
		                 break;
		            case 4:
		                if(c.getCarMap().size()>0)
		                {
		                    System.out.println(c.totalCarsSold());
		                }
		                else
		                {
		                    System.out.println("The map is empty");
		                }
		                break;
		              case 5:
		                  System.out.println("Thank you for using the application");
		                  flag =false;
		                  break;
		              default:
		              System.out.println("Invalid choice");
		    }
		
    	}
    }

}