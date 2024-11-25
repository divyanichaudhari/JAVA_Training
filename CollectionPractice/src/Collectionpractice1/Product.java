package Collectionpractice1;

import java.util.HashMap;
import java.util.Map;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

class ProductManager {
    private Map<Integer, Product> productMap;

    public ProductManager() {
        productMap = new HashMap<>(); 
    }

    public void addProduct(int id, Product product) {
        productMap.put(id, product);
    }

    public Product getProduct(int id) {
        return productMap.get(id);
    }

    public void displayAllProducts() {
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
