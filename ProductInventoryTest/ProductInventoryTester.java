import java.util.Iterator;

public class ProductInventoryTester {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Create products
        Product p1 = new Product("Laptop", 10, 999.99);
        Product p2 = new Product("Mouse", 20, 25.50);
        Product p3 = new Product("Keyboard", 30, 75.00);

        // Test insertProduct()
        System.out.println("Insert Laptop: " + inventory.insertProduct(p1));
        System.out.println("Insert Mouse: " + inventory.insertProduct(p2));
        System.out.println("Insert Keyboard: " + inventory.insertProduct(p3));

        // Test duplicate product name
        Product duplicate = new Product("Laptop", 5, 899.99);
        System.out.println("Insert duplicate Laptop: "
                + inventory.insertProduct(duplicate) + " (should be false)");

        // Test Product getters
        System.out.println("\nProduct information:");
        System.out.println("ID: " + p1.getID());
        System.out.println("Name: " + p1.getName());
        System.out.println("Quantity: " + p1.getQuantity());
        System.out.println("Sale Price: " + p1.getSalePrice());

        // Test findProduct()
        System.out.println("\nFind product by name:");
        Product foundByName = inventory.findProduct("Mouse");
        if (foundByName != null) {
            System.out.println("Found: " + foundByName.getName());
        } else {
            System.out.println("Product not found");
        }

        // Test findProductByID()
        System.out.println("\nFind product by ID:");
        Product foundByID = inventory.findProductByID(p3.getID());
        if (foundByID != null) {
            System.out.println("Found: " + foundByID.getName());
        } else {
            System.out.println("Product not found");
        }

        // Test searching for a product that does not exist
        System.out.println("\nFind missing product:");
        Product missing = inventory.findProduct("Phone");
        System.out.println("Result: " + missing + " (should be null)");

        // Test getProducts()
        System.out.println("\nAll products:");
        Iterator<Product> products = inventory.getProducts();

        while (products.hasNext()) {
            Product product = products.next();

            System.out.println(
                product.getID() + " | "
                + product.getName() + " | Quantity: "
                + product.getQuantity() + " | Price: $"
                + product.getSalePrice()
            );
        }
    }
}