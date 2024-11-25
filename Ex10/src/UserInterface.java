import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelBookingSystem Hbs = new HotelBookingSystem();

        try {
            System.out.println("Enter the number of guests:");
            int numberOfGuests = sc.nextInt();
            sc.nextLine();  

            System.out.println("Enter the check-in date (yyyy-MM-dd):");
            String checkInDate = sc.nextLine();
           LocalDate checkIn = LocalDate.parse(checkInDate);
           
         //  Date date = Date.parse(checkInDate);
            
        //    SimpleDateFormat sm = SimpleDateFormat("yyyy-MM-dd");
            
        //    Date date = sm.parse(checkInDate);
            
            System.out.println("Enter the check-out date (yyyy-MM-dd):");
            String checkOutDate = sc.nextLine();
            LocalDate checkOut = LocalDate.parse(checkOutDate);

            System.out.println("Enter the room type (Single/Double/Suite):");
            String roomType = sc.nextLine();

            int numberOfNights = (int) (checkOut.toEpochDay() - checkIn.toEpochDay());
            
            
            if (numberOfNights <= 0) {
                System.out.println("Check-out date must be after check-in date.");
                return; 
            }

            float totalPayment = Hbs.calculatePayment(roomType, numberOfNights);

            System.out.println("Total payment for your stay: $" + totalPayment);

            boolean booking = Hbs.validateBookingDetails(numberOfGuests, checkIn, checkOut, roomType, totalPayment);

            if (booking) {
                System.out.println("Booking details are valid.");
            }

        } catch (InvalidBookingDetailsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

	
}
