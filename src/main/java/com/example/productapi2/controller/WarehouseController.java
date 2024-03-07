package com.example.productapi2.controller;

import com.example.productapi2.dto.WarehouseDto;
import com.example.productapi2.service.impl.WarehouseImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
@AllArgsConstructor
public class WarehouseController {

    private final WarehouseImpl warehouseImpl;

    @GetMapping
    public List<WarehouseDto> getAll(){
       return warehouseImpl.getAll();
    }

    @GetMapping("/{id}")
    public WarehouseDto getSaleById(@PathVariable int id){
        return warehouseImpl.getWarehouseById(id);
    }
    @PostMapping
    public void addWarehouse(@RequestBody WarehouseDto warehouseDto){
        warehouseImpl.addWarehouse(warehouseDto);
    }
    @DeleteMapping("/{id}")
    public void deleteWarehouse(@PathVariable int id){
        warehouseImpl.deleteWarehouse(id);
    }
}
