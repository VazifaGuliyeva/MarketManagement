package com.example.productapi2.service.impl;

import com.example.productapi2.dto.warehouseDto.WarehouseDto;
import com.example.productapi2.entity.Warehouse;
import com.example.productapi2.mapper.WarehouseMapper;
import com.example.productapi2.repository.WarehouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class WarehouseImpl  {
    private final WarehouseRepository warehouseRepository;
    private final WarehouseMapper warehouseMapper;
    public List<WarehouseDto> getAll() {
        return warehouseRepository.findAll().stream().map(warehouseMapper::toWarehouseDto).toList();
    }

    public WarehouseDto getWarehouseById(String id) {
        return warehouseRepository.findById(id).stream().map(warehouseMapper::toWarehouseDto).findFirst().get();
    }

    public void addWarehouse(WarehouseDto warehouseDto) {

        Warehouse warehouse=warehouseMapper.toWareHouse(warehouseDto);

        warehouseRepository.save(warehouse);

    }

    public void deleteWarehouse(String id) {

        warehouseRepository.deleteById(id);

    }
}
