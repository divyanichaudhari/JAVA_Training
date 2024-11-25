public class WeightValidatorUtil {
    public boolean validateItemWeight(int itemWeight)  throws InvalidWeightException{
    	if(itemWeight > 5000 || itemWeight < 100) {
    		throw new InvalidWeightException("Invalid item weight");
    	}
    	
		return true;
    }
}
