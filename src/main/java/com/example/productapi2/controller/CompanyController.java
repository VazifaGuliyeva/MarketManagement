package com.example.productapi2.controller;

import com.example.productapi2.dto.CompanyDto;
import com.example.productapi2.service.impl.CompanyImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@AllArgsConstructor
public class CompanyController {

    private final CompanyImpl companyImpl;
    @GetMapping
    public List<CompanyDto> getAll(){
        return companyImpl.getAll();
    }
    @GetMapping("/{id}")
    public CompanyDto getCompanyById(@PathVariable int id){
        return companyImpl.getCompanyById(id);
    }
    @PostMapping

    public void addCompany(@RequestBody CompanyDto companyDto){
        companyImpl.addCompany(companyDto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        companyImpl.deleteCompany(id);
    }
}
