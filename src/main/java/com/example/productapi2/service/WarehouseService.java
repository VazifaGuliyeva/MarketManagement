package com.example.productapi2.service;

import com.example.productapi2.dto.WarehouseDto;

import java.util.List;

public interface WarehouseService {

    List<WarehouseDto> getAll();


    WarehouseDto getWarehouseById(int id);

    void addWarehouse(WarehouseDto warehouseDto);

    void deleteWarehouse(int id);
}
