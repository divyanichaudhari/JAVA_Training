import java.util.Scanner;
import java.util.HashSet;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClassHouseFormation formation=new ClassHouseFormation();
		
		System.out.println("Enter the number of students");
		int numStudents=sc.nextInt();
		sc.nextLine();
	    
	    if(numStudents <= 0)
	    {
	        System.out.println("Invalid input");
	        return;
	    }
	   
	    System.out.println("Enter the details");
	    for(int i=0; i < numStudents ;i++)
	    {
	        String details=sc.nextLine();
	        formation.addName(details);
	    }
	    
	    HashSet<String> teamSet = formation.formTeam();
	    
	    for(String entry : teamSet)
	    {
	        System.out.println(entry);
	    }
	    
	}
}