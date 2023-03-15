package com.example.api.service.impl;

import java.util.List;

import com.example.api.entity.Product;
import com.example.api.repository.ProductRepository;
import com.example.api.service.ProductService;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product>searchProducts(String query){
        List<Product> products=productRepository.searchProductsSQL((query));
        return products;
    }

    @Override
    public  Product createProduct(Product product){
        return productRepository.save(product);
    }
}
