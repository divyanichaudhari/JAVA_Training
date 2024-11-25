
public class ProductDetails extends Product{
	String Name;
	float Price;
	
	public ProductDetails(String Name, float Price ) {
		this.Name = Name;
		this.Price = Price;
		
	}


	public String getProduct() {
		return Name;
	}
	
	public float getPrice() {
		return Price;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProductDetails that = (ProductDetails) obj;
        return Name.equals(that.Name) ; 
    }

    @Override
    public int hashCode() {
    	return   Name.hashCode();

    }
}
