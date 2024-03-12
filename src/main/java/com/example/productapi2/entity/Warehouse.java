package com.example.productapi2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name="warehouses")
public class Warehouse {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String id;
    String responsiblePerson;
    String productNo;
    String productName;
    String isActive;
    BigDecimal quantity;
    Integer productGroup;
    Integer productCategory;
    BigDecimal vat;
    BigDecimal initialPrice;
    Long expireDate;
    Integer fkCategoryId;
    Long inputDate;


    String fkProductId;

}
