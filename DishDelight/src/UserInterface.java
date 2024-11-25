import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
	
	 static List<String> Dish = new ArrayList<String>();
	 
     Dish dish = new Dish();
     DishUtil du = new DishUtil();
     //Stream<String> dishStream = new  Stream<String>();
     
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dishes");
        int n = sc.nextInt();
        sc.nextLine();
       
        
        for(int i=0; i<n ; i++) {
            System.out.println("Enter the dish "+ i +  " details");

        	String st = sc.nextLine();
            String[] parts = st.split(":");
            
        	String dishName = parts[0];
        	String cuisine = parts[1];
        	Double price = Double.parseDouble(parts[2]);
        	Double rating = Double.parseDouble(parts[3]);
        	
        	Dish di = new Dish(dishName, cuisine, price, rating );
        	
			if(parts.length == 3) {
				//Dish.add(di);
				
			}else {
				System.out.println("Invalid Input type");
			}
			
        	
        	
        }
    }
}
