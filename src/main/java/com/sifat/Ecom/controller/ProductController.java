package com.sifat.Ecom.controller;

import com.sifat.Ecom.model.Product;
import com.sifat.Ecom.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;
    public ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/")
    public String greet(){
        return "Hello Ecom";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
