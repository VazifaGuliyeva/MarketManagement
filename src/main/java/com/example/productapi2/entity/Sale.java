package com.example.productapi2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name="sales")
public class Sale {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    @Column(name="delivery_date")
    Long deliveryDate;
    @Column(name="payment_date")
    Long paymentDate;

    BigDecimal quantity;
    BigDecimal vat;
    BigDecimal price;
    @Column(name="total_price")
    BigDecimal totalPrice;
//    @Column(name="fk_product_id")
//    Integer fkProductId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_warehouse_id", referencedColumnName="id")
    Warehouse fkWarehouseId;
}
