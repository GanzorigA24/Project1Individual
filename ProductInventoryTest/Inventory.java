import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<Product>();
    }

    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product findProductByID(String productID) {
        for (Product product : products) {
            if (product.getID().equals(productID)) {
                return product;
            }
        }
        return null;
    }

    public boolean insertProduct(Product product) {
        if (findProduct(product.getName()) != null) {
            return false;
        }

        products.add(product);
        return true;
    }

    public Iterator<Product> getProducts() {
        return products.iterator();
    }
}