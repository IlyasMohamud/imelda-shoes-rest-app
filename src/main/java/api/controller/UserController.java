import main.java.api.model.Product;
import main.java.api.model.User;
import main.java.service.ProductService;
import main.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    private final ProductService productService;

    @Autowired
    public UserController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping("/user")
    public User getUser(Integer id) {
        return userService.getUser(id).orElse(null);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.fetchProducts();
    }

    @GetMapping("/checkProductStatus")
    public void checkProductStatus() {
        productService.checkProductStatus();
    }
}
