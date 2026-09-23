package com.max.spring_e_commerce.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
