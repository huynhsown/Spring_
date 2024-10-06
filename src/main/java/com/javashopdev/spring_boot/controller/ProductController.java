package com.javashopdev.spring_boot.controller;

import com.javashopdev.spring_boot.entities.ProductEntity;
import com.javashopdev.spring_boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public ProductEntity createProduct(ProductEntity product){
        return productService.createProduct(product);
    }

    /**
     * List All
     * @return List
     * */

    @GetMapping("/products")
    public List<ProductEntity> findAllProducts(){
        return productService.findAllProducts();
    }

}
