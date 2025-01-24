package com.morgan.assignment.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Product {

        String name = "Mobile Phone";


        Product(){
                System.out.println("Product is Created ");
        }
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }


}
