package com.example.productapi2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="orders")
public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String id;
    String category;
    String name;
    String fkWarehhouseId;
    String fkUserId;
    String fkProductId;















}
