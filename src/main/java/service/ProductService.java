package service;



import org.springframework.stereotype.Service;
import api.model.Shoe;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    /**
 * BRUKER DETTE BARE FOR Å VISE OPSETT BLIR FJERNET ETTERSOM AT ALL KOMMUNIKASJON OM PRODUCTER ER VIA EKSTERN LEVERANDØR
 * Tjenesteklassen `ProductService` håndterer operasjoner knyttet til produkter.
 * Den er merket med `@Service` for å indikere at den skal håndteres av Spring som en tjeneste.
 * Inkluderer metoder for å hente produkter og sjekke produktstatus.
 * Produktliste initialiseres som en plassholder for produkter fra leverandøren.
 * Metoden `fetchProducts` simulerer henting av produkter fra en ekstern leverandør via en simulert REST API.
 * Metoden `checkProductStatus` simulerer sjekk av produktstatus ved dagens slutt.
 */
    
    private List<Shoe> productList = new ArrayList<>(); // Placeholder for products from the supplier

    public List<Shoe> fetchProducts() {
        // Simulated logic to fetch products from the hypothetical external supplier via REST API (example.com)
        // Simulated data to represent fetched products

        // Example: Here, we're imagining fetching data from "example.com"
        // This is a placeholder for actual API calls
        // Fetch products and populate the productList from the website "example.com"
        productList.add(new Shoe(1, "Brand X", "Model A", 8.5, "Black", 129.99));
        productList.add(new Shoe(2, "Brand Y", "Model B", 9.0, "Brown", 99.99));
        productList.add(new Shoe(3, "Brand Z", "Model C", 7.0, "Red", 149.99));

        return productList;
    }

    public void checkProductStatus() {
        // Simulated logic to check product status at the end of the day
        // Example: Mark products as 'onWayOut' or 'soldOut' based on certain criteria
        
    }
}