package com.example.productapi2.repository;

import com.example.productapi2.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    List<Object> findById(Warehouse fkWarehouseId);
}
