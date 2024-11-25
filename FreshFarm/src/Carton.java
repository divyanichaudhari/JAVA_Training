public class Carton {
	private String productName;
	private int quantity;
	private double productCost;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	public Carton(String productName, int quantity, double productCost) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.productCost = productCost;
	}

}