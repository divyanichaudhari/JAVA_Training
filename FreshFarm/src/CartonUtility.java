import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
 
public class CartonUtility {
	private List<Carton> cartonList;
	//FILL THE CODE HERE
 
	public List<Carton> getCartonList() {
		return cartonList;
	}
 
	public void setCartonList(List<Carton> cartonList) {
		this.cartonList = cartonList;
	}
 
	public Stream<Carton> convertToStream() {

		return cartonList.stream();
	}
 
	public Carton findMax(Stream<Carton> stream1) 
	{
		//return stream1.max((c1,c2)->Integer.compare(c1.getQuantity(), c2.getQuantity())).orElse(null);
		return stream1.max(Comparator.comparing(Carton::getQuantity)).orElse(null);
		
		
	}

													
}