package api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import api.model.Orders;
import api.model.ProductInterface;
import api.model.Shoe;
import api.model.User;
import service.ProductService;
import service.UserService;

import java.util.List;

@RestController
public class UserController {
    /**
 * Kontrollerklassen `UserController` håndterer forespørsler knyttet til brukere og produkter.
 * Den er merket med `@RestController` for å indikere at den håndterer HTTP-forespørsler og gir JSON-respons.
 * Inkluderer metoder for å hente brukerinformasjon, hente produkter, sjekke produktstatus,
 * og plassere ordre.
 * Metoden `getUser` svarer på GET-forespørsler for brukerinformasjon basert på brukerens ID.
 * Metoden `getProducts` svarer på GET-forespørsler for å hente tilgjengelige produkter.
 * Metoden `checkProductStatus` svarer på GET-forespørsler for å sjekke produktstatus.
 * Metoden `placeOrder` svarer på POST-forespørsler for å plassere ordre med produkter.
 */

    private final UserService userService;
    private final ProductService productService;

    @Autowired
    public UserController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id).orElse(null);
    }

    @GetMapping("/products")
    public List<Shoe> getProducts() {
        return productService.fetchProducts();
    }

    @GetMapping("/checkProductStatus")
    public void checkProductStatus() {
        productService.checkProductStatus();
    }

    // Add endpoint for placing orders
    @PostMapping("/placeOrder")
    public void placeOrder(@RequestBody List<Orders<? extends ProductInterface>> orders) {
        // Add logic to handle order placement
    }
}
