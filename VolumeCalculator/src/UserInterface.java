import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        
        // Display options to the user
        System.out.println("Enter the choice");
        System.out.println("1. Find Volume For Cylinder");
        System.out.println("2. Find Volume For Cuboid");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1: // Volume of Cylinder
                System.out.println("Enter the radius");
                double radius = scanner.nextDouble();
                System.out.println("Enter the height");
                double height = scanner.nextDouble();
                
                double cylinderVolume = volumeCalculator.calculateVolume(radius, height);
                System.out.printf("Volume of the Cylinder is %.2f%n", cylinderVolume);
                break;
                
            case 2: // Volume of Cuboid
                System.out.println("Enter the length");
                int length = scanner.nextInt();
                System.out.println("Enter the breadth");
                int breadth = scanner.nextInt();
                System.out.println("Enter the height");
                int cuboidHeight = scanner.nextInt();
                
                double cuboidVolume = volumeCalculator.calculateVolume(length, breadth, cuboidHeight);
                System.out.printf("Volume of the Cuboid is %.2f%n", cuboidVolume);
                break;
                
            default:
                System.out.println("Invalid choice");
                break;
        }
        
        scanner.close();
    }
}
