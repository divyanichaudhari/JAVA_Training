
public class BankAccount {
	private double balance;
	
	public BankAccount(double intitialBalance) {
		if(intitialBalance<0) {
		 System.out.println("Your balance is 0");
		 
		}
			this.balance = intitialBalance;
		
	}
	
	public void deposite(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("deposited"+ amount);
		}else {
			System.out.print("deposited amount is negetive");
			
		}
	}
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount<0) {
			throw new InsufficientFundException("hello");
		}
	
	
	}
}
