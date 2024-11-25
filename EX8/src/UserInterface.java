import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecipeSubmissionSystem Rs = new RecipeSubmissionSystem();
		
		try {
		System.out.println("Enter the user Name:");
		String name =  sc.nextLine();
		
		System.out.println("Enter the recipe title:");
		String title = sc.nextLine();
		
		System.out.println("Enter the list of ingredients (comma-separated):");
		String input = sc.nextLine();
		
		String[] ingredients = input.split(",");
		
		System.out.println("Enter the preparation time (in minutes)");
		int time = sc.nextInt();
		
		boolean  ing = Rs.validateIngredientCount(ingredients);
		boolean time2 = Rs.validatePreparationTime(time);
		
		if(ing && time2) {
            System.out.println("Thank you, your recipe titled \"" + title + "\" has been successfully submitted!");
		}
		}catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
	}

}
