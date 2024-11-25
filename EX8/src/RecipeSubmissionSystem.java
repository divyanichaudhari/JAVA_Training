public class RecipeSubmissionSystem {
	
    public boolean validateIngredientCount(String[] ingredients) throws InvalidDataException 
    {
    	if(ingredients.length < 3 || ingredients.length > 10) {
    		throw new InvalidDataException("Invalid Data exception");
    	}
    	
    
		return true; 
    
    } 
    	
    
    public boolean validatePreparationTime(int time) throws InvalidDataException
    	{
    	if(time > 120) {
    		throw new InvalidDataException("Invalid Exceed time");
    		
    	}
    		return true; 
    	
    	}	
    }
