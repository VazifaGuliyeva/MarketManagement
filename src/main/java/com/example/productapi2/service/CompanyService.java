package com.example.productapi2.service;

import com.example.productapi2.dto.CategoryDto;
import com.example.productapi2.dto.CompanyDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CompanyService {

    List<CompanyDto> getAll();


    CompanyDto getCompanyById(int id);

    void addCompany(CompanyDto companyDto);

    void deleteCompany(int id);
}
