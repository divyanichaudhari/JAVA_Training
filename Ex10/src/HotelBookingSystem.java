import java.time.LocalDate;

public class HotelBookingSystem {

    boolean validateBookingDetails(int numberOfGuests, LocalDate checkInDate, LocalDate checkOutDate, String roomType, float paymentAmount) throws InvalidBookingDetailsException {
        if (numberOfGuests < 1 || numberOfGuests > 10) {
            throw new InvalidBookingDetailsException("Invalid number of guests: must be between 1 and 10.");
        }

        LocalDate currentDate = LocalDate.now();

        if (!checkInDate.isAfter(currentDate)) {
            throw new InvalidBookingDetailsException("Check-in date must be in the future.");
        }
        if (!checkOutDate.isAfter(checkInDate)) {
            throw new InvalidBookingDetailsException("Check-out date must be after the check-in date.");
        }

        if (!roomType.equals("Single") && !roomType.equals("Double") && !roomType.equals("Suite")) {
            throw new InvalidBookingDetailsException("Room type must be either 'Single', 'Double', or 'Suite'.");
        }

        if (paymentAmount <= 0) {
            throw new InvalidBookingDetailsException("Invalid payment amount: must be greater than 0.");
        }

        return true;
    }

    float calculatePayment(String roomType, int numberOfNights) throws InvalidBookingDetailsException {
        float total = 0;

        switch (roomType) {
            case "Single":
                total = 100 * numberOfNights;
                break;
            case "Double":
                total = 150 * numberOfNights;
                break;
            case "Suite":
                total = 200 * numberOfNights;
                break;
            default:
                throw new InvalidBookingDetailsException("Error: Invalid room type.");
        }

        return total;
    }
}
