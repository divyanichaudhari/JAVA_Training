import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	public static void main(String args[])throws ParseException {
	    BookCabMain cab = new BookCabMain();
		Map<String, Date> map = new HashMap<String, Date>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of bookings to be added");
		int n = sc.nextInt();
		System.out.println("Enter the Booking details (Booking Id:Date of Booking)");
		String[] bookingDetails = new String[n];
		for (int i = 0; i < n; i++) {
			bookingDetails[i] = sc.next();
		}
 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 
		for (int i = 0; i < bookingDetails.length; i++) {
			String[] a = bookingDetails[i].split(":");
			map.put(a[0], simpleDateFormat.parse(a[1]));
			cab.setBookingMap(map);
		}
 
		System.out.println("Enter the date to check the booking");
		String date=sc.next();
		List<String> booking=cab.findCabBookingIdsForTheBookingDate(simpleDateFormat.parse(date));
		if(booking.isEmpty())
			System.out.println("No bookings were booked");
		else
		{
			System.out.println("Booking Ids booked on the "+date+" are by");
			booking.forEach(System.out::println);
		}
		// Invoke the findCabBookingIdsForTheBookingDate method and print the bookingIds
 
		// Fill the code here
	}
}