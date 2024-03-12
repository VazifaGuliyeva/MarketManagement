package com.example.productapi2.repository;

import com.example.productapi2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,String> {


    Product findAllByName(String name);
}
