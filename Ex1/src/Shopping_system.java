import java.time.LocalDate;

public class Shopping_system {
	public boolean InvalidOrderDetails(int quant,float price,String orderdate,String deliverydate) throws InvalidOrderDetailsException {
		if(quant<=0) {
			throw new InvalidOrderDetailsException("Invalid Input, Enter the positive number");
		}
		if(price<=0) {
			throw new InvalidOrderDetailsException("enter the positive value");
		}
		LocalDate l1=LocalDate.parse(orderdate);
		LocalDate l2 = LocalDate.parse(deliverydate);
		
		if(l1.isAfter(l2)) {
			throw new InvalidOrderDetailsException("Invalid date: the day is must be after the l2");
		}
		
		return true;
	}
	
	public String getreturnstatus() {
		return "order details are valid. ";
	}
	
	

}
