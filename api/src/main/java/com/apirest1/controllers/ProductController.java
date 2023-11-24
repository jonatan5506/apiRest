package com.apirest1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest1.entities.Products;
import com.apirest1.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
    
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<Products> findProducts(){
        return repository.findAll();
    }
}
