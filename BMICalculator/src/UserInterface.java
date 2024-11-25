import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in kg");
        double weight = sc.nextDouble();

        System.out.println("Enter height in cm");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);

        System.out.printf("Your BMI is %.2f. ", bmi);

        if (bmi >= 25) {
            double kgsToReduce = bmi - 25;
            System.out.println("You are overweight");
            System.out.printf("Reduce %.2f kg to be fit\n", kgsToReduce);
        } else if (bmi >= 18.5) {
            System.out.println("You are fit and healthy");
        } else {
            double kgsToGain = 18.5 - bmi;
            System.out.println("You are underweight");
            System.out.printf("Gain %.2f kg to be fit\n", kgsToGain);
        }

        sc.close();
    }
}
		
	


