import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
	private static Map <String,Double> employeeMap=new HashMap<>();

	public Map<String, Double> getEmployeeMap() 
	{
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
	    return salary ->{
		ArrayList<String> name=new ArrayList<>();
		for(Map.Entry<String,Double>entry:employeeMap.entrySet())
		{
		    if(entry.getValue()<=salary)
		    {
		        name.add(entry.getKey());
		    }
		}
		return name;
	};
}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		 int choice;
	        
	    while(true)
	    {
	        System.out.println("1.Add Employee Details");
	        System.out.println("2.Find Employee Details");
	        System.out.println("3.Exit");
	        System.out.println("Enter the choice");
	        choice=Integer.parseInt(sc.nextLine());
	        switch(choice)
	        {
	            case 1:
	                System.out.println("Enter the Employee name");
	                String name=sc.nextLine();
	                System.out.println("Enter the Employee Salary");
	                double salary=Double.parseDouble(sc.nextLine());
	                new UserInterface().addEmployeeDetails(name,salary);
	                break;
	           
	           case 2:
	               System.out.println("Enter the salary to be searched");
	               double searchSalary=Double.parseDouble(sc.nextLine());
	               EmployeeAudit employeeAudit=UserInterface.findEmployee();
	               ArrayList<String>employees=employeeAudit.fetchEmployeeDetails(searchSalary);
	               if(employees.isEmpty())
	               {
	                   System.out.println("No Employee Found");
	               }else{
	                   System.out.println("Employee List");
	                   for(String employee:employees){
	                       System.out.println(employee);
	                   }
	               }
	               break;
	               
	           case 3:
	               System.out.println("Let's complete the session");
	               return;
	           
	           default:
	           System.out.println("Invalid choice.Please enter again");
	           break;
	        }
	    }
	}

}
