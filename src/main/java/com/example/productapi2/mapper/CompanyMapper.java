package com.example.productapi2.mapper;

import com.example.productapi2.dto.CompanyDto;
import com.example.productapi2.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    CompanyDto toCompanyDto(Company company);

    Company toCompany(CompanyDto companyDto);
}
