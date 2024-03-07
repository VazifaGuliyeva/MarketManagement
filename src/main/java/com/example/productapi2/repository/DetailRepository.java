package com.example.productapi2.repository;

import com.example.productapi2.entity.Detail;
import com.example.productapi2.service.DetailService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailRepository extends JpaRepository<Detail,Integer> {

    List<Detail> findAllByColor(String color);
}
