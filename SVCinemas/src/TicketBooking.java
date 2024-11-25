import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TicketBooking {

    private Map<String, String> ticketMap = new HashMap<>();

    public Map<String, String> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(Map<String, String> ticketMap) {
        this.ticketMap = ticketMap;
    }
    
    //This method should add the seatNumber as key and their ticketType as value into a Map
    public void addTicketBookingDetails(String seatNumber,String ticketType) {
    	this.ticketMap.put(seatNumber, ticketType);
    }

    //This method returns the number of seatNumber with the specified ticketType
    public int findTotalCountOfSeatNumbersBasedOnTicketType(String ticketType) {
        int count = 0;
        
        
        String seatNumber = ticketMap.get(ticketType);

        for(Map.Entry<String, String> entry:ticketMap.entrySet()) {
        	
        	
        	if(entry.getValue().equals(ticketType)) {	
        		count++;
        	}

        	}
        return count;
   
    }

    //This method should return the list of bookingNumber for the specific travelMode which is passed as the argument
    public List<String> searchSeatNumbersByTicketType(String ticketType) {
         List<String> listOfSeatNumber = new ArrayList<String>();
         
         for(Map.Entry<String, String> entry:ticketMap.entrySet()) {
        	 if(entry.getValue().equalsIgnoreCase(ticketType)) {
        		 listOfSeatNumber.add(entry.getKey());
        	 }
        
    }
         return listOfSeatNumber;
    }
    
}
