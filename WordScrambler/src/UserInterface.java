import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		//Fill the code here
		
		System.out.println("Enter the string");
		String sentence = sc.nextLine();
		String[] splitedSentence = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		String word1 = splitedSentence[0];
		String word2 = splitedSentence[1];
	
		//if(sentence.length() / 2 == 0) {
			
		
		if(sentence.matches("[^!@$&*?.][a-zA-Z\s]+{2,20}" ) ) {
			System.out.println("we should split the word by two characters and swap them");
			String[] words = word1.split(word1, 2);
			
			String[] words1 = word2.split(word2, 2);
			
			if(word1.length()/2 ==0) {
				
			}
				
			
		}else {
			System.out.println(" is an invalid string as it contain special character");
		}
		}
	}
	

