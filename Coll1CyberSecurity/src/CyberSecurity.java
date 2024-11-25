import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CyberSecurity {
    private Set<String> cyberSecuritySet = new HashSet<>();

    public Set<String> getCyberSecuritySet() {
        return cyberSecuritySet;
    }

    public void setCyberSecuritySet(Set<String> cyberSecuritySet) {
        this.cyberSecuritySet = cyberSecuritySet;
    }

    public void addCyberSecurity(String details) {
        this.cyberSecuritySet.add(details);
    }

    public int findCountOfAnalysis(String cyberSecurityType) {
        int count = 0;  // Initialize count of matching cybersecurity types

        // Loop through each record in the set
        for (String record : cyberSecuritySet) {
            String[] parts = record.split(":");  // Split the record into ID and cybersecurity type
            
            // Check if we have exactly two parts
            if (parts.length == 2) {
                String cyber = parts[1].trim();  // Get the cybersecurity type and remove any whitespace
                // Increment count if the cybersecurity type matches
                if (cyber.equalsIgnoreCase(cyberSecurityType)) {
                    count++;
                }
            }
        }
        // Return count or -1 if no matches were found
        return count == 0 ? -1 : count;  
    }

    public List<String> findIdsOfAnalysist(String cyberSecurityType) {
        List<String> matchingIds = new ArrayList<>();  // List to hold matching analyst IDs

        // Loop through each record in the set
        for (String record : cyberSecuritySet) {
            String[] parts = record.split(":");  // Split the record into ID and cybersecurity type
            
            // Check if we have exactly two parts
            if (parts.length == 2) {
                String id = parts[0].trim();  // Get the analyst ID
                String cyber = parts[1].trim();  // Get the cybersecurity type
                
                // Add the ID to the list if the type matches
                if (cyber.equalsIgnoreCase(cyberSecurityType)) {
                    matchingIds.add(id);
                }
            }
        }
        return matchingIds;  // Return the list of matching IDs
    }
}