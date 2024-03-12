package com.example.productapi2.service.impl;

import com.example.productapi2.dto.saleDto.SaleRequestDto;
import com.example.productapi2.entity.Sale;
import com.example.productapi2.entity.Warehouse;
import com.example.productapi2.mapper.SaleMapper;
import com.example.productapi2.repository.SaleRepository;
import com.example.productapi2.repository.WarehouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
@Component
@AllArgsConstructor
public class SaleImpl  {
    private final SaleRepository saleRepository;
    private final SaleMapper saleMapper;
    private final WarehouseRepository warehouseRepository;

    public List<SaleRequestDto> getAll() {
        return saleRepository.findAll().stream().map(saleMapper::toSaleDto).toList();
    }

    public SaleRequestDto getSaleById(int id) {
        return saleRepository.findById(id).stream().map(saleMapper::toSaleDto).findFirst().get();
    }

    public void addSalary(SaleRequestDto saleRequestDto) {

        Sale sale=saleMapper.toSale(saleRequestDto);
        sale.setTotalPrice(saleRequestDto.getPrice().multiply(saleRequestDto.getQuantity()).subtract(saleRequestDto.getVat()));


        saleRepository.save(sale);
        Warehouse warehouse=  warehouseRepository.findById(saleRequestDto.getFkWarehouseId()).get(); //?
        BigDecimal newQuantity=warehouse.getQuantity();
        warehouse.setQuantity(newQuantity.subtract(sale.getQuantity()));
        warehouseRepository.save(warehouse);


    }

    public void deleteSalary(int id) {

        saleRepository.deleteById(id);

    }
}
