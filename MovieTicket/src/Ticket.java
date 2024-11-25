public class Ticket {
    // Private attributes
    private int ticketid;
    private int price;
    private static int availableTickets;

    // Getters and Setters
    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        Ticket.availableTickets = availableTickets;
    }

    // Method to calculate the ticket cost based on the number of tickets
    public int calculateTicketCost(int noOfTickets) {
        if (availableTickets >= noOfTickets ) {
        	int totalAmount = noOfTickets*price;
        	availableTickets -= noOfTickets;
        	return totalAmount;
        }else {
        	return -1;
        }
    }
}
