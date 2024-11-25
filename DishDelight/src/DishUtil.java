import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishUtil {

    public List<Dish> getDishesByCuisine(Stream<Dish> dishStream, String cuisine) {
    	return dishStream.filter(dish -> dish.getCuisine().equals(cuisine)).toList();
    	
//        return (List<Dish>) dishStream.filter(dish -> dish.getCuisine().equalsIgnoreCase(cuisine)
//        		.Collect.Collectors.toList());
    			//return null;
    }
    
}

