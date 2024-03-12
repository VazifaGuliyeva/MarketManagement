package com.example.productapi2.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="sales" )
public class Sale {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String id;
    @Column(name = "product_name")
    String productName;
    @Column(name = "delivery_date")
    Long deliveryDate;
    @Column(name = "payment_date")
    Long paymentDate;
    BigDecimal quantity;
    String unit;
    BigDecimal vat;
    BigDecimal price;
    @Column(name = "total_price")
    BigDecimal totalPrice;
    @Column(name = "fk_product_id")
    String fkProductId;
    @Column(name = "fk_warehouse_id")
    String fkWarehouseId;
    String productCategory;
}
