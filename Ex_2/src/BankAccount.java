public class BankAccount {
    private double balance; // Variable to hold the current balance

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance; // Initialize the balance
        } else {
            this.balance = 0; // Default to zero if negative
        }
    }

    public void deposit(double amount) throws InsufficientFundsException {
        if (amount > 0) {
            balance += amount; // Add the amount to the balance
        } else {
            throw new InsufficientFundsException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Balance is insufficient");
        } else {
            balance -= amount; // Deduct the amount from the balance
        }
    }

    public double getBalance() {
        return balance; // Return the current balance
    }
}
