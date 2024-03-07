package com.example.productapi2.controller;

import com.example.productapi2.dto.saleDto.SaleRequestDto;
import com.example.productapi2.service.impl.SaleImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
@AllArgsConstructor
public class SaleController {

    private final SaleImpl saleImpl;

    @GetMapping
    public List<SaleRequestDto> getAll(){
        return saleImpl.getAll();
    }


    @GetMapping("/{id}")
    public SaleRequestDto getSaleById(@PathVariable int id){
        return saleImpl.getSaleById(id);
    }
    @PostMapping
    public void addSalary(@RequestBody SaleRequestDto saleRequestDto){
        saleImpl.addSalary(saleRequestDto);

    }
    @DeleteMapping("/{id}")
    public void deleteSalary(@PathVariable int id){
        saleImpl.deleteSalary(id);
    }


}
