package com.morgan.assignment.controller;


import com.morgan.assignment.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    Product obj = new Product();

    public ProductController(){
    }


    @GetMapping("/getProduct")
    public String getProduct(){
        return obj.getName();
    }
}