
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
        System.out.print("Enter the principal amount: ");
        double principal = Scanner.nextDouble();
        
        System.out.print("Enter the rate: ");
        double rate = Scanner.nextDouble();
        
        System.out.println("Enter the amount");
        double time = Scanner.nextDouble();
        
        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest is:" + compoundInterest);
        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest is:" + simpleInterest);

        
	}

	private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;

	}

	private static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;

	}
}
		