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

    private final UserService userService;
    private final ProductService shoeService;

    @Autowired
    public UserController(UserService userService, ProductService shoeService) {
        this.userService = userService;
        this.shoeService = shoeService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id).orElse(null);
    }

    @GetMapping("/products")
    public List<Shoe> getProducts() {
        return shoeService.fetchProducts();
    }

    @GetMapping("/checkProductStatus")
    public void checkProductStatus() {
        shoeService.checkProductStatus();
    }

    // Add endpoint for placing orders
    @PostMapping("/placeOrder")
    public void placeOrder(@RequestBody List<Orders<? extends ProductInterface>> orders) {
        // Add logic to handle order placement
    }
}
