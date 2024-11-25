import java.util.regex.Pattern;

public class EntryUtility {
    private static final String EMPLOYEE_ID_PATTERN = "GOAIR/\\d{4}";

    public static boolean validateEmployeeId(String employeeId) throws InvalidEntryException {
        // Check for null or empty string
        if (employeeId == null || employeeId.length() != 10) {
            throw new InvalidEntryException("Employee ID must be exactly 10 characters long.");
        }

        // Validate the pattern
        if (!employeeId.matches(EMPLOYEE_ID_PATTERN)) {
            throw new InvalidEntryException("Invalid employee ID format. It must start with 'GOAIR/' followed by 4 digits.");
        }

        return true; // If valid, return true
    }

    public static boolean validateDuration(int duration) throws InvalidEntryException {
        // Check if duration is between 1 and 5 (inclusive)
        if (duration < 1 || duration > 5) {
            throw new InvalidEntryException("Duration must be between 1 and 5 (inclusive).");
        }

        return true; // If valid, return true
    }
}
