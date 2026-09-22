package com.max.spring_e_commerce.controller;

import com.max.spring_e_commerce.model.Product;
import com.max.spring_e_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable int productId) {
        return productService.getProduct(productId);
    }
}
