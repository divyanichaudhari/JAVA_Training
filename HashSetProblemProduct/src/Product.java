import java.util.HashSet;
import java.util.Set;

public class Product {
    private Set<ProductDetails> productSet = new HashSet<>();

    public void addProduct(String name, float price) {
        ProductDetails productDetails = new ProductDetails(name, price);
        
        if (!productSet.add(productDetails)) {
            System.out.println("Product already exists.");
        } else {
            System.out.println("Product added successfully: " + productDetails.getProduct());
        }
    }

    public Set<ProductDetails> getProductSet() {
        return productSet;
    }
}
