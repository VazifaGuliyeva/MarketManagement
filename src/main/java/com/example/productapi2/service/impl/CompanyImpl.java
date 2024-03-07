package com.example.productapi2.service.impl;

import com.example.productapi2.dto.CategoryDto;
import com.example.productapi2.dto.CompanyDto;
import com.example.productapi2.entity.Company;
import com.example.productapi2.mapper.CompanyMapper;
import com.example.productapi2.repository.CompanyRepository;
import com.example.productapi2.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CompanyImpl implements CompanyService  {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;
    @Override
    public List<CompanyDto> getAll() {
        return companyRepository.findAll().stream().map(companyMapper::toCompanyDto).toList();
    }

    @Override
    public CompanyDto getCompanyById(int id) {
        return companyRepository.findById(id).stream().map(companyMapper::toCompanyDto).findFirst().get();
    }

    @Override
    public void addCompany(CompanyDto companyDto) {

        Company company=new Company();

        company.setName(companyDto.getName());
        company.setAddress(companyDto.getAddress());
        company.setContact(companyDto.getContact());
        company.setEmail(companyDto.getEmail());

    }

    @Override
    public void deleteCompany(int id) {

        companyRepository.deleteById(id);

    }
}
