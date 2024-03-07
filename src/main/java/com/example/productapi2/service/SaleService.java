package com.example.productapi2.service;

import com.example.productapi2.dto.saleDto.SaleRequestDto;

import java.util.List;

public interface SaleService {

    List<SaleRequestDto> getAll();


    SaleRequestDto getSaleById(int id);

    void addSalary(SaleRequestDto saleRequestDto);

    void deleteSalary(int id);


}
