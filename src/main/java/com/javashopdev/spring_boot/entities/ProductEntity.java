package com.javashopdev.spring_boot.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data // Thay the cho get set
public class ProductEntity {
    private Long id;
    private String productName;
    private BigDecimal productPrice;
}
