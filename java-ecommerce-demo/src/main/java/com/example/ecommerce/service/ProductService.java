package com.example.ecommerce.service;

import java.util.*;
import com.example.ecommerce.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return List.of(
            new Product(1, "Laptop", 800.0),
            new Product(2, "Phone", 500.0),
            new Product(3, "Headphones", 100.0)
        );
    }
}
