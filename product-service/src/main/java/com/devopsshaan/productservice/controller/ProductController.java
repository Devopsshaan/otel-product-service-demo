package com.devopsshaan.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Map<String, Object>> getProducts() {

        return List.of(
                Map.of("id", "p1", "name", "Moon Rock", "price", 199.99),
                Map.of("id", "p2", "name", "Mars Dust", "price", 299.99),
                Map.of("id", "p3", "name", "Jupiter Gas Bottle", "price", 499.99)
        );
    }
}
