import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        		

        // Get movie name and number of bookings
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        System.out.println("Enter no of bookings");
        int numberOfBookings = scanner.nextInt();
        scanner.nextLine();
        
        // Initialize available tickets for the movie
        System.out.println("Enter the available tickets");
        int availableTickets = scanner.nextInt();
        Ticket.setAvailableTickets(availableTickets);
        
        
        while (true) {

            // Input for each booking
            System.out.println("Enter the ticketid");
            ticket.setTicketid(scanner.nextInt());
            System.out.println("Enter the price");
            ticket.setPrice(scanner.nextInt());
            System.out.println("Enter the no of tickets");
            int noOfTickets = scanner.nextInt();

            // Display available tickets before booking
            System.out.println("Available tickets: " + Ticket.getAvailableTickets());

            // Calculate the total cost
            int totalAmount = ticket.calculateTicketCost(noOfTickets);

            if (ticket.getAvailableTickets()==0) {
            	
                System.out.printf("Total amount: %d%n", totalAmount);
                System.out.println("House full");
                break;
            } else if(totalAmount == -1) {

                System.out.println("Tickets are not available");
                
                
                } else {
           
                	System.out.println("Total amount:" + totalAmount);
                    System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
                }
            }
        }

    }



