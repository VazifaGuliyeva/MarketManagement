package com.example.productapi2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class EmployeeDto {

    String fullName;
    Boolean is_Active;
    Double salary;
    String status;
    LocalDateTime contarctExpireddDate;
    String position;

    String companies;
}
