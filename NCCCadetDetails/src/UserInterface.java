import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CadetService cadets = new CadetService();
		
		List<String> l1 = new ArrayList<String>();
		
		System.out.println("Enter the Total Number of Cadet details Needed to add in the list");
		int no = scanner.nextInt();
		
		System.out.println("Enter the Cadet details");
		String details = scanner.nextLine();
		
		for(int i=0; i<no ; i++) {
			String[] parts = details.split(":");
			String id = parts[0].trim();
		
		}
		System.out.println("Enter the Group name");
		String name1 = scanner.nextLine();
		List<Cadet> l2 = cadets.retrieveDetailsByGroupName(parts[2], name1);
		if(l2.isEmpty()) {
			System.out.println("No Cadets is found for the given group name");
		}else {
			for(var v:l2) {
				System.out.println(l2);
			}
		}
		
		System.out.println("Enter the Age");
		List<Cadet> l3 = cadets.retrieveCadetDetailsByAgeForGivenCount(, no)
		
		System.out.println("Enter the number of cadets to be retrieved from the list");
		
		System.out.println("Cadets based on maximum age:");
	}
}
