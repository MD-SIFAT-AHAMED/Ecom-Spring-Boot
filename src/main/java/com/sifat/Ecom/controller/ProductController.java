package com.sifat.Ecom.controller;

import com.sifat.Ecom.model.Product;
import com.sifat.Ecom.service.ProductService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getPorductById(id);
    }
}
