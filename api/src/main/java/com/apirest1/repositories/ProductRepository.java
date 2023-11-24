package com.apirest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest1.entities.Products;

public interface ProductRepository extends JpaRepository<Products,Long>{

    
}
