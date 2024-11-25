import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CadetService {
	
	public List<Cadet> retrieveDetailsByGroupName(Stream<Cadet> cadetStream, String groupName) {
		return cadetStream.filter(cadet->cadet.getGroupName().equals(groupName)).collect(Collectors.toList());
	}
	
	public Stream<Cadet> retrieveDetailsByAge(Stream<Cadet> cadetStream, int age) {
        // Fill the code
         return cadetStream.filter(cadet->cadet.getAge() >= age);
	}
	
	public Stream<Cadet> retrieveCadetDetailsByAgeForGivenCount(Stream<Cadet> cadetStream, int count){
	    // Fill the code
        return cadetStream.sorted(Comparator.comparingInt(Cadet::getAge).reversed()).limit(count);
    }

}
