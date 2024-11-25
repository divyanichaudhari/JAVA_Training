import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class athleteDetails {
    private Map<Double, String> athleteMap = new HashMap<Double, String>();
    
    public Map<Double, String> getAthleteMap() {
        return athleteMap;
    }

    public void setAthleteMap(Map<Double, String> athleteMap) {
    	this.athleteMap = athleteMap;
    }
    
    public void addAthleteDetails(double timeTaken, String athleteName) {
    	this.athleteMap.put(timeTaken, athleteName);
    }
    
    public double findTimeTaken(String athleteName) {
    	for(Map.Entry<Double, String> e:athleteMap.entrySet()) {
    		
    	if(e.getValue().equals(athleteName)) {
    		e.getKey();
    	}
    }
    		return -1;
    }
    
		public List<String> findThreeBestPerformers(){
			Map<Double, String> t1 = new TreeMap<Double, String>(athleteMap).reversed();
			
			List<String> l1 = new ArrayList<String>();
			
			 for(Map.Entry<Double, String> entry: t1.entrySet()) {
				 if(entry.getKey()<=3) {
					 l1.add(entry.getValue());
				 }
				 
			 }
			
			return l1;
			

    }
}
