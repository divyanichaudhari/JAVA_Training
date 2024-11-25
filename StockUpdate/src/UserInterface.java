import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeightValidatorUtil W = new WeightValidatorUtil();
        
        System.out.println("Enter the number of item entries");
        String input = sc.nextLine();
        
        try {
        	String[] parts = input.split(":");
        	int weight = Integer.parseInt(parts[2]);
        	
        	W.validateItemWeight(weight);
        	if(ls.isEmpty()) {
        		System.out.println("");
        	}
        	for(Var v:ls) {
        		
        	}
        } catch (Exception e) {
        }
    }
}
