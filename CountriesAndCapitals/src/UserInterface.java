import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Country obj = new Country();

        while (true) {
            System.out.println("1.Add\n2.Search\n3.Exit\nEnter your choice");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter the country name");
                    String countryName = sc.nextLine();
                    System.out.println("Enter the capital name");
                    String capitalName = sc.nextLine();
                    obj.add(countryName, capitalName);
                    break;

                case 2:
                    if (obj.getCountryMap().isEmpty()) {
                        System.out.println("The Map is Empty");
                    } else {
                        System.out.println("Enter the country name");
                        String searchCountry = sc.nextLine();
                        String capital = obj.search(searchCountry);
                        System.out.println(capital);
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application");
                    sc.close(); 
                    return; 

                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }
    }
}