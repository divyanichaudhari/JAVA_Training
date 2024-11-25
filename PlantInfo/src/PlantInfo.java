import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlantInfo {
	
	 private Map<String, Float> PlantDetailsMap = new HashMap<String, Float>();
	
	public Map<String, Float> SetPlantDetails(){
		return PlantDetailsMap;
	}
	
	public void getPlantDetails(Map<String, Float> PlantDetailsMap) {
		this.PlantDetailsMap = PlantDetailsMap;
	}
	
	public void addPlantDetails(String PlantName, float Rating){
		this.PlantDetailsMap.put( PlantName ,  Rating);
	}
	
	public float findPlantName(String PlantName) {
		Float Rating = PlantDetailsMap.get(PlantName.toLowerCase());
		if(Rating!= null ) {
			return Rating;
		}else {
		return -1.0F;
		}
	}
		
		public List<String> findHighestPlantRating() {
		List<String> HighestRating = new ArrayList<>();
        for (Map.Entry<String, Float> entry : PlantDetailsMap.entrySet()) {
            if (entry.getValue() == 5.0f) {
				HighestRating.add(entry.getKey());
			}

		}			return HighestRating;

	}
	}

