import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class AccountManager {
    private static final double MAX_DEPOSIT_LIMIT = 10000.00;
    private Map<String, String> users; // Maps username to password
    private Map<String, Double> balances; // Maps username to balance

    public AccountManager() {
        users = new HashMap<>();
        balances = new HashMap<>();

        users.put("john_doe", "Password123!");
        balances.put("john_doe", 1000.00);
    }

    public void validateCredentials(String username, String password) throws InvalidCredentialsException {
        if (!isValidUsername(username) || !isValidPassword(password)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        }
    }

    public void deposit(String username, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            return;
        }
        if (amount > MAX_DEPOSIT_LIMIT) {
            System.out.println("Deposit amount exceeds maximum limit of $" + MAX_DEPOSIT_LIMIT + ". Please enter a smaller amount.");
            return;
        }
        double newBalance = balances.get(username) + amount;
        balances.put(username, newBalance);
        System.out.printf("Deposit Successful. New Balance: $%.2f%n", newBalance);
    }

    public void withdraw(String username, double amount) throws InsufficientFundsException {
        double currentBalance = balances.get(username);
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            return;
        }
        if (amount > currentBalance) {
            throw new InsufficientFundsException("Insufficient Funds. Current Balance: $" + currentBalance);
        }
        double newBalance = currentBalance - amount;
        balances.put(username, newBalance);
        System.out.printf("Withdrawal Successful. New Balance: $%.2f%n", newBalance);
    }

    public double checkBalance(String username) {
        return balances.get(username);
    }

    private boolean isValidUsername(String username) {
        return username.length() >= 6 && username.matches("[a-zA-Z0-9_]+");
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8 &&
               Pattern.compile("[A-Z]").matcher(password).find() && // At least one uppercase letter
               Pattern.compile("[a-z]").matcher(password).find() && // At least one lowercase letter
               Pattern.compile("[0-9]").matcher(password).find() && // At least one digit
               Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find(); // At least one special character
    }
}
