import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Products {
    private List<String> productList = new ArrayList<>();

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }
}
