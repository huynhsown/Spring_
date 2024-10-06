package com.javashopdev.spring_boot.repository.impl;

import com.javashopdev.spring_boot.entities.ProductEntity;
import com.javashopdev.spring_boot.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Son Dang Add");
        productEntity.setProductPrice(new BigDecimal("100000.0"));
        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Son Dang");
        productEntity.setProductPrice(new BigDecimal("100000.0"));
        return List.of(productEntity);
    }
}
