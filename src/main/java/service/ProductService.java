import main.java.api.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>(); // Placeholder for products from the supplier

    public List<Product> fetchProducts() {
        // Simulated logic to fetch products from the hypothetical external supplier via REST API (example.com)
        // Simulated data to represent fetched products

        // Example: Here, we're imagining fetching data from "example.com"
        // This is a placeholder for actual API calls
        // Fetch products and populate the productList from the website "example.com"
        productList.add(new Product(1, "Brand X", "Model A", 8.5, "Black", 129.99));
        productList.add(new Product(2, "Brand Y", "Model B", 9.0, "Brown", 99.99));
        productList.add(new Product(3, "Brand Z", "Model C", 7.0, "Red", 149.99));

        return productList;
    }

    public void checkProductStatus() {
        // Simulated logic to check product status at the end of the day
        // Example: Mark products as 'onWayOut' or 'soldOut' based on certain criteria
        for (Product product : productList) {
            // Simulated logic: If the price is below 100, consider it 'on way out'; above 150, consider it 'sold out'
            if (product.getPrice() < 100) {
                product.setOnWayOut(true);
            }
            if (product.getPrice() > 150) {
                product.setSoldOut(true);
            }
        }
    }
}