package com.example.productapi2.repository;

import com.example.productapi2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {


    List<Category> findAllByItem(String item);
}
