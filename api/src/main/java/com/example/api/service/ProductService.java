package com.example.api.service;

import java.util.List;

import com.example.api.entity.Product;

public interface ProductService {
    List<Product>searchProducts(String query);

    Product createProduct(Product product);
}
