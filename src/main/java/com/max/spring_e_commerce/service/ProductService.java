package com.max.spring_e_commerce.service;

import com.max.spring_e_commerce.model.Product;
import com.max.spring_e_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(int productId) {
        return productRepository.findById(productId).orElse(new Product());
    }
}
