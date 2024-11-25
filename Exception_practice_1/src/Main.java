
public class Main {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(100.4);

		try {
			account.withdraw(80);
			System.out.println("current balance");
		}catch(InsufficientFundException e){
			System.out.println("Error"+ e.getMessage());
			
		}
	}

}
