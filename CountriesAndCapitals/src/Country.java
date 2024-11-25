import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

class Country {
    private Map<String, String> countryMap = new HashMap<>();

    public Map<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(Map<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    public void add(String countryName, String capitalName) {
    	boolean flag = true;
    	for(Map.Entry<String, String> m: countryMap.entrySet())
        if (countryName.equalsIgnoreCase(m.getKey())) {
        	flag= false;
        } 
    	if(flag)
    	{
            countryMap.put(countryName, capitalName);
        }
    }


    public String search(String countryName) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        } else if (countryMap.containsKey(countryName)) {
            return countryMap.get(countryName);
        } else {
            return "Data not found";
        }
    }
}