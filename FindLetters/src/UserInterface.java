import java.util.*;
public class UserInterface{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		        System.out.println("Enter the word");
		        String word = sc.nextLine();

		        System.out.println("Enter the two indices");
		        
		        if (!sc.hasNextInt()) {
		            System.out.println("Invalid input for index1");
		            sc.close();
		            return;
		        }
		        int index1 = sc.nextInt();

		        if (!sc.hasNextInt()) {
		            System.out.println("Invalid input for index2");
		            sc.close();
		            return;
		        }
		        int index2 = sc.nextInt();

		        if (index1 < 0 || index2 < 0) {
		            System.out.println("Indices must be non-negative");
		        } else if (index1 >= index2) {
		            System.out.println("Index2 should be greater than Index1");
		        } else if (index1 >= word.length()) {
		            System.out.printf("%d is greater than the word length\n", index1);
		        } else if (index2 >= word.length()) {
		            System.out.printf("%d is greater than the word length\n", index2);
		        } else {
		            System.out.println(word.substring(index1, index2));
		        }

		        sc.close();
		    }
		}
