package com.morgan.assignment.service;
import com.morgan.assignment.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public Product createProduct(Product product) {
        product.setId(counter.getAndIncrement());
        products.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = getProductById(id);
        product.setName(productDetails.getName());
        product.setStatus(productDetails.getStatus());
        return product;
    }

    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        products.remove(product);
    }
}
