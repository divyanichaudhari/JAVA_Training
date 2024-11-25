import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //Fill the code
        
        TicketBooking ticket = new TicketBooking();
        
        System.out.println("Enter the number of tickets to be booked");
        int noOfTickets = sc.nextInt();
        
        
        System.out.println("Enter the ticket details (Seat Number: Ticket Type");
        String details = sc.nextLine();
        
        for(int i=0; i<noOfTickets; i++) {
        	String seatNumber = sc.nextLine();

        	String[] parts = details.split(":");

        	if(parts.length == 2) {
        	int seatNo = Integer.parseInt(seatNumber);
        	
        	String ticketType = sc.nextLine();
        	ticket.addTicketBookingDetails(seatNumber, ticketType);
        	}else {
        		System.out.println("Enter valid details in format (Seat Number: Ticket Type");
        	}
        }
        
        System.out.println("Enter the ticket type to count the seats filled");
        String searchType = sc.nextLine();
        
        int searchTypeCount = ticket.findTotalCountOfSeatNumbersBasedOnTicketType(searchType);
        
        if(searchTypeCount == 0) {
        	System.out.println("No tickets were booked in ticket type Standard");
        }else {
        	System.out.println("Number of seats filled in ticket type Elite is" + searchTypeCount);
        }
        
        System.out.println("Enter the ticket type to find seat numbers");
        String searchTicketType = sc.nextLine();
        
        List<String> listOfSeatNumbers = ticket.searchSeatNumbersByTicketType(searchTicketType);
        if(listOfSeatNumbers.isEmpty()) {
        	System.out.println("No tickets were booked in ticket type" + searchTicketType);
        }else {
        	System.out.println("Seat numbers in ticket type Elite are");
        	for(var v: listOfSeatNumbers) {
        		System.out.println(v);
        	}
        }
        sc.close();
        
    }
	
}
