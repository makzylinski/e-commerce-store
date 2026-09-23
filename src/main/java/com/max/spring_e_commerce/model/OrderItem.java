package com.max.spring_e_commerce.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private int id;
    private Product product;
    private int quantity;
    private BigDecimal totalPrice;
    private Order order;
}
