import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word count");
		int wc= sc.nextInt();
		
		if(wc>=2) {
			System.out.println("Invalid word count");
		}
		
		System.out.println("Enter the words");
		String[] words = new String[wc];
		
		for(int i=0; i<wc; i++) {
			if(words[i].matches("[a-zA-z]+")){
			
			}
			{
				
			}
		}
	}
}
