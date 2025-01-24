package com.morgan.assignment.model;


import lombok.Data;
import org.springframework.stereotype.Component;


public class Product {

        String name = "Mobile Phone";
        int id;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
}
