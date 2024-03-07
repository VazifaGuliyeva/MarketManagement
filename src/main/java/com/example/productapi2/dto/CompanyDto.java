package com.example.productapi2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class CompanyDto {

    String name;
    String contact;
    String email;
    String address;
}
