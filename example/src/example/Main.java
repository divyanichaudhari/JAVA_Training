package example;

import java.util.ArrayList;
import java.util.List;
 
import java.util.stream.Collectors;
 
public class Main {
	
	
	public static List<Employee> listofemp() {
		
		List<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(112, "Nikhil", "Mumbai", 2010, 28000.00));
		al.add(new Employee(104, "Raj", "Pune", 2020, 18000.00));
		al.add(new Employee(103, "Akash", "Barshi", 2016, 23000.00));
		al.add(new Employee(101, "Abhhi", "Banglore", 2012, 8000.00));
		al.add(new Employee(102, "Ram", "Virar", 2035, 2000.00));
		al.add(new Employee(110, "Shyam", "Barshi", 2023, 27000.00));
	
		return al;
	}
 
	public List<Employee> nameStartsWithA(List<Employee> listOfEmp) {
	    return listOfEmp.stream()
	        .filter(e -> e.getName().startsWith("A"))
	        .collect(Collectors.toList());
	    
	}
	
	public List<Double> increaseSalaries(List<Employee> listOfEmp) {
	       return listOfEmp.stream().filter(e -> e.getSalary() > 25000)
	        .map(e -> e.getSalary() + 5000)
	        .collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
        List<Employee> list = listofemp();
        Main m = new Main();

        m.nameStartsWithA(list).forEach(System.out::println);

        m.increaseSalaries(list).forEach(System.out::println);
    }
}