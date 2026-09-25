public class Product {
    private String productID;
    private String name;
    private int quantity;
    private double salePrice;

    private static int nextID = 1;

    public Product(String name, int quantity, double salePrice) {
        this.productID = "P" + nextID++;
        this.name = name;
        this.quantity = quantity;
        this.salePrice = salePrice;
    }

    public String getID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSalePrice() {
        return salePrice;
    }
}