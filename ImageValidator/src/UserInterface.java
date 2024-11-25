import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        ImageValidatorSystem image = new ImageValidatorSystem();
        try {
        System.out.println("Enter the user Name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter the title of Image:");
        String title = scanner.nextLine();
        
        System.out.println("Enter the size of Image (in KB):");
        int imageSize = scanner.nextInt();
        
        System.out.println("Enter the width of Image (in pixels):");
        int width = scanner.nextInt();
        
        System.out.println("Enter the height of Image (in pixels):");
        int height = scanner.nextInt();
        
        boolean imagesizeValidation = image.validateImageSize(imageSize);
        
        boolean imageresolutionValidation = image.validateImageResolution(width, height);
        
        if(imageresolutionValidation && imagesizeValidation) {
        	System.out.println("Thank you for uploading the image");
        }
        
        double totalcost = image.calculateUploadCost(imageSize);
        
        if(totalcost == 0) {
        	System.out.println("TotalCost is zero");
        }else {
        	System.out.println("Upload cost: " + "$" +totalcost);
        }
        }catch(InvalidDataException e) {
        	System.out.println(e.getMessage());
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }finally {
        	scanner.close();
        }
        
    }
}