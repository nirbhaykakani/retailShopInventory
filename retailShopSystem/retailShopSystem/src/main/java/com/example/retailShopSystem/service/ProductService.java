package com.example.retailShopSystem.service;

import com.example.retailShopSystem.entity.Product;
import com.example.retailShopSystem.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product updateQuantity(Long id, int quantity) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setQuantity(quantity);
        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}