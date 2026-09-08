package com.example.retailShopSystem.repository;

import com.example.retailShopSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
