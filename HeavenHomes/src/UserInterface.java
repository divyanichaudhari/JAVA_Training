import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Apartment Ap = new Apartment();
       //Fill the code here
        
        System.out.println("Enter number of details to be added");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the details (Apartment number: Rent)");
        for(int i = 0 ; i<n ; i++) {
        	String input = sc.nextLine();
        	String[] parts = input.split(":");
        	try {
        		if(parts.length ==2) {
        	String apartmentNumber = parts[0].trim();
        	
        	double rent = Double.parseDouble(parts[1].trim());
        	
        		Ap.addApartmentDetails(apartmentNumber, rent);
        	}else {
                System.out.println("Please enter the details in the format (Apartment number: Rent)");
        	}}
        	catch (NumberFormatException e) {
                System.out.println("Invalid rent value. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Enter the range to filter the details" );
        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();
        
        double totalRent = Ap.findTotalRentOfApartmentsInTheGivenRange(R1, R2);
        if(totalRent == 0) {
        	System.out.println("No apartments found in this range");
  
        }else {
        	
        	System.out.println("Total Rent in the range "+ R1 + "to " + R2 + " USD: " + totalRent );
        	
        
        }
       sc.close();
    }
}
