import java.util.Map;
import java.util.HashMap;

public class Apartment {

	private Map<String, Double> apartmentDetailsMap = new HashMap<String, Double>();

    public Map<String, Double> getApartmentDetailsMap() {
		return apartmentDetailsMap;
	}

	public void setApartmentDetailsMap(Map<String, Double> apartmentDetailsMap) {
		this.apartmentDetailsMap = apartmentDetailsMap;
	}
	
	public void addApartmentDetails(String apartmentNumber, double rent) {
        this.apartmentDetailsMap.put(apartmentNumber, rent);
    
	}

	public double findTotalRentOfApartmentsInTheGivenRange(double minimumRent, double maximumRent) {
		double totalrent = 0.0;
		
		for(Map.Entry<String, Double> entry : apartmentDetailsMap.entrySet()) {
			if(entry.getValue()>=minimumRent && entry.getValue()<=maximumRent) {
				totalrent += entry.getValue();
			}
		}
		return totalrent;
	}

}
