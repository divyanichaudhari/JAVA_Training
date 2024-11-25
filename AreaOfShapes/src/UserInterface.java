import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the sides");
        int sides = sc.nextInt();

        switch (sides) {
            case 0:
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                double areaCircle = 3.14 * radius * radius;
                System.out.printf("Area of the Circle is %.2f\n", areaCircle);
                break;

            case 3:
               System.out.println("Enter the base and height");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double areaTriangle = (base * height) / 2;
                System.out.printf("Area of the Triangle is %.2f\n", areaTriangle);
                break;

            case 4:
                System.out.println("Enter the length");
                double length = sc.nextDouble();
                System.out.println("Enter the breadth");
                double breadth = sc.nextDouble();
                
                if (length == breadth) {
                    double areaSquare = length * length;
                    System.out.printf("Area of the Square is %.2f\n", areaSquare);
                } else {
                    double areaRectangle = length * breadth;
                    System.out.printf("Area of the Rectangle is %.2f\n", areaRectangle);
                }
                break;

            default:
                System.out.println("Invalid side");
                break;
        }

        sc.close();
    }
}
	 