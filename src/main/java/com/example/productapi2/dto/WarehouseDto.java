package com.example.productapi2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class WarehouseDto {


    String responsiblePerson;
    String productNo;
    String productName;
    String isActive;
    BigDecimal quantity;
    String productGroup;
    String productCategory;
    BigDecimal vat;
    BigDecimal initialPrice;
    Long expireDate;
//    Integer fkEmployeeId;
    Long inputDate;



}
