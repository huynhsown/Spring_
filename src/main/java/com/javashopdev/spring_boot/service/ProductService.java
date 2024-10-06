package com.javashopdev.spring_boot.service;

import com.javashopdev.spring_boot.entities.ProductEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
