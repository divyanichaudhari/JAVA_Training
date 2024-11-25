import java.util.Scanner;
 
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Get input from the user
        System.out.println("Enter the name");
        String name = scanner.nextLine();
 
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
 
        System.out.println("Enter the gender");
        String gender = scanner.nextLine();
 
        System.out.println("Enter the blood group");
        String bloodGroup = scanner.nextLine();
 
        System.out.println("Enter the phone no");
        long phoneNumber = scanner.nextLong();
 
        // Create DonorDetails object
        DonorDetails donor = new DonorDetails(name, age, gender, bloodGroup, phoneNumber);
 
        // Display the donor details
        System.out.println();
        System.out.println("Name:" + donor.getName());
        System.out.println("Age:" + donor.getAge());
        System.out.println("Gender:" + donor.getGender());
        System.out.println("Blood group:" + donor.getBloodGroup());
        System.out.println("Phone no:" + donor.getPhoneNumber());
 
        // Close the scanner
        scanner.close();
    }
}
 
