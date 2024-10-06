package com.javashopdev.spring_boot.repository;

import com.javashopdev.spring_boot.entities.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
