
public class healthdataProcessor {
	public boolean validatePatientDetails(int age, String gender, double height, double weight, int bloodPressure, double cholesterol) throws InvalidHealthException {
		if(!(age>=18 && age <=100)) {
			throw new InvalidHealthException("Invalid age");
			}
		if (!gender.equalsIgnoreCase("Male") || !gender.equalsIgnoreCase("Female")) {
		
			throw new InvalidHealthException("Invalid gender");
		}
		
		if(height<=0) {
		throw new InvalidHealthException("Invalid Height");
		}
		if(weight<=0) {
			throw new InvalidHealthException("Invalid weight");
		}
		
		if(!(bloodPressure<220 && bloodPressure>60)) {
			throw new InvalidHealthException("Invalid bp");
		}
		
		if(cholesterol<0) {
			throw new InvalidHealthException("Invalid cholestrol");
		}
	
		return true;

	}
		public double calculateInsurancePremium(	double height, double weight, int age, int bloodPressure, double cholesterol) {
			double bmi = weight / (height * height); 
	        double premium = 0;

	        if (bmi > 30 || bloodPressure > 140 || cholesterol > 240) {
	            premium = 1500; // Very high risk
	        } else if (bmi > 25 || bloodPressure > 120 || cholesterol > 200) {
	            premium = 1000; // High risk
	        } else {
	            premium = 750; // Normal risk
	        }
		
	        return premium;
		

}
}
