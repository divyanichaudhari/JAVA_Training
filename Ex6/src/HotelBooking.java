import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HotelBooking {

    public void validateUserDetails(int age, String email, String creditCard) throws InvalidBookingDetailsException {
        if (age < 18 || age > 100) {
            throw new InvalidBookingDetailsException("Invalid age");
        }
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidBookingDetailsException("Invalid email");
        }
        if (creditCard.length() != 16) {
            throw new InvalidBookingDetailsException("Invalid credit card number");
        }
    }

    public void validateBookingDetails(String hotelName, String roomType, LocalDate checkInDate, LocalDate checkOutDate) throws InvalidBookingDetailsException {
        if (!isRecognizedHotel(hotelName)) {
            throw new InvalidBookingDetailsException("Invalid hotel name");
        }
        if (!roomType.equals("Standard") && !roomType.equals("Deluxe") && !roomType.equals("Suite")) {
            throw new InvalidBookingDetailsException("Invalid room type");
        }
        
        if (!checkInDate.isAfter(LocalDate.now())) {
            throw new InvalidBookingDetailsException("Invalid check-in date");
        }
        if (!checkOutDate.isAfter(checkInDate)) {
            throw new InvalidBookingDetailsException("Invalid check-out date");
        }
    }

    private boolean isRecognizedHotel(String hotelName) {
        return hotelName.equals("Hilton") || hotelName.equals("Marriott") || hotelName.equals("Hyatt");
    }
    
    public Double calculateBookingCost(String roomType, int numNights, boolean breakfastIncluded) {
    	double Cost=0;
    	if(roomType.equals("Standard")) {
    		if(breakfastIncluded == true) {
    		 Cost = (1000 * numNights) + 100;
    		} 
    		else {
    			 Cost= 1000 * numNights;
    			
    		}
    		
    	}
    	
    	else if(roomType.equals("Deluxe")) {
    		if(breakfastIncluded == true) {
    		 Cost = (2000 * numNights) + 100;
    		} 
    		else {
    			 Cost= 2000 * numNights;
    		}
    		
    	}
    	
    	else if(roomType.equals("Suite")) {
    		if(breakfastIncluded == true) {
    		 Cost = (3000 * numNights) + 100;
    		} 
    		else {
    			 Cost= 3000 * numNights;
    		}
    		
    	}
		return Cost;
    	
    	
    }
}
