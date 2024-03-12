package com.example.productapi2.dto.warehouseDto;

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


    String productNo;
    String productName;
    BigDecimal quantity;
    BigDecimal vat;
    Integer productGroup;
    String isActive;
    Integer productCategory;
    BigDecimal initialPrice;
    Long inputDate;
    Long expireDate;
    String responsiblePerson;



}
