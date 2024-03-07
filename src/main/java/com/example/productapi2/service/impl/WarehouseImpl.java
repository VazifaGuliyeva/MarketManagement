package com.example.productapi2.service.impl;

import com.example.productapi2.dto.WarehouseDto;
import com.example.productapi2.entity.Warehouse;
import com.example.productapi2.mapper.WarehouseMapper;
import com.example.productapi2.repository.WarehouseRepository;
import com.example.productapi2.service.WarehouseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class WarehouseImpl implements WarehouseService {
    private final WarehouseRepository warehouseRepository;
    private final WarehouseMapper warehouseMapper;
    @Override
    public List<WarehouseDto> getAll() {
        return warehouseRepository.findAll().stream().map(warehouseMapper::toWarehouseDto).toList();
    }

    @Override
    public WarehouseDto getWarehouseById(int id) {
        return warehouseRepository.findById(id).stream().map(warehouseMapper::toWarehouseDto).findFirst().get();
    }

    @Override
    public void addWarehouse(WarehouseDto warehouseDto) {

        Warehouse warehouse=warehouseMapper.toWareHouse(warehouseDto);

        warehouseRepository.save(warehouse);

    }

    @Override
    public void deleteWarehouse(int id) {

        warehouseRepository.deleteById(id);

    }
}
