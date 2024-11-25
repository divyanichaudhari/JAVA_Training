import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        BankAccount account = new BankAccount(500.00); // Initial balance of $500

		        System.out.println("Welcome to the Bank Account Management System");

		        while (true) {
		            System.out.println("\nChoose an option:");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Exit");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Enter amount to deposit:");
		                    double depositAmount = scanner.nextDouble();
		                    try {
		                        account.deposit(depositAmount);
		                        System.out.println("Successfully deposited: $" + depositAmount);
		                    } catch (InsufficientFundsException e) {
		                        System.out.println(e.getMessage());
		                    }
		                    break;

		                case 2:
		                    System.out.println("Enter amount to withdraw:");
		                    double withdrawAmount = scanner.nextDouble();
		                    try {
		                        account.withdraw(withdrawAmount);
		                        System.out.println("Successfully withdrew: $" + withdrawAmount);
		                    } catch (InsufficientFundsException e) {
		                        System.out.println(e.getMessage());
		                    }
		                    break;

		                case 3:
		                    System.out.println("Current Balance: $" + account.getBalance());
		                    break;

		                case 4:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    return;

		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		    


	}

}
