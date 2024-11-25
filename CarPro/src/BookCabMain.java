import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookCabMain {

	private Map<String, Date> bookingMap = new HashMap<String, Date>();

	public Map<String, Date> getBookingMap() {
		return bookingMap;
	}

	public void setBookingMap(Map<String, Date> bookingMap) {
		this.bookingMap = bookingMap;
	}
	public void addBookingMap(String CabId, Date BookingDate  ){
		this.bookingMap.put(CabId, BookingDate);
	}
	
	public List<String> findCabBookingIdsForTheBookingDate(Date date) {

		 List<String> CabBookIdsList = new ArrayList<String>();
		 
		for(Map.Entry<String, Date> p:bookingMap.entrySet()) {

		if(p.getValue().equals(date)) {
			CabBookIdsList.add(p.getKey());
		}
		
	}
		return CabBookIdsList;

	}
}
