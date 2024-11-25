
public class ImageValidatorSystem {
	public boolean validateImageSize(int imageSize) throws InvalidDataException {
        //fill the code here
		if(imageSize > 20) {
			throw new InvalidDataException("Image Size exceeds 20KB");
		}
        return true;
    }

    public boolean validateImageResolution(int width, int height) throws InvalidDataException  {
    	int product = width* height;
         if(product > 1024 *768) {
        	 throw new InvalidDataException("Image Resolution exceeds 1024x768 pixels");
         }
       return true;
    }

    public double calculateUploadCost(int imageSize) throws InvalidDataException {
    	double cost = 0.0;
    	double totalcost =0.0;
    	//boolean v = validateImageResolution(imageSize, imageSize);
    	//boolean v1 = validateImageSize(imageSize);
    	

    	
       if(imageSize < 10) {
    	   
    	  return totalcost=0.0;
    	   
    	}else {
    		for(int i= 10 ; i<imageSize ; i++) {
    		double rem = 0.50;
 
    		   totalcost += rem ;
    		
    	}	
    		
           return totalcost ;
    	
		
    }
    }
}
