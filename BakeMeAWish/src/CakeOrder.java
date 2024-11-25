import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CakeOrder {

	private Map<String,Double> orderMap=new HashMap<String,Double>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}
    
    public void addOrderDetails(String orderId, double cakeCost) {
    		this.orderMap.put(orderId, cakeCost);
	}
	
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost ) {
		Map<String, Double> CakeorderMap = new HashMap<String, Double>();

			for(Map.Entry<String , Double> entry:orderMap.entrySet()) {
				if(entry.getValue() > cakeCost) {
					CakeorderMap.put(entry.getKey(), entry.getValue());
			}
				
		}
		
		return CakeorderMap;
	}


}
