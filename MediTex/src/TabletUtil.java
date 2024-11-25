import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TabletUtil {
	
	public List<Tablet> retrieveTabletsByBrand(Stream<Tablet> tabletStream, String brand) {
        
        return tabletStream.filter(tablet->tablet.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
    }
	
	public List<String> getTabletsAboveMg(Stream<Tablet> tabletStream, int mg) {	    
		return tabletStream
		        .filter(tablet -> tablet.getMg() >= mg)
		        .map(Tablet::getName) 
		        .collect(Collectors.toList());
	}
}

