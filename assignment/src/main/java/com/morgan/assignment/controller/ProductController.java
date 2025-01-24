package com.morgan.assignment.controller;


import com.morgan.assignment.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    Product productObject;

    int a;
    public ProductController(Product productObject){
        this.productObject  = productObject;
        String s = this.productObject.getName();
    }


    @GetMapping("/getProduct")
    public String getProduct(){

        return "Returned Product";
    }
}