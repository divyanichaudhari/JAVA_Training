import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class GadgetUtility {

    public List<Gadget> retrieveGadgetsByType(Stream<Gadget> gadgetStream, String type) {
    	return gadgetStream.filter(s-> s.getType().equals(type)).toList();
        //Fill the code here
    }

    public List<Gadget> retrieveGadgetsByManufacturer(Stream<Gadget> gadgetStream, String manufacturer) {
       //Fill the code here
    	return gadgetStream.filter(s ->s.getManufacturer().equals(manufacturer)).toList();
    }

    public List<Gadget> filterAndSortGadgetsByPrice(Stream<Gadget> gadgetStream) {
        //Fill the code here
    	return gadgetStream.sorted(Comparator.comparing(Gadget::getPrice)).toList();
    	
    }
    
    public Gadget findMostExpensiveGadget(Stream<Gadget> gadgetStream) {
    	return gadgetStream.max(Comparator.comparing(Gadget::getPrice)).orElse(null);

    }
    
    public List<Gadget> retrieveGadgetsByPriceRange(Stream<Gadget> gadgetStream, double minPrice, double maxPrice) {
    		return gadgetStream.filter(gadget -> gadget.getPrice() >= minPrice && gadget.getPrice() <= maxPrice).toList();
    }
    
    public List<String> getUniqueManufacturers(Stream<Gadget> gadgetStream) {
    		return gadgetStream.map(Gadget::getManufacturer).distinct().toList();
    }
    
    public List<Gadget> retrieveGadgetsByNameLength(Stream<Gadget> gadgetStream, int length) {
    		return gadgetStream.filter(p->p.getName().length() == length).toList();
    }
    
    
    public Gadget findGadgetByName(Stream<Gadget> gadgetStream, String name) {
    	return gadgetStream.filter(p->p.getName().equals(name)).findFirst().orElse(null);
    }
    
    public Gadget getCheapestGadget(Stream<Gadget> gadgetStream) {
    	return gadgetStream.min(Comparator.comparing(Gadget::getPrice)).orElse(null);
    }
}
      