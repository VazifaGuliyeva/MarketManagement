package com.example.productapi2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name="warehouses")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name="responsible_person")
    String responsiblePerson;
    @Column(name="product_no")
    String productNo;
    @Column(name="product_name")
    String productName;
    @Column(name="is_active")
    String isActive;
    BigDecimal quantity;
    @Column(name="product_group")
    String productGroup;
    @Column(name="product_category")
    String productCategory;
    BigDecimal vat;
    @Column(name="initial_price")
    BigDecimal initialPrice;
    @Column(name = "expire_date")
    Long expireDate;
        @Column(name="fk_category_id")
    Integer fkCategoryId;
//    @Column(name="fk_employee_id")
//    Integer fkEmployeeId;
    @Column(name="input_date")
    Long inputDate;

}
