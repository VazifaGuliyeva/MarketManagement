package com.example.productapi2.repository;

import com.example.productapi2.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Integer> {

    Optional<Sale> findSaleByFkWarehouseId(String warehouseId);
}
