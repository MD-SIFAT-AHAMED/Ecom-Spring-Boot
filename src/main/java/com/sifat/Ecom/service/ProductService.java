package com.sifat.Ecom.service;

import com.sifat.Ecom.model.Product;
import com.sifat.Ecom.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    private final ProductRepository repo;
    public ProductService(ProductRepository repo){
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getPorductById(int id) {
        return repo.findById(id).get();
    }
}
