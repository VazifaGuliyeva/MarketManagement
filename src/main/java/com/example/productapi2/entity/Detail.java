package com.example.productapi2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name="details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Double price;
    LocalDateTime creationDate;
    LocalDateTime expireDate;
    String color;
    String description;
    String fileUrl;
}
