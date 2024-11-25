public class Main {
    public static void main(String[] args) {
        Product productManager = new Product();
        
        productManager.addProduct("Laptop", 999.99f);
        productManager.addProduct("Phone", 499.99f);
        productManager.addProduct("Laptop", 999.99f); 
        productManager.addProduct("Laptop", 900.91f);
        for (ProductDetails product : productManager.getProductSet()) {
        	
            System.out.println(product);
        }
    }
}
