import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		NumAvg numA=new NumAvg();
		int choice=0;
		while(choice!=3)
		{
		    System.out.println("1.Add number");
		    System.out.println("2.Find average");
		    System.out.println("3.Exit");
		    System.out.println("Enter your choice\n");
		    choice=sc.nextInt();
		    
		    
		    switch(choice)
		    {
		        case 1:
		            System.out.println("Enter the number");
		            int n=sc.nextInt();
		            numA.addNum(n);
		            break;
		            
		        case 2:
		            if(numA.getNumSet().isEmpty())
		            {
		                System.out.println("The set is empty");
		            }else{
		                System.out.println(numA.calAvg());
		            }
		            break;
		            
		       case 3:
		           System.out.println("Thank you for using the application");
		           break;
		          
		      default:
		           System.out.println("Inavlid choice. Please enter a value");
		    }
		}
		
		
	}
}
