package com.example;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Map<String, String> products = Map.of(
        "101", "Product A",
        "102", "Product B"
    );

    @GetMapping("/{id}")
    public String getProductById(@PathVariable String id) {
        return products.getOrDefault(id, "Unknown Product");
    }
}
