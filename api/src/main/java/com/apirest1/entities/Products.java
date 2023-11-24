package com.apirest1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter//Anotation do Lombok para gerar Getter e Setter
@Setter
@Entity
@Table(name = "tb_products")
public class Products {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;

    public Products(){

    }
}
