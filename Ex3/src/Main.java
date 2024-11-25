import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        healthdataProcessor processor = new healthdataProcessor();

		        try {
		            System.out.println("Enter Name");
		            String name = scanner.nextLine();

		            System.out.println("Enter Age");
		            int age = scanner.nextInt();

		            System.out.println("Enter Gender");
		            String gender = scanner.next();

		            System.out.println("Enter Height (in meters)");
		            double height = scanner.nextDouble();

		            System.out.println("Enter Weight (in kg)");
		            double weight = scanner.nextDouble();

		            System.out.println("Enter Blood Pressure (mmHg)");
		            int bloodPressure = scanner.nextInt();

		            System.out.println("Enter Cholesterol Level");
		            double cholesterol = scanner.nextDouble();

		            if (processor.validatePatientDetails(age, gender, height, weight, bloodPressure, cholesterol)) {

		            	double premium = processor.calculateInsurancePremium(height, weight, age, bloodPressure, cholesterol);
		                System.out.printf("Total Insurance Premium: $%.2f%n", premium);
		            }
		        } catch (InvalidHealthException e) {
		            System.out.println(e.getMessage());
		        } catch (Exception e) {
		            System.out.println("An unexpected error occurred: " + e.getMessage());
		        } finally {
		            scanner.close();
		        }
		    }
		}



