package org.example.MyApiRest;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

        @RestController
        @RequestMapping("/products")
        public class ProductController {

            private List<Product> products = new ArrayList<>();

            @GetMapping
            public List<Product> getAllProducts() {
                return products;
            }

            @PostMapping
            public String addProduct(@RequestBody Product product) {
                products.add(product);
                return "Product added successfully";
            }
        }

