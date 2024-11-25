import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
	String Name;
	float Price;
	
	public Product(String Name, float Price ) {
		this.Name = Name;
		this.Price = Price;
		
	}


	public String getProduct() {
		return Name;
	}
	
	public float getPrice() {
		return Price;
	}
	

    @Override
	public String toString() {
		return "Product [Name=" + Name + ", Price=" + Price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(Name, Price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Name, other.Name) && Float.floatToIntBits(Price) == Float.floatToIntBits(other.Price);
	}

    
    
}
