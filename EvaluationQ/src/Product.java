
public class Product {
	
	private String name;
	private int Quantity;
	
	
	public Product(String name) {
        this.name = name;
        this.Quantity = 0;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	

}
